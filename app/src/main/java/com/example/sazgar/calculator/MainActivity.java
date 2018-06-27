package com.example.sazgar.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView textView = (TextView) findViewById(R.id.text);

        final Button button7 = (Button) findViewById(R.id.button7);


        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                textView.setText(button7.getText());

            }
        });


        final Button button8 = (Button) findViewById(R.id.button8);


        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                textView.setText(button8.getText());

            }
        });
        final Button button9 = (Button) findViewById(R.id.button9);


        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                textView.setText(button9.getText());
            }
        });
        final Button button6 = (Button) findViewById(R.id.button6);


        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                textView.setText(button6.getText());
            }
        });
        final Button button5 = (Button) findViewById(R.id.button5);


        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                textView.setText(button5.getText());
            }
        });
        final Button button4 = (Button) findViewById(R.id.button4);


        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                textView.setText(button4.getText());
            }
        });
        final Button button3 = (Button) findViewById(R.id.button3);


        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                textView.setText(button3.getText());
            }
        });
        final Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

            textView.setText(button2.getText());
        }
    }

    );
    final Button button1 = (Button) findViewById(R.id.button1);


    button1.setOnClickListener(new View.OnClickListener()

    {
        public void onClick (View v){

        textView.setText(button1.getText());
    }
    }

    );
}
}
