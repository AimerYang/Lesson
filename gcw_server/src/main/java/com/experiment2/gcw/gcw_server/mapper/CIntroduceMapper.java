package com.experiment2.gcw.gcw_server.mapper;

import com.experiment2.gcw_common.gcw_common.domain.CourseIntroduce;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author *杨荣倩*
 * @ClassName
 * @date 2019/6/20
 * @Decription
 */
@Mapper
public interface CIntroduceMapper {

    CourseIntroduce getCIntroduce();
}
