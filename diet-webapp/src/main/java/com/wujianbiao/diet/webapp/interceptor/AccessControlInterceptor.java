package com.wujianbiao.diet.webapp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.util.concurrent.ThreadLocalRandom;

import com.wujianbiao.diet.webapp.annotation.AccessControl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @Desc
 * @Author wujianbiao
 * @CreateTime 2022/8/26 3:39 PM
 **/
@Slf4j
public class AccessControlInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println("test");
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Annotation[] annotations = handlerMethod.getMethod().getAnnotations();
        AccessControl accessControl = (AccessControl) getAnnotation(annotations, AccessControl.class);

        if (accessControl != null) {
            checkAuth();
        }

        return true;
    }

    private void checkAuth() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 10);
        if (randomNum <= 5) {
            throw new RuntimeException("AccessControlInterceptor:get out!");
        }
    }

    private Annotation getAnnotation(Annotation[] annotations, Class<? extends Annotation> annotationType) {
        for (Annotation annotation : annotations) {
            if (annotation.annotationType().equals(annotationType)) {
                return annotation;
            }
        }
        return null;
    }
}
