package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class kadai04
 */
@WebServlet("/Kadai04")
public class Kadai04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uname = request.getParameter("uname");
		String ruby = request.getParameter("ruby");
		String mail = request.getParameter("mail");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String tel = request.getParameter("tel");
		String postal = request.getParameter("postal");
		String address = request.getParameter("address");
		String checkDM = request.getParameter("checkDM");

		response.setContentType("text/html charset=uff-8");
		PrintWriter out = response.getWriter();
		out.println("<!DCOTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-i\">");
		out.println("<title>Sample04(Form)</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>内容確認</h1>");
		out.println("<p>お名前：" + uname + "<br>");
		out.println("ルビー：" + ruby + "<br>");
		out.println("メールアドレス：" + mail + "<br>");
		String outputPassword = "";
		if (password.length() < 8 || confirmPassword.length() < 8) {
			out.println("パスワード：文字数が足りません" + "<br>");
		} else {
			if (password.equals(confirmPassword)) {
				for (int i = 0; i <= password.length(); i++) {
					outputPassword += "*";
				}
				out.println("パスワード：" + outputPassword + "<br>");
			} else {
				out.println("パスワード：一致しません" + "<br>");
			}
		}
		out.println("電話番号：" + tel + "<br>");
		out.println("郵便番号：" + postal + "<br>");
		out.println("住所：" + address + "<br>");
		if (checkDM != null && checkDM.equals("1")) {
			out.println("希望する");
		} else {
			out.println("希望しない");
		}
		out.println("</body>");
		out.println("</html>");
	}

}
