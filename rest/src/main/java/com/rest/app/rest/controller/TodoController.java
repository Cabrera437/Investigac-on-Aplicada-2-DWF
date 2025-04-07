package com.rest.app.rest.controller;

import com.rest.app.rest.Model.Tareas;
import com.rest.app.rest.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;


    @GetMapping(value = "/")
    public String holaMundo(){
        return "Hola REST";
    }


 @GetMapping(value = "/Tareas")
    public List<Tareas> getTareas(){
        return todoRepository.findAll();
 }
 @PostMapping(value = "/savetareas")
    public String savetareas(@RequestBody Tareas tareas){
        todoRepository.save(tareas);
        return "save tareas";
 }


}
