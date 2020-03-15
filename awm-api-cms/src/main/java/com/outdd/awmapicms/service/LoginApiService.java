package com.outdd.awmapicms.service;

import com.outdd.common.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;

public interface LoginApiService {

    @RequestMapping("/login")
    ResponseBase login(String userName,String password,Integer type);
}
