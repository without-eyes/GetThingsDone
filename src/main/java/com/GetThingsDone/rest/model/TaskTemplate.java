package com.GetThingsDone.rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name = "TaskTemplates")
@NoArgsConstructor
@AllArgsConstructor
public class TaskTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TaskTemplateID")
    private Integer taskID;

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
}
