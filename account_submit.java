package test_javaee;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/test_sql")
public class account_submit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE");
		  resp.setHeader("Access-control-Max-Age", "3600");
		  resp.setHeader("Access-Control-Allow-Origin", "*");
		  resp.setHeader("Access-control-allow-Headers", "x-requested-with");
		resp.setHeader("Access-control-allow-Credentials", "true");resp.setContentType("text/html; charset=UTF-8");
		connection_databases str = new connection_databases();
		PrintWriter print = resp.getWriter();
		print.print("<a>hello world</a>");
		print.flush();
		print.close();
		/*
		 * int acount =str.send("3423", "3423", "false", "hello");
		 * System.out.println("发送信息是否成功："+acount);
		 */
																 
		/*
		 * List<Map> get =str.message();
		 * System.out.println("服务器储存内容信息："+get.toString());
		 */
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
