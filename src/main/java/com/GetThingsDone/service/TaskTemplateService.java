package com.GetThingsDone.service;

import com.GetThingsDone.repository.TaskTemplateRepository;
import com.GetThingsDone.rest.model.TaskTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskTemplateService {
    @Autowired
    private TaskTemplateRepository taskTemplateRepository;

    public TaskTemplate createTaskTemplate(TaskTemplate taskTemplate) {
        return taskTemplateRepository.save(taskTemplate);
    }

    public List<TaskTemplate> getAllTaskTemplates() {
        return taskTemplateRepository.findAll();
    }

    public TaskTemplate getTaskTemplateById(int id) {
        return taskTemplateRepository.findById(id).orElse(null);
    }

    public TaskTemplate updateTaskTemplate(TaskTemplate taskTemplate) {
        TaskTemplate updatedTaskTemplate = taskTemplateRepository.findById(taskTemplate.getTaskID()).orElse(null);
        if (updatedTaskTemplate != null) {
            updatedTaskTemplate.setTaskName(taskTemplate.getTaskName());
            updatedTaskTemplate.setTaskDescription(taskTemplate.getTaskDescription());
            updatedTaskTemplate.setDeadline(taskTemplate.getDeadline());
            updatedTaskTemplate.setPriority(taskTemplate.getPriority());
            updatedTaskTemplate.setDifficultyRate(taskTemplate.getDifficultyRate());
            updatedTaskTemplate.setIsRepeatable(taskTemplate.getIsRepeatable());
            taskTemplateRepository.save(updatedTaskTemplate);
            return updatedTaskTemplate;
        } else {
            return null;
        }
    }

    public void deleteTaskTemplate(TaskTemplate taskTemplate) {
        taskTemplateRepository.deleteById(taskTemplate.getTaskID());
    }
}
