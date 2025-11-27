package com.example.counterapp;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtInput;
    private Spinner spnMetric;
    private Button btnCount;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInput = findViewById(R.id.txtInput);
        spnMetric = findViewById(R.id.spnMetric);
        btnCount = findViewById(R.id.btnCount);
        txtResult = findViewById(R.id.txtResult);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = txtInput.getText().toString();

                if (inputText.trim().isEmpty()) {
                    Toast.makeText(MainActivity.this, getString(R.string.toast_empty), Toast.LENGTH_SHORT).show();
                    return;
                }

                String selectedMetric = spnMetric.getSelectedItem().toString();
                int result = 0;

                switch (selectedMetric) {
                    case "Sentences":
                        result = CounterUtils.countSentences(inputText);
                        break;
                    case "Words":
                        result = CounterUtils.countWords(inputText);
                        break;
                    case "Characters":
                        result = CounterUtils.countChars(inputText);
                        break;
                    case "Numbers":
                        result = CounterUtils.countNumbers(inputText);
                        break;
                }
                txtResult.setText(getString(R.string.result_label) + " " + result);
            }
        });
    }
}
