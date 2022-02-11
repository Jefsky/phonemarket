package cn.huateng.bean;

public class Employee {
	 private String employeeid;
	 private String name;
	 private String password;
	 private String gender;
	 private String address;
	 private String email;
	 private String phone;
	 private String task;
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name
				+ ", password=" + password + ", gender=" + gender
				+ ", address=" + address + ", email=" + email + ", phone="
				+ phone + ", task=" + task + "]";
	}
	 
}
