package com.example.academy_intern.loginapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Reset_Activity extends AppCompatActivity {

    Datasource da = new Datasource();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_);
    }


    public void newp (View v)
    {
        EditText em = findViewById(R.id.re);
        EditText pas = findViewById(R.id.newPas);


        String email = em.getText().toString();



                if(da.search(email)) {
                    if(!email.isEmpty()) {
                        if(!email.startsWith(" ")) {
                            View c = findViewById(R.id.y);
                            c.setVisibility(View.VISIBLE);
                            View b = findViewById(R.id.newPas);
                            b.setVisibility(View.VISIBLE);
                            pas.setText(da.cornfirmPas(email));
                        }else
                        {
                            Toast.makeText(this, "You Cannot Start With A Space", Toast.LENGTH_LONG).show();
                        }
                    }else
                    {
                        Toast.makeText(this, "Please Enter Your E-mail", Toast.LENGTH_LONG).show();
                    }

                }
                else
                {
                    Toast.makeText(this, "Your E-mail is not Registered, Try To Register", Toast.LENGTH_LONG).show();
                }

}






    public void back (View v)
    {
        Intent intent = new Intent(Reset_Activity.this, MainActivity.class);
        startActivity(intent);
    }

}
