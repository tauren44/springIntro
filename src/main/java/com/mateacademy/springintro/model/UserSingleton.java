package com.mateacademy.springintro.model;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Log4j
@Component
public class UserSingleton {
    @Bean(name = "singleton")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public User getSingletonUser() {
        log.info("Singleton bean has been created");
        return new User();
    }
}
