package com.Medplus_Traders.Medplus_Traders.Details;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Medplus_Details")
public class Details 
{
	@Id
	@GeneratedValue()
	@Column(name = "code")
	private String code;
	@Column(name = "name")
	private String name;
	@Column(name = "batch")
	private String batch;
	@Column(name = "stock")
	private int stock;
	@Column(name = "deal")
	private int deal;
	@Column(name = "free")
	private int free;
	@Column(name = "mrp")
	private double mrp;
	@Column(name = "rate")
	private double rate;
	@Column(name = "exp")
	private Date exp;
	@Column(name = "Company")
	private String Company;
	@Column(name = "Supplier")
	private String Supplier;
	
	public Details(String code, String name, String batch, int stock, int deal, int free, double mrp, double rate, Date exp,
			 String Company, String Supplier) {
		super();
		this.code = code;
		this.name = name;
		this.batch = batch;
		this.stock = stock;
		this.deal = deal;
		this.free = free;
		this.mrp = mrp;
		this.rate = rate;
		
		this.Company = Company;
		this.Supplier = Supplier;
	}

	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getDeal() {
		return deal;
	}

	public void setDeal(int deal) {
		this.deal = deal;
	}

	public int getFree() {
		return free;
	}

	public void setFree(int free) {
		this.free = free;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	

	public Date getExp() {
		return exp;
	}

	public void setExp(Date exp) {
		this.exp = exp;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		this.Company = Company;
	}

	public String getSupplier() {
		return Supplier;
	}

	public void setSupplier(String supplier) {
		this.Supplier = Supplier;
	}

	@Override
	public String toString() {
		return "Details [code=" + code + ", name=" + name + ", batch=" + batch + ", stock=" + stock + ", deal=" + deal
				+ ", free=" + free + ", mrp=" + mrp + ", rate=" + rate + ", exp=" + exp + ", company=" + Company
				+ ", supplier=" + Supplier + "]";
	}

	
	
	
	

}
