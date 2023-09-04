package com.cosmah.uibasics;
import android.view.View.OnLongClickListener;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //declare as a field
    private TextView TextHere;
    private EditText edtxtName;
    //implement onclick method
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnHello) {
            Toast.makeText(this, "Hi I'm Cosmah", Toast.LENGTH_SHORT).show();
            TextHere.setText("Hello " + edtxtName.getText().toString());

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //button listener
        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);

        //on long click listener
        btnHello.setOnLongClickListener(new View.OnLongClickListener(){
            public boolean onLongClick(View v){
                Toast.makeText(MainActivity.this, "You've long pressed the button, please release", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        //edit and view
        edtxtName = findViewById(R.id.edtxtName);

        TextHere = findViewById(R.id.TextHere);
    }

    //onclick
    public void onHelloBtnClicked(View view){
        TextView txtWelcome = findViewById(R.id.txtWelcome);
        txtWelcome.setText("Hello Again");

    }



}