package com.cn.flyCinema.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.List;

@WebServlet(value = "/films/*")
public class FilmsServlet extends HttpServlet {
    public void findHottestFilms() {
        FilmsService filmsService = new FilmsServiceImpl();
        List list = filmsService.findHottestFilms();
    }
}