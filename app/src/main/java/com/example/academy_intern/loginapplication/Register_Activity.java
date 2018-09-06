package com.example.academy_intern.loginapplication;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class Register_Activity extends AppCompatActivity {

    Datasource data = new Datasource();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);







        /*reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {







            }
        });*/







    }






    public void btnReg (View v)
    {
        EditText first = findViewById(R.id.first);
        EditText last = findViewById(R.id.last);
        EditText email = findViewById(R.id.email);
        EditText pass = findViewById(R.id.password);
        EditText con_pass = findViewById(R.id.corn_pass);


                String f = first.getText().toString();
                String l = last.getText().toString();
                String e = email.getText().toString();
                String p = pass.getText().toString();
                String pas = con_pass.getText().toString();
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                String emailPattern2 = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+\\.+[a-z]+";
                String namePattern = "[a-zA-Z]+";

                if(!f.isEmpty() && !l.isEmpty() && !e.isEmpty() && !p.isEmpty() && !pas.isEmpty()) {
                    if(f.matches(namePattern) && l.matches(namePattern)) {
                        if ((e.matches(emailPattern) || e.matches(emailPattern2)) && e.length() > 0) {


                            if (pas.equals(p)) {
                                if (!data.none(e)) {
                                    if (!f.startsWith(" ") && !l.startsWith(" ") && !e.startsWith(" ") && !p.startsWith(" ") && !pas.startsWith(" ")) {
                                        User u = new User(f, l, e, p, pas);
                                        Datasource dat = new Datasource();

                                        dat.addUser(u);

                                        Toast.makeText(this, "SUCCESSFULLY REGISTERED!!!", Toast.LENGTH_LONG).show();


                                        Intent intent = new Intent(Register_Activity.this, MainActivity.class);
                                        startActivity(intent);
                                    } else {
                                        Toast.makeText(this, "You cannot start with a SPACE", Toast.LENGTH_LONG).show();
                                    }
                                } else {
                                    Toast.makeText(this, "The E-mail Address is already registered, try another one", Toast.LENGTH_LONG).show();
                                }
                            } else {
                                Toast.makeText(this, "Passwords Don't Match!!!", Toast.LENGTH_LONG).show();

                            }

                        } else {
                            Toast.makeText(this, "Invalid E-mail Format", Toast.LENGTH_LONG).show();
                        }
                   }else
                    {
                        Toast.makeText(this, "Name and Surname Should Contain ALPHABETS Only", Toast.LENGTH_LONG).show();
                    }






                }
                else
                    Toast.makeText(this,"Please Complete all FIELDS", Toast.LENGTH_LONG).show();






    }
}
