package com.mateacademy.springintro.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@Log4j
@EqualsAndHashCode
public class User {
    private String name;

    @PostConstruct
    public void init() {
        log.info("Bean initialized");
    }

    @PreDestroy
    public void destroy() {
        log.info("Bean will be destroyed now");
    }
}
