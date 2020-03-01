package com.outdd.awmapicustomer.service;

import com.outdd.awmapicustomer.pojo.Role;
import com.outdd.common.PageHelp;
import com.outdd.common.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * TODO: 菜单api
 * @author VAIE
 * @date: 2019/4/30-16:13
 * @version v1.0
 */
@RequestMapping("/role")
public interface RoleApiService {
    public ResponseBase findRoles(PageHelp page, Role entity);

}
