package mytest;
import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns={"/Test",""})
@MultipartConfig
public class ServiceServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		
		try
		{
			System.out.println(request.getRequestURL());
			String urlString=request.getRequestURL().toString();
			String route=urlString.substring(urlString.lastIndexOf("/"));
			
			switch(route)
			{
				case "/Test" :
				 this.putJsonImage(request,response);
				 break;
			}
			
		}
		catch(Exception e){}
	}
	
	private void putJsonImage(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		
		PrintWriter out=response.getWriter();
		
		MultipartExtractor extractor=new MultipartExtractor(request);
		String json=extractor.getFormData("data");
		byte[] data=extractor.getBinaryData("file1");
		
		FileOutputStream FileOut=new FileOutputStream("../webapps/third/강아지2.jpg");
		
		
		int size;
		while((size=in.read(data))!=-1)
		{
			FileOut.write(data,0,size);
			FileOut.flush();
		}
		
		System.out.println(json);
		System.out.println(data.length);
		
		out.println("{\"success\":1}");
		
	}
}