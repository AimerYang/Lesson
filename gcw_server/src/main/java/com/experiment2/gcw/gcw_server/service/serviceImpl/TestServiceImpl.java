package com.experiment2.gcw.gcw_server.service.serviceImpl;

import com.experiment2.gcw.gcw_server.mapper.TestMapper;
import com.experiment2.gcw.gcw_server.service.ITestService;
import com.experiment2.gcw_common.gcw_common.domain.CourseIntroduce;
import com.experiment2.gcw_common.gcw_common.domain.Teacher;
import com.experiment2.gcw_common.gcw_common.domain.User;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: TestServiceImpl
 * @Description:
 * @Author: TangYong
 * @Date: 2019-06-18
 * @Version: 1.0
 */

@Service
@Log4j
public class TestServiceImpl implements ITestService {
    @Autowired
    TestMapper testMapper;

    public User test() {
        return testMapper.test();
    }

    public List<Teacher> getTeacher() {return testMapper.getTeacher();}


}
