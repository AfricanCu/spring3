package cn.african.service.impl;

import cn.african.service.UserService;

public class UserServiceImpl implements UserService {
	
	public void init() {
		System.out.println("初始化");
	}

	@Override
	public void addUser() {
		System.out.println("add user");
	}
	
	public void destroy() {
		System.out.println("销毁");
	}
	
}
