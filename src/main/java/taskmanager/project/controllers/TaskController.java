package taskmanager.project.controllers;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import taskmanager.project.models.task;
import taskmanager.project.services.taskService;

@RestController
@RequestMapping("/api/tasks") // Mude o mapeamento para /api/tasks
public class TaskController {

    private final taskService taskService;

    public TaskController(taskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<task>> findAll() {
        List<task> tasks = taskService.findAll();
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<task> findById(@PathVariable int id) {
        task task = taskService.findById(id);
        if (task != null) {
            return ResponseEntity.ok(task);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<task> save(@RequestBody task task) {
        task savedTask = taskService.save(task);
        return ResponseEntity.ok(savedTask);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World");
    }

    @PutMapping("/{id}")
    public ResponseEntity<task> update(@PathVariable int id, @RequestBody task task) {
        task updatedTask = taskService.update(id, task);
        if (updatedTask != null) {
            return ResponseEntity.ok(updatedTask);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id) {
        taskService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
