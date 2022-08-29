package com.wujianbiao.diet;

import java.util.Date;

import lombok.Data;

/**
 * @Desc
 * @Author wujianbiao
 * @CreateTime 2022/8/29 5:51 PM
 **/
@Data
public class DietPo {

    // todo 使用 MySQL 吧
    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;
}
