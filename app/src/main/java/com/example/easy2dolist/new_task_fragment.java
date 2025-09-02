package com.example.easy2dolist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.easy2dolist.ui.task.TaskViewModel;
import com.google.android.material.textfield.TextInputEditText;


public class new_task_fragment extends Fragment {
    private TextInputEditText txtTitle, txtDescription;
    private Button btnSave;
    private TaskViewModel viewModel;

    public new_task_fragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container ,Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_new_task, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(TaskViewModel.class);
        txtTitle = view.findViewById(R.id.txtTitle);
        txtDescription = view.findViewById(R.id.txtDescripcion);
        btnSave = view.findViewById(R.id.btnSave);
        btnSave.setOnClickListener(v -> {
                    String title = txtTitle.getText().toString();
                    String description = txtDescription.getText().toString();
                    viewModel.addTask(title, description);
                    Toast.makeText(getContext(), "Tarea agregada" +title + " "
                            + description, Toast.LENGTH_LONG).show();


                }

        );
    }

}