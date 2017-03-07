package com.example.piko.project2017;

//import android.databinding.DataBindingUtil;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//import com.example.piko.project2017.databinding.ActivityLoginBinding;
//data binding musts be enabled in gradle.build,
//a Binding class will be generated based on the name of the layout file, converting it to Pascal case and suffixing "Binding" to it.
//xml file root must be a <layout>
//import com.example.piko.project2017.databinding.ActivityLoginBinding;


public class MainActivity extends AppCompatActivity {
EditText usernameEt,passwordEt;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //binding object help use layout object more easily
      // ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        usernameEt = (EditText) findViewById(R.id.etUsername);
        passwordEt =(EditText) findViewById(R.id.etPassword);

    }

    public void doLogin(View view){
         String username = usernameEt.getText().toString();
         String password = passwordEt.getText().toString();
         String type = "login";
        BackgroundWorker backgroundWorker =  new BackgroundWorker(this);//THIS
        //        BackgroundWorker backgroundWorker =  new BackgroundWorker(MainActivity.this);//THIS
        //THIS gives us the context which is the current state of the application/object
        backgroundWorker.execute(type,username,password);



    }
}
