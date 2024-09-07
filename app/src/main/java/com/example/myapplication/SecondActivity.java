package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



                LayoutInflater inflater = getLayoutInflater();
                @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View layout = inflater.inflate(R.layout.custom_toast, findViewById(R.id.custom_toast_layout));


                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);

                @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button dress =findViewById(R.id.btn_dress);

                dress.setOnClickListener(new View.OnClickListener(){
                    @Override
            public void onClick(View v) {

                toast.show();
            }
        });
    }
}