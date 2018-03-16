package ua.edu.viti.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class Calculator extends AppCompatActivity {

    EditText editText;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonDot;
    Button buttonEqual;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMultiply;
    Button buttonDivide;
    Button buttonClear;
    Button buttonClearAll;

    private CalculatorLogic calculatorLogic = new CalculatorLogic();
    private double firstNum;
    private double secondNum;
    private char operator;
    private Double result;
    private String startField = "Input Field";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        editText = findViewById(R.id.editText);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);
        buttonDot = findViewById(R.id.button_dot);
        buttonEqual = findViewById(R.id.button_equal);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMinus = findViewById(R.id.button_minus);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonDivide = findViewById(R.id.button_divide);
        buttonClear = findViewById(R.id.button_clear);
        buttonClearAll = findViewById(R.id.button_clear_all);

        editText.setTextIsSelectable(true);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (Objects.equals(editText.getText().toString(), startField)) {
                    editText.getText().clear();
                    editText.getText().append('1');
                } else {
                    editText.getText().append('1');
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (Objects.equals(editText.getText().toString(), startField)) {
                    editText.getText().clear();
                    editText.getText().append('2');
                } else {
                    editText.getText().append('2');
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (Objects.equals(editText.getText().toString(), startField)) {
                    editText.getText().clear();
                    editText.getText().append('3');
                } else {
                    editText.getText().append('3');
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (Objects.equals(editText.getText().toString(), startField)) {
                    editText.getText().clear();
                    editText.getText().append('4');
                } else {
                    editText.getText().append('4');
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (Objects.equals(editText.getText().toString(), startField)) {
                    editText.getText().clear();
                    editText.getText().append('5');
                } else {
                    editText.getText().append('5');
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (Objects.equals(editText.getText().toString(), startField)) {
                    editText.getText().clear();
                    editText.getText().append('6');
                } else {
                    editText.getText().append('6');
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (Objects.equals(editText.getText().toString(), startField)) {
                    editText.getText().clear();
                    editText.getText().append('7');
                } else {
                    editText.getText().append('7');
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (Objects.equals(editText.getText().toString(), startField)) {
                    editText.getText().clear();
                    editText.getText().append('8');
                } else {
                    editText.getText().append('8');
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (Objects.equals(editText.getText().toString(), startField)) {
                    editText.getText().clear();
                    editText.getText().append('9');
                } else {
                    editText.getText().append('9');
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (Objects.equals(editText.getText().toString(), startField)) {
                    editText.getText().clear();
                } else {
                    if (editText.getText().length() == 0) {
                        editText.getText().append('0');
                        editText.getText().append('.');
                    } else {
                        editText.getText().append('0');
                    }
                }
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {

            @SuppressWarnings("StatementWithEmptyBody")
            @Override
            public void onClick(View view) {
                if (Objects.equals(editText.getText().toString(), startField)) {
                    editText.getText().clear();
                } else {
                    if (editText.getText().length() == 0) {
                    } else {
                        editText.getText().append('.');
                    }
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (editText.getText().length() != 0) {
                    editText.getText().delete(editText.getText().length() - 1, editText.getText().length());
                } else {
                    Toast.makeText(Calculator.this, "You try to delete nothing", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonClearAll.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (editText.getText().length() != 0) {
                    editText.getText().clear();
                } else {
                    Toast.makeText(Calculator.this, "You try to delete nothing", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (editText.getText().length() != 0 && !Objects.equals(editText.getText().toString(), startField)
                        && !editText.getText().toString().contains("+") && !editText.getText().toString().contains("-")
                        && !editText.getText().toString().contains("*") && !editText.getText().toString().contains("/")) {
                    editText.getText().append('+');
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (editText.getText().length() != 0 && !Objects.equals(editText.getText().toString(), startField)
                        && !editText.getText().toString().contains("+") && !editText.getText().toString().contains("-")
                        && !editText.getText().toString().contains("*") && !editText.getText().toString().contains("/")) {
                    editText.getText().append('-');
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (editText.getText().length() != 0 && !Objects.equals(editText.getText().toString(), startField)
                        && !editText.getText().toString().contains("+") && !editText.getText().toString().contains("-")
                        && !editText.getText().toString().contains("*") && !editText.getText().toString().contains("/")) {
                    editText.getText().append('*');
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (editText.getText().length() != 0 && !Objects.equals(editText.getText().toString(), startField)
                        && !editText.getText().toString().contains("+") && !editText.getText().toString().contains("-")
                        && !editText.getText().toString().contains("*") && !editText.getText().toString().contains("/")) {
                    editText.getText().append('/');
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (editText.getText().length() != 0 && !Objects.equals(editText.getText().toString(), startField)
                        && (editText.getText().toString().contains("+") || editText.getText().toString().contains("-")
                        || editText.getText().toString().contains("*") || editText.getText().toString().contains("/"))) {

                    try {
                        if (editText.getText().toString().contains("+")) {
                            operator = '+';
                        } else {
                            if (editText.getText().toString().contains("-")) {
                                operator = '-';
                            } else {
                                if (editText.getText().toString().contains("*")) {
                                    operator = '*';
                                } else {
                                    if (editText.getText().toString().contains("/")) {
                                        operator = '/';
                                    }
                                }
                            }
                        }
                        firstNum = Double.parseDouble(editText.getText().toString().substring(0, editText.getText().toString().indexOf(operator)));
                        secondNum = Double.parseDouble(editText.getText().toString().substring(editText.getText().toString().indexOf(operator) + 1, editText.getText().length()));
                        result = calculatorLogic.operation(firstNum, secondNum, operator);
                        if (Double.isNaN(result) || Double.isInfinite(result)) {
                            Toast.makeText(Calculator.this, "Calculating error. Probably your input is incorrect.", Toast.LENGTH_SHORT).show();
                        } else {
                            editText.setText(result.toString().substring(0, result.toString().indexOf('.')));
                        }
                    } catch (Exception e) {
                        Toast.makeText(Calculator.this, "Calculating error.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
