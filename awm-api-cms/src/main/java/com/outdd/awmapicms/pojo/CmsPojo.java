package com.outdd.awmapicms.pojo;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="sys_menu")
@Entity
@Data
@Proxy(lazy = false)
public class CmsPojo implements Serializable {
    /** 菜单Id**/
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
}
