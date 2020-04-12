package com.Rupeshk_3150001_NAGP2_aggregateservice.aggregate;


public class aggregateorder {
	
	private Integer id;
	private String Name;
	private Integer Age;
	private String Email;
	
	public aggregateorder(Integer id, String name, Integer age, String email) {
		super();
		this.id = id;
		Name = name;
		Age = age;
		Email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "aggregateorder [id=" + id + ", Name=" + Name + ", Age=" + Age + ", Email=" + Email + "]";
	}
}