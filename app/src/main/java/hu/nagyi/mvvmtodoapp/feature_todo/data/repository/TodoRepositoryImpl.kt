package hu.nagyi.mvvmtodoapp.feature_todo.data.repository

import hu.nagyi.mvvmtodoapp.feature_todo.data.data_source.TodoDao
import hu.nagyi.mvvmtodoapp.feature_todo.domain.model.Todo
import hu.nagyi.mvvmtodoapp.feature_todo.domain.repository.TodoRepository
import kotlinx.coroutines.flow.Flow

class TodoRepositoryImpl(
    private val dao: TodoDao
) : TodoRepository {

    override suspend fun insertTodo(todo: Todo) {
        dao.insertTodo(todo)
    }

    override suspend fun deleteTodo(todo: Todo) {
        dao.deleteTodo(todo)
    }

    override suspend fun getTodoById(id: Int): Todo? {
        return dao.getTodoById(id)
    }

    override fun getTodos(): Flow<List<Todo>> {
        return dao.getTodos()
    }
}