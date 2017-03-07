package com.example.piko.project2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by piko on 3/6/17.
 */

public class Profile extends AppCompatActivity {
    String user_name;
    TextView tv;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        if(savedInstanceState == null){
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                user_name= null;
            }else{
                user_name=extras.getString("user_name");
            }
        }else{
            user_name= (String) savedInstanceState.getSerializable("user_name");

        }

        tv =(TextView) findViewById(R.id.greeting);
        tv.setText("Hello\n " + user_name);
    }
}
