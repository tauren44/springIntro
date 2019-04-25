package com.mateacademy.springintro.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Getter
@Setter
@Log4j
public class User {
    private String name;

    public void init() {
        log.info("Bean initialized");
    }

    public void destroy() {
        log.info("Bean will be destroyed now");
    }
}
