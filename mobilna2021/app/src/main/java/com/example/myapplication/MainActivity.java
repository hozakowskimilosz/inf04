package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = findViewById(R.id.editTextText);
        EditText password1 = findViewById(R.id.editTextTextPassword2);
        EditText password2 = findViewById(R.id.editTextTextPassword3);
        Button btn = findViewById(R.id.button2);
        TextView res = findViewById(R.id.textView5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().contains("@")) {
                    if(password1.getText().toString().equals(password2.getText().toString())) {
                        res.setText("Witaj " + email.getText().toString());
                    }
                    else {
                        res.setText("Hasła się różnią");
                    }
                }
                else {
                    res.setText("Nieprawidłowy adres e-mail.");
                }
            }
        });
    }
}