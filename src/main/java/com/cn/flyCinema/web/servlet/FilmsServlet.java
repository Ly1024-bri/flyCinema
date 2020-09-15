package com.cn.flyCinema.web.servlet;

import com.cn.flyCinema.entity.Movie;
import com.cn.flyCinema.entity.ResultInfo;
import com.cn.flyCinema.service.FilmsService;
import com.cn.flyCinema.service.impl.FilmsServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@WebServlet(value = "/films/*")
public class FilmsServlet extends BaseServlet {
    ResultInfo resultInfo = new ResultInfo();
    FilmsService filmsService = new FilmsServiceImpl();

    public void findHottestFilms(HttpServletRequest request, HttpServletResponse response) throws IOException {

        List<Movie> list = filmsService.findHottestFilms();

        resultInfo.setData(list);

        writeValue(response, resultInfo);
    }

    public void findWillShowFilms(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Movie> list = filmsService.findWillShowFilms();

        resultInfo.setData(list);

        writeValue(response, resultInfo);
    }

    public void dateFormat(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String date = request.getParameter("date");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss 'GMT'Z", Locale.ENGLISH);
        Date date1 = null;
        try {
            date1 = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年M月d日");
        String date2 = simpleDateFormat1.format(date1);

        resultInfo.setData(date2);
        writeValue(response, resultInfo);
    }

    public void findFilmsByScore(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Movie> list = filmsService.findFilmsByScore();
        resultInfo.setData(list);
        writeValue(response, resultInfo);
    }

    public void findNewestFilmsByDate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Movie> list = filmsService.findNewestFilmsByDate();
        resultInfo.setData(list);
        writeValue(response, resultInfo);
    }
}
