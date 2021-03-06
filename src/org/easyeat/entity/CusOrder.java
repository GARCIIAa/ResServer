package org.easyeat.entity;

public class CusOrder {
	private String id;
	private String finish;
	private String reservetime;// 用户预定堂食时间
	private String customernum;// 订单中预定来就餐的人数
	private String price;
	private String ready;// 订单中的菜品是否准备完成
	private String phone;
	private String sirormiss;
	private String sex;
	private String cusid;
	private String ordertime;
	private String ps;// 备注
	private String sellerid;
	private String ispaid;
	private String resname;
	private String dishcount;
	public CusOrder(String id, String finish, String reservetime, String customernum, String price, String ready,String phone,
			String sirormiss, String sex, String cusid, String ordertime, String ps, String sellerid, String ispaid) {
		this.id = id;
		this.finish = finish;
		this.reservetime = reservetime;
		this.customernum = customernum;
		this.price = price;
		this.ready = ready;
		this.phone = phone;
		this.sirormiss = sirormiss;
		this.sex = sex;
		this.cusid = cusid;
		this.ordertime = ordertime;
		this.ps = ps;
		this.sellerid = sellerid;
		this.ispaid = ispaid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFinish() {
		return finish;
	}
	public void setFinish(String finish) {
		this.finish = finish;
	}
	public String getReservetime() {
		return reservetime;
	}
	public void setReservetime(String reservetime) {
		this.reservetime = reservetime;
	}
	public String getCustomernum() {
		return customernum;
	}
	public void setCustomernum(String customernum) {
		this.customernum = customernum;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getReady() {
		return ready;
	}
	public void setReady(String ready) {
		this.ready = ready;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSirormiss() {
		return sirormiss;
	}
	public void setSirormiss(String sirormiss) {
		this.sirormiss = sirormiss;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCusid() {
		return cusid;
	}
	public void setCusid(String cusid) {
		this.cusid = cusid;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public String getSellerid() {
		return sellerid;
	}
	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}
	public String getIspaid() {
		return ispaid;
	}
	public void setIspaid(String ispaid) {
		this.ispaid = ispaid;
	}
	public String getResname() {
		return resname;
	}
	public void setResname(String resname) {
		this.resname = resname;
	}
	public String getDishcount() {
		return dishcount;
	}
	public void setDishcount(String dishcount) {
		this.dishcount = dishcount;
	}
	
}
