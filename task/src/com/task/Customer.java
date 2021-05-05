package com.task;

public class Customer implements Comparable<Customer> {
	private int custmid;
	private String name;
	private long mobileno;
	private String emailid;
	private String dob;
	private String address;
	private long cardnum;
	private int cvv;
	private String expdate;
	private int balance;

	public Customer(int custmid, String name, long mobileno, String emailid, String dob, String address, long cardnum,
			int cvv, String expdate, int balance) {
		super();
		this.custmid = custmid;
		this.name = name;
		this.mobileno = mobileno;
		this.emailid = emailid;
		this.dob = dob;
		this.address = address;
		this.cardnum = cardnum;
		this.cvv = cvv;
		this.expdate = expdate;
		this.balance = balance;
	}

	public int getCustmid() {
		return custmid;
	}

	public void setCustmid(int custmid) {
		this.custmid = custmid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getCardnum() {
		return cardnum;
	}

	public void setCardnum(long cardnum) {
		this.cardnum = cardnum;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public int compareTo(Customer cust) {
		// return this.balance-cust.balance; // asscending order
		return cust.balance - this.balance;
		// System.out.println(customers.get(customers.size()-1));
		/*if (cust.balance != this.balance) {
			return cust.balance - this.balance;
		} else {
			return this.name.compareTo(cust.name);
		}*/
	}

	@Override
	public String toString() {
		return "Customer [custmid=" + custmid + ", name=" + name + ", mobileno=" + mobileno + ", emailid=" + emailid
				+ ", dob=" + dob + ", address=" + address + ", cardnum=" + cardnum + ", cvv=" + cvv + ", expdate="
				+ expdate + ", balance=" + balance + "]";
	}

}
