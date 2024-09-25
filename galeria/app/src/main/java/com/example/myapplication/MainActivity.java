package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    String[] pictures = {"kot1", "kot2", "kot3", "kot4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgView = findViewById(R.id.imageView2);
        Button prevBtn = findViewById(R.id.button3);
        Button nextBtn = findViewById(R.id.button5);
        LinearLayout background = findViewById(R.id.backgroundd);
        Switch switchBtn = findViewById(R.id.switch1);
        EditText input = findViewById(R.id.editTextText);
        setImage(imgView, counter);

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                if (counter < 0) {
                    counter = pictures.length - 1;
                }
                setImage(imgView, counter);
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                if (counter >= pictures.length) {
                    counter = 0;
                }
                setImage(imgView, counter);
            }
        });

        switchBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switchBtn.isChecked()) {
                    background.setBackgroundResource(R.color.blue);
                }
                else {
                    background.setBackgroundResource(R.color.green);
                }
            }
        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(input.getText().toString().equals("1")) {
                    imgView.setImageResource(R.drawable.kot1);
                }
                else if(input.getText().toString().equals("2")) {
                    imgView.setImageResource(R.drawable.kot2);
                }
                else if(input.getText().toString().equals("3")) {
                    imgView.setImageResource(R.drawable.kot3);
                }
                else if(input.getText().toString().equals("4")) {
                    imgView.setImageResource(R.drawable.kot4);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void setImage(ImageView imgView, int index) {
        int resId = getResources().getIdentifier(pictures[index], "drawable", getPackageName());
        imgView.setImageResource(resId);
    }
}
