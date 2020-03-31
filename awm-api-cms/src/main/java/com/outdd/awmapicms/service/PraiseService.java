package com.outdd.awmapicms.service;

import com.outdd.awmapicms.pojo.Praise;
import com.outdd.common.service.BaseApiService;
import com.outdd.common.service.BaseRestfulApiService;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/praise")
public interface PraiseService extends BaseRestfulApiService<Praise> {
}
