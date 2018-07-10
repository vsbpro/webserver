package org.vsb.webserver;

public class TestPojo {
	String name;
	String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String toString() {
		return "TestPojo: name->"+name+", age->"+age;
	}
}
