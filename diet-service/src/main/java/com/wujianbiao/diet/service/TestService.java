package com.wujianbiao.diet.service;

/**
 * @author wujianbiao
 * @date 2022/9/2 6:44 PM
 */
public interface TestService {

    String funA();

    String funB();

    default String funC() {
        return "";
    }

    String funD();

    String funE();
}
