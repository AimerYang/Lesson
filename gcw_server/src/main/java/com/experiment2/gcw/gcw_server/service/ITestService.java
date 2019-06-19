package com.experiment2.gcw.gcw_server.service;

import com.experiment2.gcw_common.gcw_common.domain.CourseIntroduce;
import com.experiment2.gcw_common.gcw_common.domain.Teacher;
import com.experiment2.gcw_common.gcw_common.domain.User;

import java.util.List;

/**
 * @ClassName: ITestService
 * @Description:
 * @Author: TangYong
 * @Date: 2019-06-18
 * @Version: 1.0
 */
public interface ITestService {
    User test();
    List<Teacher> getTeacher();

}
