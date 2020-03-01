package com.outdd.awmapicustomer.service;

import com.outdd.awmapicustomer.pojo.User;
import com.outdd.common.PageHelp;
import com.outdd.common.base.ResponseBase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author vaie
 * @Created 2019/1/26 17:45
 */
@RequestMapping("/user")
public interface UserApiService {

    @RequestMapping("/findById/{id}")
    public ResponseBase findById(@PathVariable(value = "id") String id);

    @RequestMapping("findUser/{username}/{password}")
    public ResponseBase findByUsernameAndPassword(@PathVariable("username") String username, @PathVariable("password") String password);

    @RequestMapping("loadUserByUsername/{username}")
    public User loadUserByUsername(@PathVariable("username") String username);

    @RequestMapping("findUsers")
    public ResponseBase findUsers(@PathVariable("page") PageHelp page, @PathVariable("entity") User entity);
}
