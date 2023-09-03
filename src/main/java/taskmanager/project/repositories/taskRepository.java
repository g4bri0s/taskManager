package taskmanager.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import taskmanager.project.models.task;

public interface taskRepository extends JpaRepository<task, Integer> {

}
