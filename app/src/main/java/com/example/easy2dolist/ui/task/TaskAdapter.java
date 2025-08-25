package com.example.easy2dolist.ui.task;

import androidx.recyclerview.widget.RecyclerView;

import com.example.easy2dolist.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskAdapter  extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

    public interface Listener {
        void onToggle(Task task);
        void onClick(Task task);
        void onLongPress(Task task);
    }
    private final Listener listener;
    private final List<Task> items = new ArrayList<>();

    public TaskAdapter(Listener listener) {
        this.listener = listener;
    }




}
