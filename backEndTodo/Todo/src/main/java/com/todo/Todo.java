package com.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.todo.service",
        "com.todo.repository","com.todo.model","com.todo.config","com.todo.resource"})
@SpringBootApplication
public class Todo {

        public static void main(String[] args) {
            SpringApplication.run(Todo.class, args);
        }

}
