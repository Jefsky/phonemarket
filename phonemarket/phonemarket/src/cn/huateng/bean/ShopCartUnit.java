package cn.huateng.bean;
/**
 * 此类代表购物车中的一种商品
 * @author Administrator
 *
 */

public class ShopCartUnit {
	private String phoneid;    			//书号
	private String phonename;  			//书名
	private String name; 			//出版社
	private float unitprice;			//单价--一本书的价格
	private int ordernum; 				//订购数量
	private float subamount;            //单项价格--一种书的价格
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
	public float getSubamount() {
		return subamount;
	}
	public void setSubamount(float subamount) {
		this.subamount = subamount;
	}
	@Override
	public String toString() {
		return "ShopCartUnit [phoneid=" + phoneid + ", phonename=" + phonename
				+ ", name=" + name + ", unitprice=" + unitprice + ", ordernum="
				+ ordernum + ", subamount=" + subamount + "]";
	}
	
}


