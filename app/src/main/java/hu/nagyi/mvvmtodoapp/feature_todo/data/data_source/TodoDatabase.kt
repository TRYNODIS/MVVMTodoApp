package hu.nagyi.mvvmtodoapp.feature_todo.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import hu.nagyi.mvvmtodoapp.feature_todo.domain.model.Todo

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase : RoomDatabase() {

    abstract val dao: TodoDao
}