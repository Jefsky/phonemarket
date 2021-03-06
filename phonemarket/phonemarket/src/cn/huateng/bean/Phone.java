package cn.huateng.bean;

public class Phone {
	private String phoneid;
	private String phonename;
	private String platform;
	private String weight;
	private String display;
	private String camera;
	private String ram;
	private String massmenory;
	private int companyid;
	private float price;
	private int quantity;
	private String  picture;
	private int type;
	public String getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(String phoneid) {
		this.phoneid = phoneid;
	}
	public String getPhonename() {
		return phonename;
	}
	public void setPhonename(String phonename) {
		this.phonename = phonename;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getMassmenory() {
		return massmenory;
	}
	public void setMassmenory(String massmenory) {
		this.massmenory = massmenory;
	}
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Phone [phoneid=" + phoneid + ", phonename=" + phonename
				+ ", platform=" + platform + ", weight=" + weight
				+ ", display=" + display + ", camera=" + camera + ", ram="
				+ ram + ", massmenory=" + massmenory + ", companyid="
				+ companyid + ", price=" + price + ", quantity=" + quantity
				+ ", picture=" + picture + ", type=" + type + "]";
	}
	
	
	
}
