package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.GetProductLogic;
import model.Product;

/**
 * Servlet implementation class Kadai10
 */
@WebServlet("/ProductDetail")
public class Kadai10 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pname = request.getParameter("pname");
		GetProductLogic getProductList = new GetProductLogic();
		List<Product> productList = getProductList.selectProduct(pname);;
		

		request.setAttribute("productList", productList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/kadai10.jsp");
		dispatcher.forward(request, response);
	}

}
