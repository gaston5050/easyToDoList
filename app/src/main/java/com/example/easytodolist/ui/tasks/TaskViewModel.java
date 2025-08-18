package com.example.easytodolist.ui.tasks;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class TaskViewModel  extends ViewModel {


        private MutableLiveData<List<String>> tasks = new MutableLiveData<>();

        public LiveData<List<String>> getTasks() {
            return tasks;
        }

        public void addTask(String task) {
            List<String> currentTasks = tasks.getValue();
            if (currentTasks == null) currentTasks = new ArrayList<>();
            currentTasks.add(task);
            tasks.setValue(currentTasks);
        }


}
