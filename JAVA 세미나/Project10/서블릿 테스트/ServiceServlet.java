package mytest;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/Test","/Test2",""}) //url주소 
public class ServiceServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		
		try
		{
			System.out.println(request.getRequestURL());
			String urlString=request.getRequestURL().toString();
			
			String route=urlString.substring(urlString.lastIndexOf("/")); 
			
			switch(route)
			{
				case "/Test" : 
					this.getJson(request,response);
					break;
					
				case "/Test2" :
					this.getImage(request,response);
					break;
				
			}
		}
		catch(Exception e) {} //
		
	}
	
	
	private void getJson(HttpServletRequest request, HttpServletResponse response) throws Exception //우리가 만든 메소드
	{
		response.setContentType("text/plain; charset=utf-8");
		PrintWriter out=response.getWriter();
		
		out.println("{\"success\":1,\"name\":\"정지윤\"}");	
		
	}
	
	private void getImage(HttpServletRequest request, HttpServletResponse response) throws Exception  //
	{
		response.setContentType("image/jpeg;");
		OutputStream out=response.getOutputStream();
		//File file=new File("../webapps/first/test00.jpg");
		FileInputStream fileIn=new FileInputStream("../webapps/first/test00.jpg");
		
		byte [] data=new byte[1024];
		int size;
		while((size=fileIn.read(data))!=-1)
		{
			out.write(data,0,size);
			out.flush();
		}
		fileIn.close();
	}
	
}