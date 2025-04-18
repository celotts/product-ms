package com.celotts.productms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

@SpringBootApplication
public class ProductMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductMsApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Beans cargados por Spring:");
            Arrays.stream(ctx.getBeanDefinitionNames())
                    .sorted()
                    .forEach(System.out::println);
        };
    }
}




