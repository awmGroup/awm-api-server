package com.outdd.awmapicms.pojo;

import com.outdd.common.base.BasePojo;

/**
 * 点赞对象
 */
public class Praise extends BasePojo {
    Integer typeId; //对应的作品或评论的id
    Long customerId; //用户id
    Integer status; //点赞状态
}
