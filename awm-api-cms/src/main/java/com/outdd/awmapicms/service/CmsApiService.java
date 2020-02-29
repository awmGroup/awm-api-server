package com.outdd.awmapicms.service;

import com.outdd.common.base.ResponseBase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/cms")
public interface CmsApiService {

    @RequestMapping("/findById/{id}")
    ResponseBase findById(@PathVariable(value="id") String id);
}
