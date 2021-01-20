package com.example.app.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
//import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.app.R;

public class StrategiesFragment extends Fragment {

    private StrategiesViewModel strategiesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        strategiesViewModel =
                new ViewModelProvider(this).get(StrategiesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_strategies, container, false);
        final TextView textView = root.findViewById(R.id.test_text);
        //dailyViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            //@Override
            //public void onChanged(@Nullable String s) {
               // textView.setText(s);
           // }
        //});

        return root;
    }
}