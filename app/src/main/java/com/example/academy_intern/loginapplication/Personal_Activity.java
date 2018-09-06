package com.example.academy_intern.loginapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Personal_Activity extends AppCompatActivity {

    Datasource da = new Datasource();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_);

        TextView list = findViewById(R.id.pers);






        list.setText(da.all());



    }

    public void btnSea(View v)
    {
        View b = findViewById(R.id.enter_email);
        b.setVisibility(View.VISIBLE);

        View d = findViewById(R.id.okay);
        d.setVisibility(View.VISIBLE);

    }

    public void ok(View v)
    {
        EditText sea = findViewById(R.id.enter_email);
        String ok = sea.getText().toString();
        TextView li = findViewById(R.id.results);

            if(!ok.isEmpty()) {
                if(!ok.contains(" ")) {

                    if (da.search(ok)) {
                        li.setText(da.display(ok));
                    } else {
                        li.setText("The E-mail Address is not REGISTERED");
                    }
                }else
                {
                    li.setText("A Space is not allowed, Try Again");
                }
            }
            else
            {
                    li.setText("Enter E-mail first to search");
            }


    }


    public void out(View v)
    {
        Intent intent = new Intent(Personal_Activity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(this,"THANK YOU FOR USING MY APP, GOODBYE", Toast.LENGTH_LONG).show();
    }

    public void google(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(intent);
    }
}
