package co.banglabs.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spnFrom, spnTo;
    EditText editTextFrom, editTextTo;
    TextView conversation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnFrom = findViewById(R.id.spinnerFrom);
        spnTo = findViewById(R.id.spinnerto);

        editTextFrom = findViewById(R.id.edittxtfrom);
        editTextTo = findViewById(R.id.edittxtto);

        conversation = findViewById(R.id.conversationRate);


    }
}