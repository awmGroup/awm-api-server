package com.outdd.awmapicustomer.service;

import com.outdd.awmapicustomer.pojo.Menu;
import com.outdd.common.PageHelp;
import com.outdd.common.base.ResponseBase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 中文
 * @author VAIE
 * @date: 2019/4/30-16:13
 * @version v1.0
 */
@RequestMapping("/menu")
public interface MenuApiService {
    @GetMapping("/findMenusByUserId")
    public ResponseBase findMenusByUserId(@PathVariable(value = "id") Integer id);

    public ResponseBase findMenus(PageHelp page, Menu entity);

    public ResponseBase findSubMenuByParentId(Integer id);

    public ResponseBase findSubMenuByParentId(String path);


}
