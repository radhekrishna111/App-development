package com.abhiarya.xmlallviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    static final String TAG = "BUTTON CLICK";

    Button btn;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "setOnClickListener: values Tosted");
                tost();
            }
        });

        btn2.setOnClickListener(this);
    }

    public void usingXml(View view) {
        Log.d(TAG, "usingXml: values Tosted");
        tost();
    }


    @Override
    public void onClick(View view) {
        Log.d(TAG, "InterfaceImplementation: values Tosted");
        tost();
    }

    void tost(){
        EditText edt = findViewById(R.id.edt1);
        EditText edt2 = findViewById(R.id.edt2);
        Toast.makeText(this, "Value of edt1 = " + edt.getText() + "/n Value of edt1 = "+ edt2.getText(), Toast.LENGTH_SHORT).show();
    }
}