package com.experiment2.gcw_common.gcw_common.domain;

import lombok.Data;

/**
 * @author *杨荣倩*
 * @ClassName 此类是学生问题模块的实体类
 * @date 2019/6/19
 * @Decription
 */
@Data
public class Answer {
    // 序列id
    private Integer key;
    // 问题id
    private Integer questionId;
    // 问题内容
    private String AnsContent;
}
