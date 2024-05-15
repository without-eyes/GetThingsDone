package com.GetThingsDone.rest.controller;

import com.GetThingsDone.rest.model.Task;
import com.GetThingsDone.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tasks")
@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping(path = "/all")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping(path = "/completed")
    public List<Task> getCompletedTasks() {
        return taskService.getCompletedTasks();
    }

    @GetMapping(path = "/uncompleted")
    public List<Task> getUncompletedTasks() {
        return taskService.getUncompletedTasks();
    }

    @GetMapping(path = "/get/{id}")
    public Task getTaskById(@PathVariable Integer id) {
        return taskService.getTaskById(id);
    }

    @PostMapping(path = "/create")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping(path = "/update")
    public Task completeTask(@RequestBody Task task) {
        return taskService.updateTask(task);
    }

    @DeleteMapping(path = "delete/{id}")
    public void deleteTask(@PathVariable int id) {
        taskService.deleteTaskById(id);
    }
}