package mytest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.MultipartConfig;
import java.io.*;
import mytest.util.*;
import com.google.gson.Gson;

@WebServlet(urlPatterns = {"/Test", ""})
@MultipartConfig
public class ServiceServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try{
			System.out.println(request.getRequestURL());
			String urlString = request.getRequestURL().toString();
			String route = urlString.substring(urlString.lastIndexOf("/"));
		
			switch(route){
				case "/Test" : 
					this.putJsonImage(request, response);
					break;
			}
		}catch(Exception e){}
	}
	
	private void putJsonImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		
		MultipartExtractor extractor = new MultipartExtractor(request);
		
		String jsonString = extractor.getFormData("data");
		
		
		FileOutputStream fileOut = new FileOutputStream("../webapps/third/file.jpg");
		byte[] data = extractor.getBinaryData("file1");
		
		System.out.println(jsonString);
		fileOut.write(data);
		fileOut.flush();
		fileOut.close();
		/* System.out.println(jsonString);
		System.out.println(data.length); */
		
		out.println("{\"success\":1}");
	}
}