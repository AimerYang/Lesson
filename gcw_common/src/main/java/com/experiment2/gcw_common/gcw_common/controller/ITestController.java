package com.experiment2.gcw_common.gcw_common.controller;

import com.experiment2.gcw_common.gcw_common.domain.CourseIntroduce;
import com.experiment2.gcw_common.gcw_common.domain.Teacher;
import com.experiment2.gcw_common.gcw_common.domain.User;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: ITestController
 * @Description:
 * @Author: TangYong
 * @Date: 2019-06-18
 * @Version: 1.0
 */
@RestController
@RequestMapping("/api/v1.0.0")
public interface ITestController {
    @GetMapping("/test")
    User listUser();

    @GetMapping("/teacher")
    List<Teacher> listTeacher();


}

