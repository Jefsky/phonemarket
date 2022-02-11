package cn.huateng.bean;

public class OrderDetail {
	private int id;           			
	private String orderid;   			
	private String phoneid;    			
	private String phonename;  			
	private String name; 				//³ö°æÉçÃû³Æ
	private float unitprice;			
	private int ordernum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(float unitprice) {
		this.unitprice = unitprice;
	}
	public int getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(int ordernum) {
		this.ordernum = ordernum;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", orderid=" + orderid + ", phoneid="
				+ phoneid + ", phonename=" + phonename + ", name=" + name
				+ ", unitprice=" + unitprice + ", ordernum=" + ordernum + "]";
	}
	
	
}
