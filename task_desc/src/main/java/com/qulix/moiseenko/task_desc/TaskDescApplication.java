package com.qulix.moiseenko.task_desc;

import com.qulix.moiseenko.task_desc.Models.Task;
import com.qulix.moiseenko.task_desc.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskDescApplication implements CommandLineRunner {
   @Autowired
    private TaskService taskService;
    public static void main(String[] args) {
        SpringApplication.run(TaskDescApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i<=5; i++){
            taskService.saveTask(new Task("New title" + i, "description" + i));
            System.out.println();
        }
    }
}
