package project;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.ResultSet;
//import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import uca.OracleWrapper;

public class WebPage extends HttpServlet {
	private static final long serialVersionUID = 10L;
	
	long uniqueID = java.util.Calendar.getInstance().getTimeInMillis();

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		//try {
			//OracleWrapper.openConn();
			//OracleWrapper.prepareStatement("SELECT * FROM MESSAGES WHERE STATUS = 1?", request.getParameter("id"));

			//ResultSet rs = OracleWrapper.queryDB();
			//List<Service> allServices = new ArrayList<Service>();
			out.println("<!DOCTYPE html><html>");
			out.println("<head><style>");

			out.println("body {width: 1330px; height: 679px; border: 4px solid #663399;} ");
			out.println("h1{width: 1100px; height: 50px; color: purple; } ");
			out.println("</style></head><body>");



			out.println("<table border= \"0\" bordercolor= \"red\" width= \"1330\" >");
			out.println("<tr  width= \"2900\" height= \"90\"><td width= \"430\" height= \"25\"> <img src=\"images/UCA_logo.png\" width= \"380\" height= \"130\"> </td>");
			out.println("<td style= \"font-size:250%;\"> <font color=\"RebeccaPurple\">INFORMATION TECHNOLOGY SERVICES</font></td></tr>");
			out.println("</table>");

			out.println("<table style = \"float:right; margin-right:500px; margin-top:-6px; border:2px solid #663399;\">");
			out.println("<td rowspan=\"50\"><textarea rows=\"30\" cols=\"112\"></textarea></td>");
			out.println("</table>");

			out.println("<table style = \"float:right; margin-right:70px; margin-top:-470px; border-collapse:collapse;\"  border=\"1\" bordercolor=\"black\" width=\"400\">");
			out.println("<tr style = \"font-size:120%;\" bgcolor = \"RebeccaPurple\">"); 
			out.println("<td border = \"0\" width=\"210\" height=\"27\"><font color = \"white\">Services</font></td>");
			out.println("<td width=\"100\" height=\"27\"> <font color = \"white\">Status</font></td>"); 
			out.println("</tr>"); 
			
			out.println("<tr style = \"font-size:120%;\">"); 
			out.println("<td width=\"200\" height=\"27\"> Banner </td>"); 
			out.println("<td width=\"100\" height=\"27\"><font color = \"limegreen\">UP</font></td>"); 
			out.println("</tr>"); 

			out.println("<tr bgcolor = \"lightgray\">"); 
			out.println("<td style = \"font-size:120%;\" width=\"200\" height=\"27\"> BlackBoard </td>"); 
			out.println("<td style = \"font-size:80%;\" width=\"100\" height=\"27\"><font color = \"blue\">Maintenance Scheduled</font></td>"); 
			out.println("</tr>");

			out.println("<tr style = \"font-size:120%;\">"); 
			out.println("<td width=\"200\" height=\"27\">Building Wifi</td>"); 
			out.println("<td width=\"100\" height=\"27\"><font color = \"limegreen\">UP</font></td>"); 
			out.println("</tr>"); 


			out.println("<tr style = \"font-size:120%;\" bgcolor = \"lightgray\">"); 
			out.println("<td width=\"200\" height=\"27\"> Google Drive</td>"); 
			out.println("<td width=\"100\" height=\"27\"><font color = \"limegreen\">UP</font></td>"); 
			out.println("</tr>"); 


			out.println("<tr style = \"font-size:120%;\">"); 
			out.println("<td width=\"200\" height=\"25\"> Google Gmail</td>"); 
			out.println("<td width=\"100\" height=\"25\"><font color = \"limegreen\">UP</font></td>"); 
			out.println("</tr>"); 


			out.println("<tr style = \"font-size:120%;\" bgcolor = \"lightgray\">"); 
			out.println("<td width=\"200\" height=\"27\"> Internet Access</td>"); 
			out.println("<td width=\"100\" height=\"27\"><font color = \"red\">DOWN</font></td>"); 
			out.println("</tr>"); 



			out.println("<tr style = \"font-size:120%;\">"); 
			out.println("<td width=\"200\" height=\"27\"> Keyless Door Locks</td>"); 
			out.println("<td width=\"100\" height=\"27\"><font color = \"yellow\">Repairing</font></td>"); 
			out.println("</tr>"); 



			out.println("<tr style = \"font-size:120%;\" bgcolor = \"lightgray\">"); 
			out.println("<td width=\"200\" height=\"27\"> myUCA </td>"); 
			out.println("<td width=\"100\" height=\"27\"><font color = \"orange\">Developing</font></td>"); 
			out.println("</tr>"); 


			out.println("<tr style = \"font-size:120%;\">"); 
			out.println("<td width=\"200\" height=\"27\"></td>"); 
			out.println("<td width=\"100\" height=\"27\"></td>");  
			out.println("</tr>"); 



			out.println("<tr style = \"font-size:120%;\" bgcolor = \"lightgray\">"); 

			out.println("<td width=\"200\" height=\"27\"></td>"); 

			out.println("<td width=\"100\" height=\"27\"></td>"); 

			out.println("</tr>"); 


			out.println("<tr style = \"font-size:120%;\">"); 
			out.println("<td width=\"200\" height=\"27\"></td>"); 
			out.println("<td width=\"100\" height=\"27\"></td>"); 
			out.println("</tr>"); 


			out.println("<tr style = \"font-size:120%;\" bgcolor = \"lightgray\">"); 
			out.println("<td width=\"200\" height=\"27\"></td>"); 
			out.println("<td width=\"100\" height=\"27\"></td>"); 
			out.println("</tr>"); 


			out.println("<tr style = \"font-size:120%;\">"); 
			out.println("<td width=\"200\" height=\"27\"></td>"); 
			out.println("<td width=\"100\" height=\"27\"></td>"); 
			out.println("</tr>"); 


			out.println("<tr style = \"font-size:120%;\" bgcolor = \"lightgray\">"); 
			out.println("<td width=\"200\" height=\"27\"></td>"); 
			out.println( "<td width=\"100\" height=\"27\"></td>"); 
			out.println("</tr>"); 
			out.println("</table>"); 
			out.println("<br></br>"); 


			out.println("<table style =\"float:right; margin-right:70px; margin-top:10px; border:2px solid #663399;\">"); 
			out.println("<td rowspan=70><textarea rows=\"2\" cols=\"173\"></textarea></td>"); 
			out.println("</table>"); 


			out.println("</body>"); 

			out.println("</html>"); 
			//OracleWrapper.closeConn();
		//}catch (SQLException e) {
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		//} // end catch
	
	
}

@Override
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
	
}

}

