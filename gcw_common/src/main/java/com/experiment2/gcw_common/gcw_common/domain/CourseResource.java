package com.experiment2.gcw_common.gcw_common.domain;

import lombok.Data;

/**
 * @author *杨荣倩*
 * @ClassName 此类是教学资源模块实体类
 * @date 2019/6/19
 * @Decription
 */
@Data
public class CourseResource {
    private Integer key;
    // 课程id
    private Integer courseId;
    // 资源名称
    private String sourceName;
    // 资源路径
    private String sourceUrl;
    /*
    resourceType = {1,2}的含义
    1.课件资源
    2.视频资源
     */
    private Integer resourceType;
}
