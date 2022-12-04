package com.crud.bean;

import java.util.Date;

public class BoardVO {
	private int id;
	private String name;
	private String address;
	private String foodName;
	private String flavor;
	private int takeOut;
	private String request;
	private Date regdate;
	private int price;
	private int cnt;
	private String photo;

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPhoto() {
		return photo;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getFoodName() {
		return foodName;
	}

	public String getFlavor() {
		return flavor;
	}

	public int getTakeOut() {
		return takeOut;
	}

	public String getRequest() {
		return request;
	}

	public Date getRegdate() {
		return regdate;
	}

	public int getPrice() {
		return price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public void setTakeOut(int takeOut) {
		this.takeOut = takeOut;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
