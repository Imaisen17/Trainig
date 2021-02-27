package com.qulix.moiseenko.task_desc.service;

import com.qulix.moiseenko.task_desc.Models.Task;
import com.qulix.moiseenko.task_desc.dao.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class TaskServiceImple implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task getOneById(Long id) {
        return taskRepository.getOne(id);
    }

    @Override
    public List<Task> getAll() {
        System.out.println();
        return taskRepository.findAll();
    }

    @Override
    public List<Task> getAllByTitle(String title) {
        return taskRepository.findByTitle(title);
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        Task task = this.getOneById(id);
        taskRepository.delete(task);
    }
}
