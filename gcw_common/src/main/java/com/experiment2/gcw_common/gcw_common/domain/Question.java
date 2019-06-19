package com.experiment2.gcw_common.gcw_common.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalTime;

/**
 * @author *杨荣倩*
 * @ClassName
 * @date 2019/6/19
 * @Decription
 */
public class Question {
    // 问题id
    private Integer questionId;
    private Integer courseId;
    // 问题标题
    private String questionTitle;
    // 问题内容
    private String questionContent;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    // 提问时间
    private LocalTime queTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    // 回答时间
    private LocalTime ansTime;
}
