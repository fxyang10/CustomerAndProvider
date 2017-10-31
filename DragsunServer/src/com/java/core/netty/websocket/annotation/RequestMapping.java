package com.java.core.netty.websocket.annotation;

import java.lang.annotation.*;

/**
 *
 * 用来映射 handlerAdapter
 * Created by zhuangjiesen on 2017/9/13.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {

    String uri() default "";

}
