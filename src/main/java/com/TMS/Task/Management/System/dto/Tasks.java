package com.TMS.Task.Management.System.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Tasks {
    private Integer count;
    private List<Task> results;

    public Tasks addResultsItem(Task task) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(task);
        return this;
    }
}
