package com.outdd.awmapicms.pojo;

import com.outdd.common.base.BasePojo;
import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * 动态对象
 */
@Data
@Entity
public class DynamicCircle  extends BasePojo implements Serializable{
    String content;
    Long customerId;
    Long address;
    Integer audited;
    Integer anonymity;
    Integer status;
    String remarks;
}
