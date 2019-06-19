package com.experiment2.gcw_common.gcw_common.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalTime;

/**
 * @author *杨荣倩*
 * @ClassName 此类是课程介绍的课程动态信息实体类
 * @date 2019/6/19
 * @Decription
 */
@Data
public class CourseDynamic {
    private Integer key;
    private Integer courseId;
    // 课程动态的文章标题
    private String title;
    // 动态信息相关文章
    private String dyContent;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    // 发布时间
    private LocalTime releaseTime;
    // 附件地址
    private String annexUrl;
    // 下载次数
    private Integer downloadTimes;
}
