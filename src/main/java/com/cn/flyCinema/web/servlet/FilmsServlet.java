package com.cn.flyCinema.web.servlet;

import com.cn.flyCinema.entity.Movie;
import com.cn.flyCinema.entity.ResultInfo;
import com.cn.flyCinema.service.FilmsService;
import com.cn.flyCinema.service.impl.FilmsServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/films/*")
public class FilmsServlet extends BaseServlet {
    ResultInfo resultInfo = new ResultInfo();
    FilmsService filmsService = new FilmsServiceImpl();

    public void findHottestFilms(HttpServletRequest request, HttpServletResponse response) throws IOException {

        List<Movie> list = filmsService.findHottestFilms();


        resultInfo.setData(list);

        writeValue(response, resultInfo);
    }
}
