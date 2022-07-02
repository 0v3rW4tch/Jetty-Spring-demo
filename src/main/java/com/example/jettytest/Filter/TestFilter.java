package com.example.jettytest.Filter;


import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


//@Component
public class TestFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        Map<String, Object> data = new HashMap();
        data.put("errorCode", 401);
        data.put("message", "未授权");

        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            System.out.println(cookies);
        }


        if (cookies == null){
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", -1L);
            response.setContentType("application/json; charset=utf-8");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(data.toString());
            response.flushBuffer();

            return;
        }else{
            chain.doFilter(request,response);
        }
    }
}
