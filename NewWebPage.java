package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import uca-mis4390-database-wrapper;
import uca.OracleWrapper;
public class NewWebPage extends HttpServlet
{

	private static final long serialVersionUID = 10L;
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  
	{
//---------------SQL TABLE------------------------------------------------------------------------------------------------------		
		try {

			OracleWrapper.prepareStatement("SELECT * FROM TB_STATUS_T");
			ResultSet rs = OracleWrapper.queryDB();
			
		} catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		} // end catch
//-----------------------------------------------------------------------------------------------------------------------------		

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//String name = request.getParameter("filename");
		System.out.println(new java.io.File(".").getCanonicalPath());
		BufferedReader br = new BufferedReader(new FileReader("src/text/web.txt"));

		String html = "";
		String oneLine = "";
		while( ( oneLine = br.readLine()) != null )
		{
			html += oneLine;
		}

		br.close();

		out.print(html);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
	}
}


