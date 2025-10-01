package com.todolist.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);

        System.out.println("🎯 Backend pronto para receber requisições!");
        System.out.println("📍 URL: http://localhost:8080");
	}
}
