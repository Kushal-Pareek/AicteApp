package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;


        public class MainActivity2 extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main2);

//               TextView username = (TextView) findViewById(R.id.username);
//               TextView password = (TextView) findViewById(R.id.password);
//
//                MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
//               loginbtn.setOnClickListener(new View.OnClickListener() {
//                    @Override
//
//                   public void onClick(View view) {
//                        if (username.getText().toString().equals("Kushal") && password.getText().toString().equals("12345")) {
//                          //correct
//                           Toast.makeText(MainActivity2.this, "LOGIN SUCCESSFULLY", Toast.LENGTH_SHORT).show();
//                     } else
//                          //incorrect
//                         Toast.makeText(MainActivity2.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
//                  }
//
//                });

            }
            //  ********** NEW CODE FOR NEXT ACTIVITY **********
            public void openActivity(View v){

                Toast.makeText(MainActivity2.this,"login Success!! New Page is Opening",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,MainActivity4.class);
              startActivity(intent);
           }
        }


