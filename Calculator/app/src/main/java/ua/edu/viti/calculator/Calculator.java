package ua.edu.viti.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        EditText editText = findViewById(R.id.editText);
        editText.setTextIsSelectable(true);
    }
}
