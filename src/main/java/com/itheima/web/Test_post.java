package com.itheima.web;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.commons.lang.StringUtils;
//import org.apache.log4j.Logger;

//import com.alibaba.dubbo.common.utils.IOUtils;
//import com.lenovo.service.BusinessService;
//import com.lenovo.utils.WebContext;

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

@WebServlet("/test_post")
/**
 * Mybatis 快速入门代码
 */
public class Test_post extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
		String str = "";
		String wholeStr = "";
		while((str = reader.readLine()) != null){//一行一行的读取body体里面的内容；
			wholeStr += str;
		} 
		response.getWriter().println(wholeStr);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}