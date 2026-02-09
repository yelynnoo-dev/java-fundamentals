package model;

import java.io.Serializable;

public class Cart implements Serializable {
	private String pname;
	private int pnumber;
	
	public Cart(){}
	public Cart(String pname,int pnumber){
		this.pname=pname;
		this.pnumber=pnumber;
	}
	public String getPname() {
		return pname;
	}
	public int getPnumber() {
		return pnumber;
	}
	
}
