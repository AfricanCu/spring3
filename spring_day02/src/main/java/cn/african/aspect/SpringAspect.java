package cn.african.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SpringAspect implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("before");
		Object object = invocation.proceed();
		System.out.println("after");
		return object;
	}
}
