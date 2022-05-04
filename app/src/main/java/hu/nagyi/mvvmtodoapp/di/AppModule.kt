package hu.nagyi.mvvmtodoapp.di

import android.app.Application
import androidx.room.Room
import hu.nagyi.mvvmtodoapp.feature_todo.data.data_source.TodoDatabase
import hu.nagyi.mvvmtodoapp.feature_todo.domain.repository.TodoRepository
import hu.nagyi.mvvmtodoapp.feature_todo.data.repository.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): TodoDatabase {
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase): TodoRepository {
        return TodoRepositoryImpl(db.dao)
    }
}