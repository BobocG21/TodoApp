package ro.bobocgabrielcojocaruandrei.model;

import ro.bobocgabrielcojocaruandrei.TodoDescription;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
public class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Valid
    @Embedded
    private TodoDescription todoDescription;

    @NotNull
    private boolean todoDone;

    @NotNull
    private String  todoDate;

    public String getTodoDate() {
        return todoDate;
    }

    public void setTodoDate(String todoDate) {
        this.todoDate = todoDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TodoDescription getTodoDescription() {
        return todoDescription;
    }

    public void setTodoDescription(TodoDescription todoDescription) {
        this.todoDescription = todoDescription;
    }

    public boolean isTodoDone() {
        return todoDone;
    }

    public void setTodoDone(boolean todoDone) {
        this.todoDone = todoDone;
    }
}
