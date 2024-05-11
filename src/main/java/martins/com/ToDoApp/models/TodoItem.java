package martins.com.ToDoApp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "todo_items")
public class TodoItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private Boolean isCompleted;

    private LocalDateTime timeToStart;
    private LocalDateTime timeToFinish;

    @Override
    public String toString() {
        return String.format("TodoItem{id=%d, description='%s', isCompleted='%s', createdAt='%s', timeToFinish='%s'}",
                id, description, isCompleted, timeToStart, timeToFinish);
    }
}


