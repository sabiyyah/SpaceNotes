package com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

<<<<<<< HEAD
<<<<<<< HEAD
data class NoteDetailViewArgs(val noteId: String) : NavArgs {
=======
data class NoteDetailViewArgs(val noteId: String = "\"\"") : NavArgs {
>>>>>>> dev
=======
data class NoteDetailViewArgs(val noteId: String = "\"\"") : NavArgs {
>>>>>>> dev
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("noteId", this.noteId)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): NoteDetailViewArgs {
            bundle.setClassLoader(NoteDetailViewArgs::class.java.classLoader)
            val __noteId : String?
            if (bundle.containsKey("noteId")) {
                __noteId = bundle.getString("noteId")
                if (__noteId == null) {
                    throw IllegalArgumentException("Argument \"noteId\" is marked as non-null but was passed a null value.")
                }
            } else {
<<<<<<< HEAD
<<<<<<< HEAD
                throw IllegalArgumentException("Required argument \"noteId\" is missing and does not have an android:defaultValue")
=======
                __noteId = "\"\""
>>>>>>> dev
=======
                __noteId = "\"\""
>>>>>>> dev
            }
            return NoteDetailViewArgs(__noteId)
        }
    }
}
