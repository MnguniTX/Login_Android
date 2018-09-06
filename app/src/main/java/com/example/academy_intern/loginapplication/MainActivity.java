package com.example.academy_intern.loginapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void btnReg (View v)
    {
        Intent intent = new Intent(MainActivity.this, Register_Activity.class);
        startActivity(intent);


    }

    public void btnPers(View v)
    {
        EditText emm = findViewById(R.id.em);
        EditText paas = findViewById(R.id.pas);

        String email = emm.getText().toString();
        String pass = paas.getText().toString();

        Datasource da = new Datasource();

        if(!email.isEmpty() && !pass.isEmpty()) {

            if (da.isValid(email, pass)) {
                Intent intent = new Intent(MainActivity.this, Personal_Activity.class);
                startActivity(intent);
            } else
                Toast.makeText(this, "YOU ARE NOT REGISTERED, REGISTER FIRST", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Please Enter Your E-mail and Password First To LOGIN", Toast.LENGTH_LONG).show();
        }


    }

    public void reset (View v)
    {
        Intent intent = new Intent(MainActivity.this, Reset_Activity.class);
        startActivity(intent);
    }
}
