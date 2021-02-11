package com.leopaul29.database.springmongodb;

import com.leopaul29.database.springmongodb.data.ToDo;
import com.leopaul29.database.springmongodb.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringMongodbApplication {

	@Autowired
	private ToDoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbApplication.class, args);
	}

	public void run(String... args) throws Exception {
		repository.deleteAll();

		repository.save(new ToDo("todo1", false));
		repository.save(new ToDo("todo2", false));

		// fetch all todo
		System.out.println("Todos found with findAll():");
		System.out.println("-------------------------------");
		for (ToDo todo : repository.findAll()) {
			System.out.println(todo);
		}
		System.out.println();
	}
}
