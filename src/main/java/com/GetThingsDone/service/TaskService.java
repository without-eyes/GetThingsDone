package com.GetThingsDone.service;

import com.GetThingsDone.repository.TaskRepository;
import com.GetThingsDone.rest.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public List<Task> getCompletedTasks() {
        return taskRepository.findByIsCompleted(true);
    }

    public List<Task> getUncompletedTasks() {
        return taskRepository.findByIsCompleted(false);
    }

    public Task getTaskById(int id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task updateTask(Task task) {
        Task updatedTask = taskRepository.findById(task.getTaskID()).orElse(null);
        if (updatedTask != null) {
            updatedTask.setTaskName(task.getTaskName());
            updatedTask.setTaskDescription(task.getTaskDescription());
            updatedTask.setDeadline(task.getDeadline());
            updatedTask.setPriority(task.getPriority());
            updatedTask.setDifficultyRate(task.getDifficultyRate());
            updatedTask.setIsRepeatable(task.getIsRepeatable());
            updatedTask.setIsCompleted(task.getIsCompleted());
            taskRepository.save(updatedTask);
            return updatedTask;
        } else {
            return null;
        }
    }

    public void deleteTask(Task task) {
        taskRepository.delete(task);
    }
}

