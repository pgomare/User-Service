package com.tcs.microservice.UserService.bean;

public class UserBean {

	private Long id;
	private String name;
	private String lname;
	private String city;
	private String password;
	private Boolean flag;
	
	

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	public UserBean(Long id, String name, String lname, String city, String password, Boolean flag) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.city = city;
		this.password = password;
		this.flag = flag;
	}

	public UserBean() {
		// TODO Auto-generated constructor stub
	}

}
