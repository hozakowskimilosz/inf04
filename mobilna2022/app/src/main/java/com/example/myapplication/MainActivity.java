package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int likes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtLikes = findViewById(R.id.textView9);
        Button btnLike = findViewById(R.id.button4);
        Button btnDelete = findViewById(R.id.button5);

        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                likes++;
                txtLikes.setText(likes + " polubień");
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(likes <= 0) return;

                likes--;
                txtLikes.setText(likes + " polubień");
            }
        });
    }
}