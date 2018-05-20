package ro.bobocgabrielcojocaruandrei.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.Instant;

public class TodoEntity {
    private TodoId id;

    @Valid
    private TodoDescription todoDescription;

    @NotNull
    private boolean todoDone;

    private Instant  todoDate;

    public Instant getTodoDate() {
        return todoDate;
    }

    public void setTodoDate(Instant todoDate) {
        this.todoDate = todoDate;
    }

    public TodoId getId() {
        return id;
    }

    public void setId(TodoId id) {
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
