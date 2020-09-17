package com.cn.flyCinema.web.servlet;

import com.cn.flyCinema.entity.Movie;
import com.cn.flyCinema.entity.PageBean;
import com.cn.flyCinema.service.FilmsService;
import com.cn.flyCinema.service.impl.FilmsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/BackgroundServlet/*")
public class BackgroundServlet extends BaseServlet {
    private FilmsService filmsService = new FilmsServiceImpl();

    protected void findAllMovies(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PageBean<Movie> pageBean = filmsService.findAll();
    }
}
