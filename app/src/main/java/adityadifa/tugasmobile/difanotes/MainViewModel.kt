package adityadifa.tugasmobile.difanotes

import adityadifa.tugasmobile.difanotes.Repository.NoteRepository
import adityadifa.tugasmobile.difanotes.database.Note
import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainViewModel (application: Application) : ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getAllNotes()
}