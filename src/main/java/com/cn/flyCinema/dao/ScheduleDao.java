package com.cn.flyCinema.dao;

import com.cn.flyCinema.entity.Schedule;

public interface ScheduleDao {
    Schedule findScheduleBySid(Integer sid);
}
