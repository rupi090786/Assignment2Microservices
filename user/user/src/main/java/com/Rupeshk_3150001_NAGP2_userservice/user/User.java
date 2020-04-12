package com.Rupeshk_3150001_NAGP2_userservice.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "Name")
	private String Name;
	
	@Column(name = "Age")
	private Integer Age;
	
	@Column(name = "Email")
	private String Email;
	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param email
	 */
	public User(Integer id, String name, Integer age, String email) {
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
		return "User [id=" + id + ", Name=" + Name + ", Age=" + Age + ", Email=" + Email + "]";
	}
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
