    package com.example.myapplication;

    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;

    import androidx.activity.EdgeToEdge;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.core.graphics.Insets;
    import androidx.core.view.ViewCompat;
    import androidx.core.view.WindowInsetsCompat;

    public class MainActivity extends AppCompatActivity {
        String number1;
        String number2;
        String actionType;

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

        public void numberClick(View view) {
            EditText ioField = findViewById(R.id.editTextText);
            Button btn = (Button) view;
            ioField.append(btn.getText());
        }

        public void reset(View view) {
            EditText ioField = findViewById(R.id.editTextText);
            ioField.setText("");
        }

        public void actionClick(View view) {
            EditText ioField = findViewById(R.id.editTextText);
            Button btn = (Button) view;
            actionType = btn.getText().toString();
            number1 = ioField.getText().toString();

            ioField.setText("");
        }

        public void equals(View view) {
            if(number1 != "" && actionType != "") {
                EditText ioField = findViewById(R.id.editTextText);
                number2 = ioField.getText().toString();

                if(actionType.equals("+")) {
                    int res = (Integer.parseInt(number1)) + (Integer.parseInt(number2));
                    ioField.setText(Integer.toString(res));
                }
                else if(actionType.equals("-")) {
                    int res = (Integer.parseInt(number1)) - (Integer.parseInt(number2));
                    ioField.setText(Integer.toString(res));
                }
                else if(actionType.equals("*")) {
                    int res = (Integer.parseInt(number1)) * (Integer.parseInt(number2));
                    ioField.setText(Integer.toString(res));
                }
                else if(actionType.equals("/")) {
                    if(number2.equals("0")) {
                        ioField.setText("Error");
                        return;
                    }

                    int res = (Integer.parseInt(number1)) / (Integer.parseInt(number2));
                    ioField.setText(Integer.toString(res));
                }
            }
        }
    }