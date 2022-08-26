package com.wujianbiao.diet.webapp.annotation;

import java.lang.annotation.*;

/**
 * @Desc
 * @Author wujianbiao
 * @CreateTime 2022/8/26 3:35 PM
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AccessControl {

    boolean authCheck() default true;
}
