package com.cosmah.uibasics;
import android.os.SystemClock;
import android.view.View.OnLongClickListener;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //declare as a field
    private TextView TextHere;
    private EditText edtxtName;

    //checkboxes
    private CheckBox checkBoxCal, checkBoxMat,checkBoxVec;

    //radio buttons
    private RadioGroup rgMarital;

    //progress bar
    private ProgressBar progressBar;


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

        //checkbox
        checkBoxCal = findViewById(R.id.checkboxCal);
        checkBoxMat = findViewById(R.id.checkboxMat);
        checkBoxVec = findViewById(R.id.checkboxVec);



        //calculus listener
        if (checkBoxCal.isChecked()){
            Toast.makeText(MainActivity.this, "You've learnt Calculus !!!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "You need to learn calculus", Toast.LENGTH_SHORT).show();
        }
        checkBoxCal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "You've learnt Calculus !!!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "You need to learn calculus", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //matrix listener
        if (checkBoxMat.isChecked()){
            Toast.makeText(MainActivity.this, "You've learnt Matrix !!!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "You need to learn Matrix", Toast.LENGTH_SHORT).show();
        }
        checkBoxMat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "You've learnt Matrix!!!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "You need to learn Matrix", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //vector listener
        if (checkBoxVec.isChecked()){
            Toast.makeText(MainActivity.this, "You've learnt vectors !!!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "You need to learn vectors", Toast.LENGTH_SHORT).show();
        }
        checkBoxVec.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "You've learnt Vectors !!!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "You need to learn vectors", Toast.LENGTH_SHORT).show();
                }
            }
        });



        //radio button
        rgMarital = findViewById(R.id.rgMarital);
        //listener
        rgMarital.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbMarried){
                    Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                }else if(checkedId == R.id.rbSingle){
                    Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                }else if (checkedId == R.id.rbRel){
                    Toast.makeText(MainActivity.this, "In a relationship", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Please choose one option", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.VISIBLE);
                }
            }
        });



        //progress bar
        progressBar = findViewById(R.id.progresBar);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++){
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(500);
                }
            }
        });
        thread.start();

        progressBar.getProgress();




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