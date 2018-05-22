package ro.bobocgabrielcojocaruandrei;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class StoreTodoRequest {
    @Valid
    private TodoDescription todoDescription;

    @NotNull
    private boolean todoDone;

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

    public String getTodoDate() {
        return todoDate;
    }

    public void setTodoDate(String todoDate) {
        this.todoDate = todoDate;
    }

    @NotNull
    private String  todoDate;
}
