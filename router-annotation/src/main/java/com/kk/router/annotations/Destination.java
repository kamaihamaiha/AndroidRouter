package com.kk.router.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface Destination {

    /**
     * 当前页面面 URL
     * @return
     */
    String url();

    /**
     * 当前页面的描述
     * @return
     */
    String description();
}
