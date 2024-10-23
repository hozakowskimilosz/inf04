package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickShow(View view) {
        FrameLayout frameLayout = findViewById(R.id.frameLayout);
        TableLayout tableLayout = findViewById(R.id.tableLayout);
        frameLayout.setVisibility(View.VISIBLE);
        tableLayout.setVisibility(View.INVISIBLE);
        ImageView imageView = (ImageView) view;
        ImageView bigImage = findViewById(R.id.imageView17);

        bigImage.setImageDrawable(imageView.getDrawable());
    }

    public void onClickHide(View view) {
        FrameLayout frameLayout = findViewById(R.id.frameLayout);
        TableLayout tableLayout = findViewById(R.id.tableLayout);
        frameLayout.setVisibility(View.INVISIBLE);
        tableLayout.setVisibility(View.VISIBLE);
    }
}