package com.TMS.Task.Management.System.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Comments {
    private Integer count;
    private List<Comment> results;

    public Comment addResultsItem(Comment comment) {
        if (results == null) {
            results = new ArrayList<>();
        }
        this.results.add(comment);
        return comment;
    }
}

