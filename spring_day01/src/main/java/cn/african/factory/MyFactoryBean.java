package cn.african.factory;

import org.springframework.beans.factory.FactoryBean;

import cn.african.service.impl.UserServiceImpl;

public class MyFactoryBean<T> implements FactoryBean<T> {

	@Override
	public T getObject() throws Exception {
		return (T) new UserServiceImpl();
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
