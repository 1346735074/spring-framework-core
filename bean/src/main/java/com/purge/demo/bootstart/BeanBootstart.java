package com.purge.demo.bootstart;

import com.purge.demo.entity.Company;
import com.purge.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author purgeyao
 * @since 1.0
 */
@Slf4j
@ComponentScan("com.purge.demo")
@SpringBootApplication
public class BeanBootstart {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BeanBootstart.class, args);
        User user = context.getBean(User.class);
        log.info(user.toString());

        Company company = context.getBean(Company.class);
        log.info(company.toString());
    }
}
