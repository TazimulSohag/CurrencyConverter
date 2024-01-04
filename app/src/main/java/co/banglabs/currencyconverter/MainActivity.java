package co.banglabs.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spnFrom, spnTo;
    EditText editTextFrom, editTextTo;
    TextView conversation;
    ArrayList<String> arraylist;
    String convert_from_value, convert_to_value, conversion_value;
    String[] currency = {"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN",
            "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYN", "BYR", "BZD",
            "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK",
            "DJF", "DKK", "DOP", "DZD",
            "EGP", "ERN", "ETB", "EUR",
            "FJD", "FKP",
            "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD",
            "HKD", "HNL", "HRK", "HTG", "HUF",
            "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK",
            "JEP", "JMD", "JOD", "JPY",
            "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT",
            "LAK", "LBP", "LKR", "LRD", "LSL", "LVL", "LYD",
            "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN",
            "NAD", "NGN", "NIO", "NOK", "NPR", "NZD",
            "OMR",
            "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG",
            "QAR",
            "RON", "RSD", "RUB", "RWF",
            "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL",
            "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS",
            "UAH", "UGX", "USD", "UYU", "UZS",
            "VEF", "VND", "VUV",
            "WST",
            "XAF", "XAG", "XCD", "XDR", "XOF", "XPF",
            "YER",
            "ZAR", "ZMK", "ZMW", "ZWL"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnFrom = findViewById(R.id.spinnerFrom);
        spnTo = findViewById(R.id.spinnerto);

        editTextFrom = findViewById(R.id.edittxtfrom);
        editTextTo = findViewById(R.id.edittxtto);

        conversation = findViewById(R.id.conversationRate);


        arraylist = new ArrayList<>();
        for(String i : currency) {
            arraylist.add(i);
        }















    }
}