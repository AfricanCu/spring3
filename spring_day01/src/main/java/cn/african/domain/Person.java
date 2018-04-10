package cn.african.domain;

public class Person {

	private String pname;
	private Integer age;
	private Address homeAddr;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getHomeAddr() {
		return homeAddr;
	}

	public void setHomeAddr(Address homeAddr) {
		this.homeAddr = homeAddr;
	}

	@Override
	public String toString() {
		return "Person [pname=" + pname + ", age=" + age + ", homeAddr=" + homeAddr + "]";
	}

}
