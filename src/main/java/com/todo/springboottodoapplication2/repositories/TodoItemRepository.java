package com.todo.springboottodoapplication2.repositories;

import org.springframework.data.repository.CrudRepository;

import com.todo.springboottodoapplication2.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {

	
}
