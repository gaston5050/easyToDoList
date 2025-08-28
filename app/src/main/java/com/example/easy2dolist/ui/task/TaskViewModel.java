package com.example.easy2dolist.ui.task;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.easy2dolist.model.Status;
import com.example.easy2dolist.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private final MutableLiveData<List<Task>> tasks = new MutableLiveData<>(new ArrayList<>());
    private int nextId = 1;

    public LiveData<List<Task>> getTasks() {
        return tasks;
    }
   //agegar una tarea a la lista poniendo titulo y descripcion

    public void addTask(String title, String description) {
     //Traingo la lista de tareas actual
     List<Task> current = tasks.getValue();
     //di es null la inicializo
     if(current == null) current = new ArrayList<>();
     //creó una copia de la lista para evitar errores
        List<Task> copy = new ArrayList<>(current);
        copy.add(new Task(nextId++, title, description, Status.PENDING));
        tasks.setValue(copy);

    }




}