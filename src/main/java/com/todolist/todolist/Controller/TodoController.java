package com.todolist.todolist.Controller;

import com.todolist.todolist.Model.TodoEntity;
import com.todolist.todolist.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todolist")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public TodoEntity createNewTask(@RequestBody TodoEntity todoEntity) {
        return todoService.createTask(todoEntity);
    }



}
