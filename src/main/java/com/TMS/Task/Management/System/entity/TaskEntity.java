package com.TMS.Task.Management.System.entity;

import com.TMS.Task.Management.System.dto.Priority;
import com.TMS.Task.Management.System.dto.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tasks_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @JoinColumn(name = "author_id")
    @ManyToOne
    private UserEntity author;
    @JoinColumn(name = "author_id")
    @ManyToOne
    private UserEntity executor;
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "priority", nullable = false)
    @Enumerated(EnumType.STRING)
    private Priority priority;
    @Column(name = "description_task")
    private String descriptionTask;
}
