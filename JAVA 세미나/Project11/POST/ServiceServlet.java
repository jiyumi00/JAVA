package mytest;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.net.*;

@WebServlet(urlPatterns={"/Test","/Test2","/Test3",""}) //url주소 
public class ServiceServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		
		try
		{
			System.out.println(request.getRequestURL());
			String urlString=request.getRequestURL().toString();
			
			String route=urlString.substring(urlString.lastIndexOf("/")); 
			
			switch(route)
			{
				case "/Test" : 
					this.putJson(request,response);
					break;
					
				case "/Test2" :
					this.putImage(request,response);
					break;
				
			}
		}
		catch(Exception e) {} //
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			System.out.println(request.getRequestURL());
			String urlString=request.getRequestURL().toString();
			
			String route=urlString.substring(urlString.lastIndexOf("/"));
			
			switch(route)
			{
				case "/Test3":
					this.makeJson(request,response);
					break;
					
			}
			
		}
		catch(Exception e) {}
	}
	
	
	private void makeJson(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
		response.setContentType("image/jpeg"); //response로 내보낸다 
		
		OutputStream out=response.getOutputStream();
		
		String id=request.getParameter("id");
		String name=URLDecoder.decode(request.getParameter("name"),"utf-8");
		
		FileInputStream fileIn =new FileInputStream(id+".jpg");
		
		byte[] data=new byte[1024*8];
		int size;
		while((size=fileIn.read(data))!=-1)
		{
			out.write(data,0,size);
			out.flush();
			
		}
		fileIn.close();
		
		System.out.println(name);
		
	}
	private void putJson(HttpServletRequest request, HttpServletResponse response) throws Exception //우리가 만든 메소드
	{
		request.setCharacterEncoding("utf-8"); //Client에서 오는 request의 body는 "uft-8"로 받는다
		response.setContentType("text/plain; charset=utf-8");
		PrintWriter out=response.getWriter();/////
		
		InputStream in=request.getInputStream();
		
		byte []data=new byte[1024];
		int size;
		
		StringBuilder message=new StringBuilder();
		//String message="";
		
		while((size=in.read(data))!=-1)
		{
			//message=message+new String(data,
			message.append(new String(data,0,size,"utf-8"));
			System.out.println(message.toString());
		}
		out.println(message.toString());
		
		
		
	}
	
	private void putImage(HttpServletRequest request, HttpServletResponse response) throws Exception  //
	{
		response.setContentType("text/plain; charset=utf-8");
		InputStream in=request.getInputStream();
		PrintWriter out=response.getWriter();
		
		FileOutputStream FileOut=new FileOutputStream("../webapps/second/강아지2.jpg");
		
		byte [] data=new byte[1024];
		int size;
		while((size=in.read(data))!=-1)
		{
			FileOut.write(data,0,size);
			FileOut.flush();
		}
		
		String jsonString="{\"success\":1,\"name\":\"정지윤\"}";
		out.println(jsonString);
	}
	
	
}