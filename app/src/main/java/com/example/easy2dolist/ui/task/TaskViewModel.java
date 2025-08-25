package com.example.easy2dolist.ui.task;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

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
    public int nextId() {
        return nextId++;
    }
    public void addTask(Task task) {
        List<Task> list = new ArrayList<>(tasks.getValue());
        list.add(task);
        tasks.setValue(list);

    }

}