package com.experiment2.gcw.gcw_server.mapper;

import com.experiment2.gcw_common.gcw_common.domain.CourseIntroduce;
import com.experiment2.gcw_common.gcw_common.domain.Teacher;
import com.experiment2.gcw_common.gcw_common.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName: TestMapper
 * @Description:
 * @Author: TangYong
 * @Date: 2019-06-18
 * @Version: 1.0
 */
@Mapper
public interface TestMapper {
    User test();
    List<Teacher> getTeacher();


}
