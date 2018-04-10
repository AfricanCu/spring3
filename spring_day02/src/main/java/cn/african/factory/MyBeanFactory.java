package cn.african.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import cn.african.aspect.MyAspect;
import cn.african.service.UserService;
import cn.african.service.UserServiceImpl;

public class MyBeanFactory {

	public static UserService createService() {
		// 1. 目标类
		UserService userService = new UserServiceImpl();
		// 2. 切面类
		MyAspect myAspect = new MyAspect();
		// 3. 代理类：将目标类和切面类结合
		/**
		 * Proxy.newInstance
		 * 	参数1：loader，类加载器，因为动态代理类是在运行的时候创建，所以需要类加载器将代理类加载到内存，
		 * 					其实任何类都需要类加载器将其字节码文件加载到内存。
		 * 			一般使用当前类.class.getClassLoader();
		 * 			或者目标类实例.getClass().getClassLoader();
		 * 	参数2：Class[] interfaces 代理类需要实现的所有接口
		 * 			一般有两种写法：
		 * 				方式1：目标类实例.getClass().getInterfaces(); 只能获得自己的接口，不能获得父类的接口
		 * 				方式2：new Class[]{UserService.class}
		 * 	参数3：InvocationHandler 处理类，这是一个接口，必须进行实现，一般采用匿名内部类来实现。
		 * 			该接口提供了invoke方法，代理类的每一个方法执行时，都将调用一次invoke方法，invoke有三个参数：
		 * 			参数1：proxy， 代理对象
		 * 			参数2：method，代理对象当前执行的方法的描述对象
		 * 					获取执行方法名：method.getName()
		 * 					执行方法：method.invoke(对象，实际参数);
		 * 			参数3：args，方法的参数
		 */
		UserService proxyService = (UserService)Proxy.newProxyInstance(
									MyBeanFactory.class.getClassLoader(), 
									userService.getClass().getInterfaces(), 
									new InvocationHandler() {
										@Override
										public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
											//前执行
											myAspect.before();
											System.out.println("-------" + method.getName());
											//执行目标类的方法
											Object obj = method.invoke(userService, args);
											//后执行
											myAspect.after();
											return obj;
										}
									});
		return proxyService;
	}
}
