package com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.wiseassblog.jetpacknotesmvvmkotlin.R

class NoteDetailViewDirections private constructor() {
    companion object {
        fun actionNoteDetailView2ToNoteListView2(): NavDirections =
                ActionOnlyNavDirections(R.id.action_noteDetailView2_to_noteListView2)
    }
}
