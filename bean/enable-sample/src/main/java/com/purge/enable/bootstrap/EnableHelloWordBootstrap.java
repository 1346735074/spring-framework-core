package com.purge.enable.bootstrap;

import com.purge.demo.entity.User;
import com.purge.enable.annotation.EnableHelloWorld;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author purgeyao
 * @since 1.0
 */
@Slf4j
@EnableHelloWorld
//@ComponentScan("com.purge.enable")
@SpringBootApplication
public class EnableHelloWordBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EnableHelloWordBootstrap.class, args);
        User user = context.getBean(User.class);
        log.info(user.toString());
    }
}
