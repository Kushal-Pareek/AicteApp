package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView con;
   Button insta;
   Button face;
//public static final String EXTRA_NAME = "com.example.multiscreen.extra.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        con = findViewById(R.id.connect);
       insta = findViewById(R.id.instagram);
        face = findViewById(R.id.facebook);
       con.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              gotoUrl("https://www.aicte-india.org/");
            }
       });
       insta.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               gotoUrl( "https://www.instagram.com/aicte_official/?utm_medium=copy_link");
            }
        });
        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl( "https://www.facebook.com/OfficialAICTE/");
            }
        });
   }


    public void openActivity(View v) {
        Toast.makeText(this, "Please Wait!! Sign in page is opening", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
    private void gotoUrl(String s) {
       Uri uri = Uri.parse(s);
       startActivity(new Intent(Intent.ACTION_VIEW,uri));
  }
}



//    TextView tweet;
//    Button insta;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        tweet = findViewById(R.id.twitter);
//        insta = findViewById(R.id.instagram);
//        tweet.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                gotoUrl("https://www.codewithharry.com/");
//            }
//        });
//        insta.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                gotoUrl( "https://www.youtube.com/");
//            }
//        });
//    }
//
//    private void gotoUrl(String s) {
//        Uri uri = Uri.parse(s);
//        startActivity(new Intent(Intent.ACTION_VIEW,uri));
//    }
//}