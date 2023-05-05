package com.example.helloworld;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button submit=findViewById(R.id.submit);
final TextView operation=findViewById(R.id.operation);
        final TextView number1=findViewById(R.id.editTextNumber1);
        final TextView number2=findViewById(R.id.editTextNumber2);

//

////
        final TextView result=findViewById(R.id.result);
result.setEnabled(false);

        submit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
       final int num1=Integer.parseInt( number1.getText().toString());
       final int num2=Integer.parseInt(number2.getText().toString().trim());
       switch (operation.getText().toString().trim()) {
           case "+": {
               int num3 = num1 + num2;
               result.setText(num3+"");
               break;

           }
       case "*": {
               result.setText((num1 * num2)+"");
           break;

       }case "-": {
               result.setText((Math.abs(num1 - num2))+"");
               break;

           }case "/": {
               result.setText((num1 / num2)+"");
               break;
           }
           default:
               result.setText("error");



       }


    }
});



    }

//    public void onClickage(View view) {
//        EditText edAge=findViewById(R.id.edAge);
//      int age= Integer.parseInt(  edAge.getText().toString().trim());
//
//        Toast.makeText(this,"Age: "+age,Toast.LENGTH_LONG).show();
//        // this to show age
//        //3 parameter (this ,print , time show the messege)
//
//
//
//
//    }
    }
