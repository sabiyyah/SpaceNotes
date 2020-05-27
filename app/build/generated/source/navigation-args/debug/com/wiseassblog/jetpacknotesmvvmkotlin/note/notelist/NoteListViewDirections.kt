package com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.wiseassblog.jetpacknotesmvvmkotlin.R
import kotlin.Int
import kotlin.String

class NoteListViewDirections private constructor() {
<<<<<<< HEAD
<<<<<<< HEAD
    private data class ActionNoteListView2ToNoteDetailView2(val noteId: String) : NavDirections {
        override fun getActionId(): Int = R.id.action_noteListView2_to_noteDetailView2
=======
    private data class ActionNoteListViewToNoteDetailView(val noteId: String = "\"\"") :
            NavDirections {
        override fun getActionId(): Int = R.id.action_noteListView_to_noteDetailView
>>>>>>> dev
=======
    private data class ActionNoteListViewToNoteDetailView(val noteId: String = "\"\"") :
            NavDirections {
        override fun getActionId(): Int = R.id.action_noteListView_to_noteDetailView
>>>>>>> dev

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("noteId", this.noteId)
            return result
        }
    }

    companion object {
<<<<<<< HEAD
<<<<<<< HEAD
        fun actionNoteListView2ToLoginActivity(): NavDirections =
                ActionOnlyNavDirections(R.id.action_noteListView2_to_loginActivity)

        fun actionNoteListView2ToNoteDetailView2(noteId: String): NavDirections =
                ActionNoteListView2ToNoteDetailView2(noteId)
=======
=======
>>>>>>> dev
        fun actionNoteListViewToNoteDetailView(noteId: String = "\"\""): NavDirections =
                ActionNoteListViewToNoteDetailView(noteId)

        fun actionNoteListViewToLoginActivity(): NavDirections =
                ActionOnlyNavDirections(R.id.action_noteListView_to_loginActivity)
<<<<<<< HEAD
>>>>>>> dev
=======
>>>>>>> dev
    }
}
