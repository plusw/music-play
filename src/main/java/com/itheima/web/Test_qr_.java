package com.itheima.web;

import com.itheima.mapper.SongMapper;
import com.itheima.pojo.Song;
//import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import com.alibaba.fastjson.JSON;

@WebServlet("/test")
/**
 * Mybatis 快速入门代码
 */
public class Test_qr_ extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		try (CloseableHttpClient httpclient = HttpClients.createDefault()) {

            //HTTP GET method
            HttpGet httpget = new HttpGet("http://httpbin.org/get");
            System.out.println("Executing request " + httpget.getRequestLine());

            // Create a custom response handler
            ResponseHandler < String > responseHandler = response - > {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            };
            String responseBody = httpclient.execute(httpget, responseHandler);
            System.out.println("----------------------------------------");
            System.out.println(responseBody);
		}
		*/
		//System.out.println("servlet");
		/*
		request.setCharacterEncoding("UTF-8");	
		String qrcode="";
		//try{
			qrcode = request.getParameter("qrcode");
		//}
		//catch(Exception e){
		//}
		System.out.println(qrcode);
       
	   

		response.setContentType("text/html;charset=UTF-8"); 
		response.getWriter().print("qrcode"+qrcode);
		//response.getWriter().print("hello");
*/
		




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}