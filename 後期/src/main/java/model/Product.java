package model;

import java.io.Serializable;

public class Product implements Serializable {

	private String product_no;
	private String pname;
	private String category;
	private String photo;
	private int price;
	private String explanations;
	private String materials;

	public Product() {}

	public Product(String product_no, String pname, String category, String photo, int price) {
		this.product_no = product_no;
		this.pname = pname;
		this.category = category;
		this.photo = photo;
		this.price = price;
	}

	public Product(String product_no, String pname, String category, String photo, int price, String explanations,
			String materials) {
		this.product_no = product_no;
		this.pname = pname;
		this.category = category;
		this.photo = photo;
		this.price = price;
		this.explanations = explanations;
		this.materials = materials;
	}

	public String getProduct_no() {
		return product_no;
	}

	public String getPname() {
		return pname;
	}

	public String getCategory() {
		return category;
	}

	public String getPhoto() {
		return photo;
	}

	public int getPrice() {
		return price;
	}

	public String getExplanations() {
		return explanations;
	}

	public String getMaterials() {
		return materials;
	}

}
