package com.hrishique.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mail,pass;
    Button submit;
    RatingBar rate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mail=findViewById(R.id.mail);
        pass=findViewById(R.id.pass);
        submit=findViewById(R.id.submit);
        rate=findViewById(R.id.rate);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Toast.makeText(getApplicationContext(),"hello you have logged in",Toast.LENGTH_SHORT ).show();
             // Toast.makeText(getApplicationContext(),String.valueOf(rate),Toast.LENGTH_SHORT ).show();
                //Toast.makeText(getApplicationContext(),String.valueOf(mail)+"sec",Toast.LENGTH_SHORT).show();

            }
        });




    }
}
