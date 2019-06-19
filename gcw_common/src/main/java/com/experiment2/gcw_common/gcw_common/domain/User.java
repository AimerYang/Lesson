package com.experiment2.gcw_common.gcw_common.domain;

import lombok.Data;

/**
 * @ClassName: User
 * @Description: 后台管理员
 * @Author: TangYong
 * @Date: 2019-06-18
 * @Version: 1.0
 */
@Data
public class User {
    // 用户id
    private Integer userId;
    // 管理员用户名
    private String userName;
    // 密码
    private String password;
}
