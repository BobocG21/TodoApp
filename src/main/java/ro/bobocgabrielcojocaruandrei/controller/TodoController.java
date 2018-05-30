package ro.bobocgabrielcojocaruandrei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ro.bobocgabrielcojocaruandrei.StoreTodoRequest;
import ro.bobocgabrielcojocaruandrei.StoreTodoResponse;
import ro.bobocgabrielcojocaruandrei.TodoEntityMapper;
import ro.bobocgabrielcojocaruandrei.model.TodoEntity;
import ro.bobocgabrielcojocaruandrei.repository.TodoRepository;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class TodoController {

    private TodoRepository todoRepository;
    private TodoEntityMapper todoEntityMapper;

    @Autowired
    public TodoController(TodoRepository todoRepository,
                          TodoEntityMapper todoEntityMapper) {
        this.todoRepository = todoRepository;
        this.todoEntityMapper = todoEntityMapper;
    }

    @RequestMapping(value = "/todos", method = RequestMethod.POST)
    public StoreTodoResponse postTodo(@Valid StoreTodoRequest request) {
        TodoEntity todoEntity = todoRepository.save(todoEntityMapper.toTodoEntity(request));
        return new StoreTodoResponse(todoEntity.getId());
    }

    @RequestMapping(value = "todos/{todoId}", method = RequestMethod.GET)
    public TodoEntity getTodo(@PathVariable Long todoId) {
        return todoRepository.getOne(todoId);
    }

    @RequestMapping(value = "todo", method = RequestMethod.PUT)
    public @ResponseBody TodoEntity putTodo(@PathVariable Long todoId, @Valid TodoEntity todoEntity){
        Optional<TodoEntity> newTodoEntity = todoRepository.findById(todoId);
        newTodoEntity.get().setTodoDescription(todoEntity.getTodoDescription());
        newTodoEntity.get().setTodoDate(todoEntity.getTodoDate());
        newTodoEntity.get().setTodoDone(todoEntity.isTodoDone());

        todoRepository.save(newTodoEntity.get());

        return newTodoEntity.get();
    }

    @RequestMapping(value = "todos/{todoId}", method = RequestMethod.DELETE)
    public void deleteTodo(@PathVariable Long todoId) {
        todoRepository.deleteById(todoId);
    }
}
