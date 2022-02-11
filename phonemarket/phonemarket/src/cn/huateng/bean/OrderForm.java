package cn.huateng.bean;

public class OrderForm {
	private String orderid;			//������
	private String orderdate;		//��������
	private String userid;			//�û�ID
	private int totalnum;			//����ͼ������
	private float totalamount;		//�ܽ��
	private String payment;			//���ѷ�ʽ
	private String deliver;			//�ͻ���ʽ
	private String receiver;		//�ջ���
	private String address;			//��ϵ��ַ
	private String phone;			//��ϵ�绰
	private String postcode;		//�ռ����ʱ�
	private int state;				//����״̬
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getTotalnum() {
		return totalnum;
	}
	public void setTotalnum(int totalnum) {
		this.totalnum = totalnum;
	}
	public float getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(float totalamount) {
		this.totalamount = totalamount;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getDeliver() {
		return deliver;
	}
	public void setDeliver(String deliver) {
		this.deliver = deliver;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	@Override
	public String toString() {
		return "OrderForm [orderid=" + orderid + ", orderdate=" + orderdate
				+ ", userid=" + userid + ", totalnum=" + totalnum
				+ ", totalamount=" + totalamount + ", payment=" + payment
				+ ", deliver=" + deliver + ", receiver=" + receiver
				+ ", address=" + address + ", phone=" + phone + ", postcode="
				+ postcode + ", state=" + state + "]";
	}
	
}
