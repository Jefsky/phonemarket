package cn.huateng.bean;

public class UserInfo {

 private int userid;
 private String username;
 private String password;
 private String gender;
 private String address;
 private String email;
 private String phone;
 private String postcode;
 private int state;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
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
public String getPostcode() {
	return postcode;
}
public void setPostcode(String postcode) {
	this.postcode = postcode;
}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
}
public String toString() {
	return "UserInfo [userid=" + userid + ", username=" + username
			+ ", password=" + password + ", gender=" + gender + ", address="
			+ address + ", email=" + email + ", phone=" + phone + ", postcode="
			+ postcode + ", state=" + state + "]";
}
 
}