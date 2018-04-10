package cn.african.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void out(String outer, Integer money) {
		String sql = "update account set money = money - ? where username = ?";
		this.getJdbcTemplate().update(sql, money, outer);
	}

	@Override
	public void in(String inner, Integer money) {
		String sql = "update account set money = money + ? where username = ?";
		this.getJdbcTemplate().update(sql, money, inner);
	}

}
