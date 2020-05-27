package com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.wiseassblog.jetpacknotesmvvmkotlin.R

class NoteActivityDemo : AppCompatActivity(){

    private lateinit var nav: NavController

    override fun OnCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        nav = Navigation.findNavController(this, R.id.fragment_nav)
    }
}