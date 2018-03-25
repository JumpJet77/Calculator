package ua.edu.viti.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class ConverterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private ArrayAdapter<CharSequence> adapterForSpinner;
    private EditText value1;
    private TextView value2;
    private TextView label1;
    private TextView label2;
    private ArrayAdapter<CharSequence> adapterForLabel1;
    private ArrayAdapter<CharSequence> adapterForLabel2;
    private ConverterLogic converterLogic;
    private Button swap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        setTitle("Converter");
        converterLogic = new ConverterLogic();
        spinner = findViewById(R.id.spinner);
        value1 = findViewById(R.id.editText2);
        value2 = findViewById(R.id.textView4);
        label1 = findViewById(R.id.textView2);
        label2 = findViewById(R.id.textView3);
        adapterForLabel1 = ArrayAdapter.createFromResource(this, R.array.convert1, android.R.layout.simple_list_item_1);
        adapterForLabel2 = ArrayAdapter.createFromResource(this, R.array.convert2, android.R.layout.simple_list_item_1);
        adapterForSpinner = ArrayAdapter.createFromResource(this, R.array.spinnerItems, android.R.layout.simple_spinner_item);
        adapterForSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterForSpinner);
        spinner.setOnItemSelectedListener(this);
        swap = findViewById(R.id.button);

        value1.addTextChangedListener(new TextWatcher() {
            boolean _ignore = false;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    switch (spinner.getSelectedItemPosition()) {
                        case 0: {
                            if (value1.getText().toString().equals("")) {
                                value2.setText("");
                                return;
                            } else {
                                if (Objects.equals(label1.getText().toString(), "Kilograms")) {
                                    if (_ignore)
                                        return;
                                    _ignore = true;
                                    value2.setText(converterLogic.convert(Double.parseDouble(value1.getText().toString()), 0).toString());
                                    _ignore = false;
                                    break;
                                } else {
                                    if (_ignore)
                                        return;
                                    _ignore = true;
                                    value2.setText(converterLogic.convert(Double.parseDouble(value1.getText().toString()), 1).toString());
                                    _ignore = false;
                                    break;
                                }
                            }
                        }
                        case 1: {
                            if (value1.getText().toString().equals("")) {
                                value2.setText("");
                                return;
                            } else {

                                if (Objects.equals(label1.getText().toString(), "Foots")) {
                                    if (_ignore)
                                        return;
                                    _ignore = true;
                                    value2.setText(converterLogic.convert(Double.parseDouble(value1.getText().toString()), 2).toString());
                                    _ignore = false;
                                    break;
                                } else {
                                    if (_ignore)
                                        return;
                                    _ignore = true;
                                    value2.setText(converterLogic.convert(Double.parseDouble(value1.getText().toString()), 3).toString());
                                    _ignore = false;
                                    break;
                                }
                            }
                        }
                        case 2: {
                            if (value1.getText().toString().equals("")) {
                                value2.setText("");
                                return;
                            } else {
                                if (Objects.equals(label1.getText().toString(), "Kelvins")) {
                                    if (_ignore)
                                        return;
                                    _ignore = true;
                                    value2.setText(converterLogic.convert(Double.parseDouble(value1.getText().toString()), 4).toString());
                                    _ignore = false;
                                    break;
                                } else {
                                    if (_ignore)
                                        return;
                                    _ignore = true;
                                    value2.setText(converterLogic.convert(Double.parseDouble(value1.getText().toString()), 5).toString());
                                    _ignore = false;
                                    break;
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    Toast.makeText(ConverterActivity.this, "Cleared", Toast.LENGTH_SHORT).show();
                    value1.getText().clear();
                    value2.setText("");

                }
            }
        });

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buffer;
                buffer = label1.getText().toString();
                label1.setText(label2.getText());
                label2.setText(buffer);
            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i) {
            case 0: {
                try {
                    value1.getText().clear();
                    value2.setText("");
                } catch (Exception e) {
                    Toast.makeText(ConverterActivity.this, "Cleared", Toast.LENGTH_SHORT).show();
                    value1.getText().clear();
                    value2.setText("");
                }
                label1.setText(adapterForLabel1.getItem(i));
                label2.setText(adapterForLabel2.getItem(i));
                break;
            }
            case 1: {
                try {
                    value1.getText().clear();
                    value2.setText("");
                } catch (Exception e) {
                    Toast.makeText(ConverterActivity.this, "Cleared", Toast.LENGTH_SHORT).show();
                    value1.getText().clear();
                    value2.setText("");
                }
                label1.setText(adapterForLabel1.getItem(i));
                label2.setText(adapterForLabel2.getItem(i));
                break;
            }
            case 2: {
                try {
                    value1.getText().clear();
                    value2.setText("");
                } catch (Exception e) {
                    Toast.makeText(ConverterActivity.this, "Cleared", Toast.LENGTH_SHORT).show();
                    value1.getText().clear();
                    value2.setText("");
                }
                label1.setText(adapterForLabel1.getItem(i));
                label2.setText(adapterForLabel2.getItem(i));
                break;
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        try {
            throw new Exception("you cannot choose nothing!");
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
