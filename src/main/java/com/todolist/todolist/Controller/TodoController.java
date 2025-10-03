package com.todolist.todolist.Controller;

import com.todolist.todolist.Model.TodoEntity;
import com.todolist.todolist.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todolist")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public TodoEntity createNewTask(@RequestBody TodoEntity todoEntity) {
        return todoService.createTask(todoEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Long id){
        boolean deleted = todoService.deleteTask(id);

        if(deleted) {
            return ResponseEntity.ok().body("Tarefa deletada com sucesso");
        }else {
            return ResponseEntity.notFound().build();
        }
    }



}
