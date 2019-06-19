package com.experiment2.gcw.gcw_server.service.serviceImpl;

import com.experiment2.gcw.gcw_server.mapper.TestMapper;
import com.experiment2.gcw.gcw_server.service.CIntroduceService;
import com.experiment2.gcw_common.gcw_common.domain.CourseIntroduce;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author *杨荣倩*
 * @ClassName
 * @date 2019/6/20
 * @Decription
 */
@Service
@Log4j
public class CIntroduceImpl implements CIntroduceService {
    @Autowired
    TestMapper testMapper;

    public CourseIntroduce getCIntroduce(){return testMapper.getCIntroduce();}