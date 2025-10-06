package com.todolist.todolist.Controller;

import com.todolist.todolist.Model.TodoEntity;
import com.todolist.todolist.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todolist")
public class TodoController {

    @Autowired
    private TodoService todoService;

    // GET ALL - Buscar todas as tarefas
    @GetMapping
    public ResponseEntity<List<TodoEntity>> getAllTasks() {
        List<TodoEntity> tasks = todoService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }

    // GET BY ID - Buscar tarefa específica
    @GetMapping("/{id}")
    public ResponseEntity<?> getTaskById(@PathVariable Long id) {
        Optional<TodoEntity> task = todoService.getTaskById(id);

        if (task.isPresent()) {
            return ResponseEntity.ok(task.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

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
