package com.qulix.moiseenko.task_desc.controller;

import com.qulix.moiseenko.task_desc.Models.Task;
import com.qulix.moiseenko.task_desc.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/tasks")
@RestController
public class TaskRestController {
    @Autowired
    private TaskService taskService;
    @GetMapping
    public List<Task> tasks(){
        return taskService.getAll();
    }

    /*@GetMapping("/{title}")
>>>>>>> 2a2fb1e81ac4536d47745b034ddb2b002bd783a3
    public List<Task> tasksByTitle(@PathVariable("title") String title){
        return taskService.getAllByTitle(title);
    }*/
    @GetMapping("/{id}")
    public Task tasks(@PathVariable("id") Long id){
        return taskService.getOneById(id);
    }
    @PostMapping("/save")
    public Task save(@RequestBody Task task){
        return taskService.saveTask(task);
    }
    @PostMapping
    public Task put(@RequestBody Task task){
        return taskService.updateTask(task);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        taskService.deleteTask(id);
    }
}
