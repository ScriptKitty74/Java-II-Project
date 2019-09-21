package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import uca.OracleWrapper;
public class NewWebPage extends HttpServlet
{

	private static final long serialVersionUID = 10L;
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			OracleWrapper.openConn();
			OracleWrapper.prepareStatement("SELECT NAME FROM SERVICES WHERE SORTCATEGORY = 10 ");
			ResultSet rs = OracleWrapper.queryDB();
			ArrayList <String> allServices = new ArrayList();
			while(rs.next())
			{

				allServices.add(rs.getString(1));

			}
			//serviceName = rs.getString(1);

			//Read my web.txt file
			System.out.println(new java.io.File(".").getCanonicalPath());
			BufferedReader br = new BufferedReader(new FileReader("src/text/web.txt"));

			//declare a string html and store in it all the line from web.txt
			String html = "";
			String oneLine = "";

			while( ( oneLine = br.readLine()) != null)
			{
				String placeHolder1 = " ";
				if (oneLine.contentEquals("<<<placeHolder1>>>"))
				{

					placeHolder1 = "<table style = \"float:right; margin-right:500px; margin-top:-6px;" +
							" border:2px solid #663399;\"><td rowspan=\"50\">"+
							"<textarea rows=\"30\" cols=\"112\"></textarea></td>"+
							"</table>";

					html +=placeHolder1;
				}

				//				if (oneLine.contentEquals(""))
				//				{
				//					html = eachOne.substring(eachOne.indexOf("<<<placeHolder2>>>=") + 1, eachOne.indexOf("<<<placeHolder2>>>, "));
				//					OracleWrapper db = new OracleWrapper();
				//					db.prepareStatement("INSERT NAME FROM SERVICE WHERE SORTCATEGORY = 10",placeHolder, eachOne.getPlaceHolder());
				//				}
				else if(oneLine.contentEquals("<<<placeHolder2>>>"))
				{
					String placeHolder2 = " ";
					for(String eachOne: allServices)
					{
						//String bgcolor = i%2 == 1?" " : "\"lightgray\"";

						placeHolder2 = "<tr bgcolor = " + "> <td style = \"font-size:120%;" +
								"\" width=\"200\" height=\"27\">"+ eachOne + "</td>" +
								"<td width=\"100\" height=\"27\"><font color = \"limegreen\">UP</font></td> </tr>";
					}

					html += placeHolder2;
				}

				else if(oneLine.contentEquals("<<<placeHolder3>>>"))
				{
					String placeHolder3 = " ";
					placeHolder3= "<table style =\"float:right; margin-right:70px;" +
							" margin-top:10px; border:2px solid #663399;\"> <td rowspan=70>"+
							"<textarea rows=\"2\" cols=\"173\"></textarea></td></table>"; 

					html +=placeHolder3;
				}


				else

					html += oneLine;	
			}

			br.close();

			out.print(html);

			OracleWrapper.closeConn();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} // end catch
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}
}


