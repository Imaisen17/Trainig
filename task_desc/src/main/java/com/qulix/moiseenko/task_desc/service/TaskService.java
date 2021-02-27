package com.qulix.moiseenko.task_desc.service;

import com.qulix.moiseenko.task_desc.Models.Task;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface TaskService {
    public Task getOneById(Long id);
    public List<Task> getAll();
    public List<Task> getAllByTitle(String title);
    public Task saveTask(Task task);
    public Task updateTask (Task task);
    public void deleteTask(Long id);

}
