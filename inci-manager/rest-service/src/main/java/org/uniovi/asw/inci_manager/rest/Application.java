package org.uniovi.asw.inci_manager.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages= {"org.uniovi.asw.inci_manager.rest"})
public class Application {
    public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
    }
}
