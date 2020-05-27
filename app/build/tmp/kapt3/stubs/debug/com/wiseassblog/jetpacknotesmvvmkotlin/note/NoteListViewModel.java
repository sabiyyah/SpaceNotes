package com.wiseassblog.jetpacknotesmvvmkotlin.note;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001d"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/NoteListViewModel;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/BaseViewModel;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent;", "noteRepo", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/repository/INoteRepository;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/repository/INoteRepository;Lkotlin/coroutines/CoroutineContext;)V", "editNote", "Landroidx/lifecycle/LiveData;", "", "getEditNote", "()Landroidx/lifecycle/LiveData;", "editNoteState", "Landroidx/lifecycle/MutableLiveData;", "noteList", "", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/Note;", "getNoteList", "noteListState", "getNoteRepo", "()Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/repository/INoteRepository;", "", "position", "", "getNotes", "Lkotlinx/coroutines/Job;", "handleEvent", "event", "app_debug"})
public final class NoteListViewModel extends com.wiseassblog.jetpacknotesmvvmkotlin.common.BaseViewModel<com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent> {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.wiseassblog.jetpacknotesmvvmkotlin.model.Note>> noteListState = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> editNoteState = null;
    @org.jetbrains.annotations.NotNull()
    private final com.wiseassblog.jetpacknotesmvvmkotlin.model.repository.INoteRepository noteRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.wiseassblog.jetpacknotesmvvmkotlin.model.Note>> getNoteList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getEditNote() {
        return null;
    }
    
    @java.lang.Override()
    public void handleEvent(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent event) {
    }
    
    private final void editNote(int position) {
    }
    
    private final kotlinx.coroutines.Job getNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wiseassblog.jetpacknotesmvvmkotlin.model.repository.INoteRepository getNoteRepo() {
        return null;
    }
    
    public NoteListViewModel(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.model.repository.INoteRepository noteRepo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext uiContext) {
        super(null);
    }
}