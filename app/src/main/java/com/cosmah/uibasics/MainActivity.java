package com.cosmah.uibasics;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //implement onclick method
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnHello) {
            Toast.makeText(this, "Hi I'm Cosmah", Toast.LENGTH_SHORT).show();
            System.out.println("Hi I'm Cosmah");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //button listener
        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);
    }

    //onclick
    public void onHelloBtnClicked(View view){
        TextView txtWelcome = findViewById(R.id.txtWelcome);
        txtWelcome.setText("Hello Again");
    }



}