package com.mateacademy.springintro.model;

import lombok.extern.log4j.Log4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Log4j
@Component
public class UserSingleton {
    @Bean(name = "singleton")
    public User getSingletonUser() {
        log.info("Singleton bean has been created");
        return new User();
    }
}
