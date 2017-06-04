package com.mrinal.randomnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    int number;

    public void makeToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
    public void randomNum(View view){

        EditText myText = (EditText) findViewById(R.id.typespace);
        int mynum = parseInt(myText.getText().toString());

        if (number > mynum){
           makeToast("Go Higher!");
        }
        else if(number < mynum){
            makeToast("Go Lower!");
        }
        else if(number == mynum){
            makeToast("hurray u guessed it right!!");
            Random num = new Random();
            number = num.nextInt(20) +1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random num = new Random();
         number = num.nextInt(20) +1;
    }
}
