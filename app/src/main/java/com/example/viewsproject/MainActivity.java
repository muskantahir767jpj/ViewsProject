package com.example.viewsproject;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        tvResult = findViewById(R.id.tvResult);

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selected = findViewById(checkedId);
            // Plain text version:
            // tvResult.setText(getString(R.string.selection_result));

            // Dynamic version with selected text:
            tvResult.setText(getString(R.string.result_format, selected.getText()));
        });
    }
}
