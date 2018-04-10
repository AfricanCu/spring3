package cn.african.service;

public interface AccountService {

	/** 转账 **/
	public void transfer(String outer, String inner, Integer money);

}
