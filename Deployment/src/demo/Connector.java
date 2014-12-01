package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Connection
 */
public class Connector extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connector() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("Connected to the server !");
		out.print("</body>");
		out.print("</html>");
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		}
	    catch (ClassNotFoundException e) {
	    	out.println("cannot load the database , please come back later !");
	    }
		
		Connection conn =null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","rayban");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.print("fuck");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
