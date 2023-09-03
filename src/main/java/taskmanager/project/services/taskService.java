package taskmanager.project.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taskmanager.project.models.task;
import taskmanager.project.repositories.taskRepository;

@Service
public class taskService {

    @Autowired
    private taskRepository taskRepository;

    public taskService(taskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<task> findAll() {
        return taskRepository.findAll();
    }

    public task findById(int id) {
        return taskRepository.findById(id).orElse(null);
    }

    public task save(task task) {
        return taskRepository.save(task);
    }

    public task update(int id, task task) {
        Optional<task> taskOptional = taskRepository.findById(id);
        if (taskOptional.isPresent()) {
            return taskRepository.save(task);
        }
        return null;
    }

    public void deleteById(int id) {
        taskRepository.deleteById(id);
    }
}
