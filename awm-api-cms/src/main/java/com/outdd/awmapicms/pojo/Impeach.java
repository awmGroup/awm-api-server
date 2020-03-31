package com.outdd.awmapicms.pojo;

import com.outdd.common.base.BasePojo;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Impeach extends BasePojo {
    Integer typeId; //对应的作品
    Long customerId; //用户id
    Integer status; //点赞状态
    Integer audited; //点赞状态
    String remarks; //点赞状态
}
