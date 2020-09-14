package com.cn.flyCinema.web.filter;

import com.cn.flyCinema.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        Cookie[] cookies = request.getCookies();
        HttpServletResponse response = (HttpServletResponse) resp;
        User loginUser = (User) request.getSession().getAttribute("loginUser");
        String username = null;
        String password = null;
        if (cookies != null){
            for (Cookie cookie:cookies) {
                if (cookie.getName().equals("username")){
                    username = cookie.getValue();
                }
                if (cookie.getName().equals("password")){
                    password = cookie.getValue();
                }
            }
        }
        if (username != null && password != null){
            if (username.equals(loginUser.getUname()) && password.equals(loginUser.getPassword())){
                request.getSession().setAttribute("loginUser",loginUser);
                request.getRequestDispatcher("index.html").forward(request,response);
            }
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
