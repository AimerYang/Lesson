package com.experiment2.gcw.gcw_server.controller;

import com.experiment2.gcw.gcw_server.mapper.CIntroduceMapper;
import com.experiment2.gcw.gcw_server.service.CIntroduceService;
import com.experiment2.gcw_common.gcw_common.domain.CourseIntroduce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author *杨荣倩*
 * @ClassName
 * @date 2019/6/20
 * @Decription
 */
@RestController
public class CIntroduceController implements CIntroduceMapper {
    @Autowired
    CIntroduceService service;

    @Override
    public CourseIntroduce getCIntroduce(){ return service.getCIntroduce();}
}
