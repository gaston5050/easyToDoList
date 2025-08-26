package com.example.easy2dolist.ui.task;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easy2dolist.R;
import com.example.easy2dolist.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskAdapter  extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {

 private List<Task> tasks = new ArrayList<>();

 public void submitList(List<Task> newTask) {
     tasks = new ArrayList<>(newTask);
     notifyDataSetChanged();
 }


    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_task, parent, false);
        return new TaskViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
     Task t = tasks.get(position);
     holder.txtTitulo.setText(t.getTitle());
     holder.txtDescripcion.setText(t.getDescription());
     holder.txtEstado.setText(t.getStatus().toString());

    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    static class TaskViewHolder extends RecyclerView.ViewHolder {
      TextView txtTitulo, txtDescripcion,  txtEstado;

        TaskViewHolder(@NonNull View itemView) {
         super(itemView);
        txtTitulo = itemView.findViewById(R.id.txtTitulo);
        txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
        txtEstado = itemView.findViewById(R.id.txtEstado);
        }
    }
}
