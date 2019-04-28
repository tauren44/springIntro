package com.mateacademy.springintro;

import com.mateacademy.springintro.model.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.mateacademy.springintro.model", "com.mateacademy.springintro.bpp"})
public class SpringIntroApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.mateacademy.springintro");

        User user = (User) context.getBean("prototype");
        User userPrototype = (User) context.getBean("prototype");

        User singleton = (User) context.getBean("singleton");
        User other = (User) context.getBean("singleton");

        Runtime.getRuntime().addShutdownHook(new Thread(context::close));
    }
}
