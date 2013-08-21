package com.db.blb.beans;

public class Bond {
	private String cusip;
	private String rating;
	private double coupon;
	private double currentYield;
	private double yieldToMaturity;
	private long maturityDate;
	private double price;
	private long qtyAvailable;
	
	public Bond(String cusip, String rating, double coupon,
			double currentYield, double yieldToMaturity, long maturityDate,
			double price, long qtyAvailable) {
		super();
		this.cusip = cusip;
		this.rating = rating;
		this.coupon = coupon;
		this.currentYield = currentYield;
		this.yieldToMaturity = yieldToMaturity;
		this.maturityDate = maturityDate;
		this.price = price;
		this.qtyAvailable = qtyAvailable;
	}

	public String getCusip() {
		return cusip;
	}
	public void setCusip(String cusip) {
		this.cusip = cusip;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public double getCoupon() {
		return coupon;
	}
	public void setCoupon(double coupon) {
		this.coupon = coupon;
	}
	public double getCurrentYield() {
		return currentYield;
	}
	public void setCurrentYield(double currentYield) {
		this.currentYield = currentYield;
	}
	public double getYieldToMaturity() {
		return yieldToMaturity;
	}
	public void setYieldToMaturity(double yieldToMaturity) {
		this.yieldToMaturity = yieldToMaturity;
	}
	public long getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(long maturityDate) {
		this.maturityDate = maturityDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getQtyAvailable() {
		return qtyAvailable;
	}
	public void setQtyAvailable(long qtyAvailable) {
		this.qtyAvailable = qtyAvailable;
	}
}
