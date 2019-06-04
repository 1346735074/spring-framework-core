package com.purge.enable.config;

import com.purge.demo.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author purgeyao
 * @since 1.0
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public User user() {
        return new User("小米", 1);
    }

}
