package com.leopaul29.database.springmongodb;

import com.leopaul29.database.springmongodb.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongodbApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbApplication.class, args);
	}
}
