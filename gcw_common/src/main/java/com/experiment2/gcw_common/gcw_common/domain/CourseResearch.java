package com.experiment2.gcw_common.gcw_common.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalTime;

/**
 * @author *杨荣倩*
 * @ClassName 此类是课程研究模块的实体类
 * @date 2019/6/19
 * @Decription
 */
@Data
public class CourseResearch {
    private Integer key;
    private Integer courseId;
    // 文章标题
    private String title;
    // 文章作者
    private String author;
    // 浏览次数
    private Integer views;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    // 文章发布时间
    private LocalTime time;
    // 动态信息相关文章
    private String resContent;
    // 附件地址
    private String annexUrl;
    // 下载次数
    private Integer downloadTimes;
}
