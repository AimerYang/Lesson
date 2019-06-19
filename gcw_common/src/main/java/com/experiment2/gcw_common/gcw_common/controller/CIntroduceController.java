package com.experiment2.gcw_common.gcw_common.controller;

import com.experiment2.gcw_common.gcw_common.domain.CourseIntroduce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author *杨荣倩*
 * @ClassName
 * @date 2019/6/20
 * @Decription
 */
@Controller
@RequestMapping("/api/v1.0.0")
public interface CIntroduceController {

    @GetMapping("/introduce")
    CourseIntroduce getCIntroduce();
}
