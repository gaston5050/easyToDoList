package com.example.easy2dolist.ui.task;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.easy2dolist.R;
import com.example.easy2dolist.model.Status;
import com.example.easy2dolist.model.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class TaskFragment extends Fragment {

    private RecyclerView recyclerView;
    private TaskAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_task, container, false);
        FloatingActionButton addTaskButton = view.findViewById(R.id.addTaskButton);
        addTaskButton.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.navigate(R.id.add_new_task);
        });

/*
        recyclerView = view.findViewById(R.id.recyclerTasks);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new TaskAdapter();
        recyclerView.setAdapter(adapter);

        // 🔹 Por ahora: cargamos una lista de ejemplo
        List<Task> dummyTasks = new ArrayList<>();
        dummyTasks.add(new Task(1, "Ir a la panadería a las 18hs", "Comprar pan", Status.CANCELED));
        dummyTasks.add(new Task(2, "Repasar Android Studio", "Estudiar androide",Status.COMPLETED));
        dummyTasks.add(new Task(3, "Entrenar pierna", "Hacer ejercicio", Status.PENDING));

        adapter.submitList(dummyTasks);.

 */

        return view;
    }
}
