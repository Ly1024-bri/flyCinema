package com.cn.flyCinema.service.impl;

import com.cn.flyCinema.dao.ScheduleDao;
import com.cn.flyCinema.dao.impl.ScheduleDaoImpl;
import com.cn.flyCinema.entity.Cinema;
import com.cn.flyCinema.entity.Schedule;
import com.cn.flyCinema.service.ScheduleService;

import java.util.List;

public class ScheduleServiceImpl  implements ScheduleService {
    ScheduleDao scheduleDao = new ScheduleDaoImpl();
    @Override
    public List<Schedule> findScheduleByCid(int cid,int mid) {
      List<Schedule> list = scheduleDao.findScheduleCid(cid,mid);
        return list;
    }

    @Override
    public Schedule findScheduleBySid(int sid) {
        Schedule schedule = scheduleDao.findScheduleBySid(sid);
        return schedule;
    }

    @Override
    public List<Schedule> findScheduleByCidDateMid(int cid, int mid, String dateget) {
        List<Schedule> list = scheduleDao.findScheduleByCidDateMid(cid,mid,dateget);
        return list;
    }

    @Override
    public Cinema findCinemaByCid(int cid) {
        Cinema cinema = scheduleDao.findCinemaByCid(cid);
        return cinema;
    }

    @Override
    public List<Schedule> findScheduleByCidMid(int cid, int mid) {
        List<Schedule>  list = scheduleDao.findScheduleByCidMid(cid,mid);
        return list;
    }
}
