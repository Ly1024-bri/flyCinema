package com.cn.flyCinema.web.servlet;

import com.cn.flyCinema.entity.ResultInfo;
import com.cn.flyCinema.entity.User;
import com.cn.flyCinema.service.UserService;
import com.cn.flyCinema.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet {
    private UserService us = new UserServiceImpl();
    private ResultInfo info = new ResultInfo();
    //登录 需前端判断输入是否为空
    public void userLogin(HttpServletRequest request,HttpServletResponse response) throws Exception{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User loginUser = us.findUser(username,password);
        if (loginUser==null){
            info.setFlag(false);
            info.setErrorMsg("用户名或密码错误");
        }else {
            //自动登录
            String autoLogin = request.getParameter("autoLogin");
            if (autoLogin != null && !autoLogin.equals("")){
                //存入cookie;
                Cookie _username = new Cookie("username",loginUser.getUsername());
                Cookie _password = new Cookie("password",loginUser.getPassword());
                //设置持久化时间
                _username.setMaxAge(60*60);
                _password.setMaxAge(60*60);
                //设置携带路径
                _username.setPath(request.getContextPath());
                _password.setPath(request.getContextPath());
                //发送cookie
                response.addCookie(_password);
                response.addCookie(_username);
            }
            info.setFlag(true);
            request.getSession().setAttribute("username",loginUser.getUsername());
            request.getSession().setAttribute("password",loginUser.getPassword());
            request.getSession().setAttribute("loginUser",loginUser);
        }
        Json(response,info);
    }
    //注册
    public void regUser(HttpServletRequest request,HttpServletResponse response) throws IOException {
        User user = new User();
        try {
            BeanUtils.populate(user,request.getParameterMap());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        boolean isReg = us.reg(user);
        ResultInfo info = new ResultInfo();
        info.setFlag(isReg);
        if(!isReg){
            info.setErrorMsg("注册失败");
        }
        response.setContentType("application/json;charset=utf-8");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getOutputStream(),info);
    }
    //正在登录的用户
    public void isLogin(HttpServletRequest request,HttpServletResponse response) throws Exception{
        User user = (User)request.getSession().getAttribute("loginUser");
        Json(response,user);
    }
    //退出
    public void exit(HttpServletRequest request,HttpServletResponse response) throws Exception{
        request.getSession().removeAttribute("loginUser");
        response.sendRedirect(request.getContextPath()+"/login.html");
    }
    //注册时检验该用户名是否存在
    public void CheckUser(HttpServletRequest request,HttpServletResponse response) throws Exception {
        String username = request.getParameter("username");
        boolean flag = us.findUserByUname(username);//true表示库中有

        info.setFlag(!flag);
        Json(response,info);
    }
    //修改个人信息 需前端判断输入是否为空
    public void updateUser(HttpServletRequest request,HttpServletResponse response) throws Exception{
        Map<String, String[]> map = request.getParameterMap();
        User user = new User();
        BeanUtils.populate(user,map);
        us.update(user);
    }
    public void active(HttpServletRequest request,HttpServletResponse response) throws IOException {
        //邮箱激活
        String code = request.getParameter("code");
        boolean flag = us.active(code);
        response.setContentType("text/html;charset=utf-8");
        if(flag){
            response.sendRedirect(request.getContextPath()+"/login.html");
        }else {
            response.getWriter().write("邮箱激活失败！联系管理员");
        }
    }
}
