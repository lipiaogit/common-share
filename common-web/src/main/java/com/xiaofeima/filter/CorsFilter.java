package com.shengsu.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CorsFilter extends OncePerRequestFilter {
    @Override  
    protected void doFilterInternal(HttpServletRequest request,  
            HttpServletResponse response, FilterChain filterChain)  
            throws ServletException, IOException {  
    	response.setHeader("Access-Control-Allow-Credentials","true");
        response.addHeader("Access-Control-Allow-Origin", "*");  
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE,OPTIONS"); 
        response.addHeader("Access-Control-Allow-Headers", "x-requested-with,content-type,Authorization");  
        response.addHeader("Access-Control-Max-Age", "1800");// 30 min  
        filterChain.doFilter(request, response);
    }

} 