package com.example.easytodolist.ui.tasks;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.easytodolist.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskViewModel  extends ViewModel {


    private final MutableLiveData<List<Task>> tasks = new MutableLiveData<>(new ArrayList<Task>());

    public LiveData<List<Task>> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        List<Task> current = new ArrayList<Task>();
        if (tasks.getValue() != null) {
            current.addAll(tasks.getValue());
        }
        current.add(task);
        tasks.setValue(current);
    }


}
