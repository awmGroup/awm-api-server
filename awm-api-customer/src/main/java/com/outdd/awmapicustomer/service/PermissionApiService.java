package com.outdd.awmapicustomer.service;

import com.outdd.awmapicustomer.pojo.Permission;
import com.outdd.common.PageHelp;
import com.outdd.common.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * TODO: 权限api
 * @author VAIE
 * @date: 2019/4/30-16:13
 * @version v1.0
 */
@RequestMapping("/permission")
public interface PermissionApiService {
    public ResponseBase findPermissions(PageHelp page, Permission entity);

}
