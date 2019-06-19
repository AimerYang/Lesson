package com.experiment2.gcw.gcw_server.controller;

import com.experiment2.gcw.gcw_server.service.ITestService;
import com.experiment2.gcw_common.gcw_common.controller.ITestController;
import com.experiment2.gcw_common.gcw_common.domain.CourseIntroduce;
import com.experiment2.gcw_common.gcw_common.domain.Teacher;
import com.experiment2.gcw_common.gcw_common.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: TestController
 * @Description:
 * @Author: TangYong
 * @Date: 2019-06-18
 * @Version: 1.0
 */
@RestController
public class TestController implements ITestController {
    @Autowired
    ITestService service;

    @Override
    public User listUser() {
        return service.test();
    }

    @Override
    public List<Teacher> listTeacher() { return service.getTeacher();}


}
