package com.todolist.todolist.Service;

import com.todolist.todolist.Model.TodoEntity;
import com.todolist.todolist.Repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoListRepository todoListRepository;

    public TodoEntity createTask(TodoEntity todoEntity) {
        return todoListRepository.save(todoEntity);
    }

    public boolean deleteTask(Long id) {
        if (todoListRepository.existsById(id)) {
            todoListRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
