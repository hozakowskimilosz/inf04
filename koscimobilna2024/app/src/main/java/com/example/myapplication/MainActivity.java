package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int currentGame = 0;
    public int overall = 0;
    public int[] dices = new int[5];

    TextView txtRoll;
    TextView txtGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txtRoll = findViewById(R.id.textView2);
        txtGame = findViewById(R.id.textView3);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void rollDice(View view) {
        currentGame = 0;

        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int dice = random.nextInt(6) + 1;

            ImageView imageView = findViewById(getResources().getIdentifier("imageView" + (i + 1), "id", getPackageName()));
            imageView.setImageResource(getResources().getIdentifier("dice" + dice, "drawable", getPackageName()));

            dices[i] = dice;
        }

        for (int i = 0; i < dices.length; i++) {
            for (int j = 0; j < dices.length; j++) {
                if (i != j && dices[i] == dices[j]) {
                    currentGame += dices[i];
                    break;
                }
            }
        }

        overall += currentGame;
        txtRoll.setText("Wynik tego losowania: " + currentGame);
        txtGame.setText("Wynik gry: " + overall);
    }

    public void reset(View view) {
        currentGame = 0;
        overall = 0;
        txtRoll.setText("Wynik tego losowania: " + currentGame);
        txtGame.setText("Wynik gry: " + overall);

        for (int i = 0; i < 5; i++) {
            ImageView imageView = findViewById(getResources().getIdentifier("imageView" + (i + 1), "id", getPackageName()));
            imageView.setImageResource(getResources().getIdentifier("diceunknown", "drawable", getPackageName()));
        }
    }
}
