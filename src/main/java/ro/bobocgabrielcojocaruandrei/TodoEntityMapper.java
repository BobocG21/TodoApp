package ro.bobocgabrielcojocaruandrei;

import com.sun.tools.javac.comp.Todo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;
import ro.bobocgabrielcojocaruandrei.model.TodoEntity;

@Component
public class TodoEntityMapper {
        private ModelMapper modelMapper;

        public TodoEntityMapper() {
            modelMapper = createModelMapper();
            modelMapper.validate();
        }

        public TodoEntity toTodoEntity(StoreTodoRequest request) {
            return modelMapper.map(request, TodoEntity.class);
        }

        private ModelMapper createModelMapper() {
            ModelMapper modelMapper = new ModelMapper();

            TypeMap<StoreTodoRequest, TodoEntity> createTypeMap = modelMapper.createTypeMap(StoreTodoRequest.class,
                    TodoEntity.class);
            createTypeMap.addMappings(mapper -> {
                mapper.skip(TodoEntity::setId);
            });

            return modelMapper;
        }
}
