package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sample04
 */
@WebServlet("/Sample04")
public class Sample04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		
		response.setContentType("text/html charset=uff-8");
		 PrintWriter out = response.getWriter();
		 out.println("<!DCOTYPE html>");
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<meta charset=\"utf-i\">");
		 out.println("<title>Sample04(Form)</title>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<h1>登録ありがとうございました</h1>");
		 out.println("<p>お名前：" + name + "さん<br>");
		 out.println("年齢：" + age + "<br>");
		 out.println("住所：" + address + "</p>");
		 out.println("</body>");
		 out.println("</html>");
	}

}
