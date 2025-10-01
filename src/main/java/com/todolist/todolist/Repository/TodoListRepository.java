package com.todolist.todolist.Repository;

import com.todolist.todolist.Model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository extends JpaRepository<TodoEntity, Long> {
}
