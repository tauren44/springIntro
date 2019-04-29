package com.mateacademy.springintro.model;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Log4j
@Component
public class UserPrototype {
    @Bean(name = "prototype")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public User getPrototypeUser() {
        log.info("Prototype bean has been created");
        return new User();
    }
}
