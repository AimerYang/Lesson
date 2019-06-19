package com.experiment2.gcw_common.gcw_common.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalTime;

/**
 * @author *杨荣倩*
 * @ClassName 此类是课程介绍的课程安排模块实体类
 * @date 2019/6/19
 * @Decription
 */
@Data
public class CourseArrange {
    private Integer key;
    private Integer courseId;
    // 代表星期几
    private Integer dayWeek;
    // 课程小节（1、2小节）
    private Integer section;
    // 上课教师
    private String teacher;
    // 上课教师
    private String classRoom;
    // 将前台传给后台的数据进行转换
    @DateTimeFormat(pattern = "HH:mm:ss")
    // 将后台传给前台的数据进行转换
    @JsonFormat(pattern = "HH:mm:ss")
    // 课程开始时间
    private LocalTime beginTime;
    @DateTimeFormat(pattern = "HH:mm:ss")
    @JsonFormat(pattern = "HH:mm:ss")
    // 课程结束时间
    private LocalTime endTime;
}
