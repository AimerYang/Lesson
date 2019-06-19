package com.experiment2.gcw_common.gcw_common.domain;

import lombok.Data;

/**
 * @author *杨荣倩*
 * @date 2019/6/19
 * @Description 此类是教育团队的实体类
 *
 */
@Data
public class Teacher {
    private Integer teacherId;
    // 课程id
    private Integer courseId;
    // 教师名称
    private String teacherName;
    // 教师学校
    private String school;
    // 教师专业
    private String faculty;
    // 教师头像图片
    private String pictureUrl;
    // 学历
    private String educationBg;
}
