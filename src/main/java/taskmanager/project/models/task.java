package taskmanager.project.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tasks")
@Getter
@Setter
public class task {

    @Id
    private int id;

    @Column(name = "task")
    private String task;

    @Column(name = "status")
    private String status;

    @Column(name = "creation_date")
    private Date creationDate;
}
