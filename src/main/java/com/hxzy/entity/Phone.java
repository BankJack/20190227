package com.hxzy.entity;

import java.util.Date;

public class Phone {
	private Integer pId;
	private String pName;
	private Brand brand;
	private Double price;
	private Integer cores;
	private Integer ram;
	private Integer rom;
	private Integer os;
	private Integer count;
	private Date date;
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getCores() {
		return cores;
	}
	public void setCores(Integer cores) {
		this.cores = cores;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public Integer getRom() {
		return rom;
	}
	public void setRom(Integer rom) {
		this.rom = rom;
	}
	public Integer getOs() {
		return os;
	}
	public void setOs(Integer os) {
		this.os = os;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Phone(Integer pId, String pName, Brand brand, Double price, Integer cores, Integer ram, Integer rom,
			Integer os, Integer count, Date date) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.brand = brand;
		this.price = price;
		this.cores = cores;
		this.ram = ram;
		this.rom = rom;
		this.os = os;
		this.count = count;
		this.date = date;
	}
	public Phone() {
		super();
	}
	@Override
	public String toString() {
		return "Phone [pId=" + pId + ", pName=" + pName + ", brand=" + brand + ", price=" + price + ", cores=" + cores
				+ ", ram=" + ram + ", rom=" + rom + ", os=" + os + ", count=" + count + ", date=" + date + "]";
	}
	
}
