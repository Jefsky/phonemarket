package cn.huateng.bean;
/**
 * ��������ﳵ�е�һ����Ʒ
 * @author Administrator
 *
 */

public class ShopCartUnit {
	private String phoneid;    			//���
	private String phonename;  			//����
	private String name; 			//������
	private float unitprice;			//����--һ����ļ۸�
	private int ordernum; 				//��������
	private float subamount;            //����۸�--һ����ļ۸�
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


