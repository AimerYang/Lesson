package com.experiment2.gcw_common.gcw_common.domain;

import lombok.Data;

/**
 * @author *杨荣倩*
 * @ClassName 此类是课程介绍模块的实体类
 * @date 2019/6/19
 * @Decription
 */
@Data
public class CourseIntroduce {
    private Integer key;
    private Integer courseId;
    // 课程介绍文章标题
    private String title;
    // 课程介绍文章内容容
    private String inContent;
    /*
   introduceType = {1，2，3，4}的含义：
   1.课程简介
   2.教学方法
   3.课程大纲
   4.课程理念与目标
    */
    private Integer introduceType;
}
