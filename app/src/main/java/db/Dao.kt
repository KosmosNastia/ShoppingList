package db

import androidx.room.Insert
import androidx.room.Query
import com.example.shoppinglist.entities.Noteitem
import kotlinx.coroutines.flow.Flow

@androidx.room.Dao
interface Dao {
    @Query ("SELECT * FROM note_list")
    fun getAllNotes(): Flow<List<Noteitem>>
    @Insert
    suspend fun insertNote(noteitem: Noteitem)
}