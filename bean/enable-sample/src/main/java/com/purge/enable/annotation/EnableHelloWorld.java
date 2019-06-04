package com.purge.enable.annotation;

import com.purge.enable.config.HelloWorldConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author purgeyao
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({HelloWorldConfiguration.class})
public @interface EnableHelloWorld {

}
