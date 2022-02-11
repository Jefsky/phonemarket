package cn.huateng.bean;

public class Company {
	 private int companyid;
	 private String name;
	 private String address;
	 private String website;
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	@Override
	public String toString() {
		return "Company [companyid=" + companyid + ", name=" + name
				+ ", address=" + address + ", website=" + website + "]";
	}

	 

}
