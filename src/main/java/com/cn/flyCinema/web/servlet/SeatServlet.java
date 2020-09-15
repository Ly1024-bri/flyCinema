package com.cn.flyCinema.web.servlet;

import com.cn.flyCinema.entity.ResultInfo;
import com.cn.flyCinema.entity.Seating;
import com.cn.flyCinema.service.SeatsService;
import com.cn.flyCinema.service.impl.SeatsServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet(value = "/seats/*")
public class SeatServlet extends BaseServlet {
    private SeatsService seatsService = new SeatsServiceImpl();
    private ResultInfo resultInfo = new ResultInfo();

    public void getAllSeats(HttpServletRequest request, HttpServletResponse response) throws Exception{
        Integer sid = Integer.valueOf(request.getParameter("sid"));
        List<Seating> list = seatsService.getAllSeats(sid);

        resultInfo.setData(list);
        writeValue(response, resultInfo);
    }
}
