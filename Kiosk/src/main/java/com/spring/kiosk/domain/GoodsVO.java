package com.spring.kiosk.domain;

public class GoodsVO {
	
	/*
	create table kio_goods (
		    gdid number not null,
		    gdcate varchar2(50) not null,
		    gdname varchar2(50) not null,
		    gdprice number not null,
		    gdstock number not null,
		    gdimg varchar2(100) not null,
		    gdthumimg varchar2(100) not null,
		    gddes varchar2(1000) not null
		);
	*/
	
	private int gdId;
	private int gdCate;
	private String gdName;
	private int gdPrice;
	private int gdStock;
	private String gdImg;
	private String gdThumbImg;
	private String gdDes;
	
	public int getGdId() {
		return gdId;
	}
	public void setGdId(int gdId) {
		this.gdId = gdId;
	}
	public int getGdCate() {
		return gdCate;
	}
	public void setGdCate(int gdCate) {
		this.gdCate = gdCate;
	}
	public String getGdName() {
		return gdName;
	}
	public void setGdName(String gdName) {
		this.gdName = gdName;
	}
	public int getGdPrice() {
		return gdPrice;
	}
	public void setGdPrice(int gdPrice) {
		this.gdPrice = gdPrice;
	}
	public int getGdStock() {
		return gdStock;
	}
	public void setGdStock(int gdStock) {
		this.gdStock = gdStock;
	}
	public String getGdImg() {
		return gdImg;
	}
	public void setGdImg(String gdImg) {
		this.gdImg = gdImg;
	}
	public String getGdThumbImg() {
		return gdThumbImg;
	}
	public void setGdThumbImg(String gdThumbImg) {
		this.gdThumbImg = gdThumbImg;
	}
	public String getGdDes() {
		return gdDes;
	}
	public void setGdDes(String gdDes) {
		this.gdDes = gdDes;
	}
	@Override
	public String toString() {
		return "GoodsVO [gdId=" + gdId + ", gdCate=" + gdCate + ", gdName=" + gdName + ", gdPrice=" + gdPrice
				+ ", gdStock=" + gdStock + ", gdImg=" + gdImg + ", gdThumbImg=" + gdThumbImg + ", gdDes=" + gdDes + "]";
	}
	
	
	
	
}
