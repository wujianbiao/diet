package com.wujianbiao.diet;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @Desc
 * @Author wujianbiao
 * @CreateTime 2022/8/29 5:51 PM
 **/
@Data
//@Entity
//@Table(name = "diet")
public class DietPo implements Serializable {

    // todo 可以不显式实现序列化吗？
    private static final long serialVersionUID = -2480019952655534636L;

    // todo 使用 MySQL 吧
//    @GeneratedValue
    private Long id;

    //    @Column(name = "name")
    private String name;

    private Date createTime;

    private Date updateTime;
}
