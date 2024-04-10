package com.order;

public class Order {
	
	// declare variables
	private int orderID;
	private int qty;
	private float total;
	private String status;
	private String partCode;
	private String custID;
	
	// creating the constructor
	public Order(int orderID, int qty, float total, String status, String partCode, String custID) {
		
		super();
		this.orderID = orderID;
		this.qty = qty;
		this.total = total;
		this.status = status;
		this.partCode = partCode;
		this.custID = custID;
	}

	public int getOrderID() {
		return orderID;
	}

	

	public int getQty() {
		return qty;
	}

	

	public float getTotal() {
		return total;
	}

	

	public String getStatus() {
		return status;
	}
	
	public String getPartCode() {
		return partCode;
	}
	
	public String getcustID() {
		return custID;
	}

	
	

}
