package com.outdd.awmapicustomer.service;

import com.outdd.awmapicustomer.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author vaie
 * @Created 2019/1/26 17:45
 */
@RequestMapping("/user")
public interface UserApiService {

    @RequestMapping("loadUserByUsername/{username}")
    public User loadUserByUsername(@PathVariable("username") String username);

}
