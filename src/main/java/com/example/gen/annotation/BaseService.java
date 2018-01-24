package com.example.gen.annotation;

import java.lang.annotation.*;

/**
 * @ Author     ：XJH.
 * @ Date       ：Created in 15:04 2018/1/24/024.
 * @ Description：初始化继承BaseService的service
 * @ Modified By：
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BaseService {
}