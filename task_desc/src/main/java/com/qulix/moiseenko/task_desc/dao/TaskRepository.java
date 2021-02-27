package com.qulix.moiseenko.task_desc.dao;

import com.qulix.moiseenko.task_desc.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    public List<Task> findByTitle(String title);
}
