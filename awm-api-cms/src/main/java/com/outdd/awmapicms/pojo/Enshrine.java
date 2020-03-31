package com.outdd.awmapicms.pojo;

import com.outdd.common.base.BasePojo;
import lombok.Data;

import javax.persistence.Entity;

/**
 * 收藏对象
 */
@Entity
@Data
public class Enshrine extends BasePojo {
    Integer typeId; //对应的作品
    Long customerId; //用户id
}
