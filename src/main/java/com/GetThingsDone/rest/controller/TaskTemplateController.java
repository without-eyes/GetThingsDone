package com.GetThingsDone.rest.controller;

import com.GetThingsDone.rest.model.TaskTemplate;
import com.GetThingsDone.service.TaskTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/templates")
@RestController
public class TaskTemplateController {
    @Autowired
    private TaskTemplateService taskTemplateService;

    @GetMapping(path = "/get/{id}")
    public TaskTemplate getTaskTemplate(@PathVariable Integer id) {
        return taskTemplateService.getTaskTemplateById(id);
    }

    @GetMapping(path = "/all")
    public List<TaskTemplate> getAllTaskTemplates() {
        return taskTemplateService.getAllTaskTemplates();
    }

    @PostMapping(path = "/create")
    public TaskTemplate createTaskTemplate(@RequestBody TaskTemplate taskTemplate) {
        return taskTemplateService.createTaskTemplate(taskTemplate);
    }

    @PutMapping(path = "/update")
    public TaskTemplate updateTaskTemplate(@RequestBody TaskTemplate taskTemplate) {
        return taskTemplateService.updateTaskTemplate(taskTemplate);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteTaskTemplate(@PathVariable Integer id) {
        taskTemplateService.deleteTaskTemplateById(id);
    }
}
