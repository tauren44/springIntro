package com.mateacademy.springintro.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@Log4j
@Component
@EqualsAndHashCode
public class User {
    private String name;

    @Bean(name = "prototype")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public User getPrototypeUser() {
        log.info("Prototype bean has been created");
        return new User();
    }

    @Bean(name = "singleton")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public User getSingletonUser() {
        log.info("Singleton bean has been created");
        return new User();
    }

    @PostConstruct
    public void init() {
        log.info("Bean initialized");
    }

    @PreDestroy
    public void destroy() {
        log.info("Bean will be destroyed now");
    }
}
