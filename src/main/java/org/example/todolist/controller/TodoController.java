package org.example.todolist.controller;

import org.example.todolist.entity.Todo;
import org.example.todolist.service.TodoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/todos")
public class TodoController {
   private final TodoService todoService;

   public TodoController(TodoService todoService) {
       this.todoService = todoService;
   }

    @PostMapping
    public List<Todo> create(@RequestBody Todo todo){

        return todoService.create(todo);
    }
    @GetMapping
    public List<Todo> list(){

        return todoService.list();
    }

    @PutMapping
    public List<Todo> update(@RequestBody Todo todo){

        return todoService.update(todo);

    }
    @DeleteMapping("{id}")
    public List<Todo> delete(@PathVariable("id") Long id){

        return todoService.delete(id);

    }
}
