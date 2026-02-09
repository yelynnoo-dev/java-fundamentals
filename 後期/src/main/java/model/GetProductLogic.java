package model;

import java.util.List;

import dao.ProductsDAO;

public class GetProductLogic {
	
	public List<Product> selectProduct(String pname){
		ProductsDAO dao = new ProductsDAO();
		List<Product> productList = dao.findProduct(pname);
		return productList;
		
	}
}
