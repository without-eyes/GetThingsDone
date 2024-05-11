package com.GetThingsDone.rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name = "Tasks")
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TaskID")
    private Integer taskID;

    @Column(name = "UserID")
    private Integer userID;

    @Column(name = "TaskName")
    private String taskName;

    @Column(name = "TaskDescription")
    private String taskDescription;

    @Column(name = "Deadline")
    private Date deadline;

    @Column(name = "Priority")
    private Integer priority;

    @Column(name = "DifficultyRate")
    private Integer difficultyRate;



    @Column(name = "IsRepeatable")
    private Boolean isRepeatable;

    @Column(name = "IsCompleted")
    private Boolean isCompleted;

    public Integer getTaskID() {
        return taskID;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Date getDeadline() {
        return deadline;
    }

    public Integer getPriority() {
        return priority;
    }

    public Integer getDifficultyRate() {
        return difficultyRate;
    }

    public Boolean getRepeatable() {
        return isRepeatable;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setTaskID(Integer taskID) {
        this.taskID = taskID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public void setDifficultyRate(Integer difficultyRate) {
        this.difficultyRate = difficultyRate;
    }

    public void setRepeatable(Boolean repeatable) {
        isRepeatable = repeatable;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }
}

