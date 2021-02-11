package com.leopaul29.database.springmongodb.repository;

import com.leopaul29.database.springmongodb.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {}