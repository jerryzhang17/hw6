package edu.brooklyn.cisc3130.taskboard.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.brooklyn.cisc3130.taskboard.model.Task;
import edu.brooklyn.cisc3130.taskboard.repository.TaskRepository;

@Component
public class DataInitializer implements CommandLineRunner {
    
    private final TaskRepository taskRepository;
    
    public DataInitializer(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    
    @Override
    public void run(String... args) {
        if (taskRepository.count() == 0) {
            taskRepository.save(new Task(
                null, "Complete Homework 6", 
                "Finish Spring Data JPA assignment", 
                false, Task.Priority.HIGH, null, null));
            
            taskRepository.save(new Task(
                null, "Study for Midterm", 
                "Review chapters 1-5", 
                false, Task.Priority.HIGH, null, null));
            
            taskRepository.save(new Task(
                null, "Buy groceries", 
                "Milk, eggs, bread", 
                true, Task.Priority.LOW, null, null));

            taskRepository.save(new Task(
                null, "Complete Homework 5",
                "Finish Spring REST API assignment",
                true, Task.Priority.HIGH, null, null));

            taskRepository.save(new Task(
                null, "Read Chapter 6",
                "Read database chapter in textbook",
                false, Task.Priority.MEDIUM, null, null));

            taskRepository.save(new Task(
                null, "Submit Lab Report",
                "Upload lab report to Blackboard",
                false, Task.Priority.HIGH, null, null));

            taskRepository.save(new Task(
                null, "Clean room",
                "Vacuum and organize desk",
                true, Task.Priority.LOW, null, null));

            taskRepository.save(new Task(
                null, "Exercise",
                "Go to the gym",
                false, Task.Priority.MEDIUM, null, null));

            taskRepository.save(new Task(
                null, "Call mom",
                "Catch up with family",
                true, Task.Priority.LOW, null, null));

            taskRepository.save(new Task(
                null, "Review lecture notes",
                "Go over notes from last class",
                false, Task.Priority.MEDIUM, null, null));
        }
    }
}