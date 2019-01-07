package com.example.s432825.physics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EnterValues extends AppCompatActivity {
    EditText massText;
    EditText forceText;
    EditText accelerationText;
    EditText distanceText;
    EditText finalVelocityText;
    EditText initialVelocityText;
    EditText timeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_values);
        massText=findViewById(R.id.Mass);
        forceText=findViewById(R.id.Force);
        accelerationText=findViewById(R.id.Acceleration);
        distanceText=findViewById(R.id.Distance);
        finalVelocityText=findViewById(R.id.FinalVelocity);
        initialVelocityText=findViewById(R.id.InitialVelocity);
        timeText=findViewById(R.id.Time);

        Intent intent=getIntent();
        String message=intent.getStringExtra("CHECK");
        if (message.equals("Mass")) {
            massText.setVisibility(View.GONE);
        }
        if(message.equals("Force")) {
            forceText.setVisibility(View.GONE);
        }
        if(message.equals("Acceleration")) {
            accelerationText.setVisibility(View.GONE);
        }
        if(message.equals("Distance")) {
            distanceText.setVisibility(View.GONE);
        }
        if(message.equals("FinalVelocity")) {
            finalVelocityText.setVisibility(View.GONE);
        }
        if(message.equals("InitialVelocity")) {
            initialVelocityText.setVisibility(View.GONE);
        }
        if(message.equals("Time")) {
            timeText.setVisibility(View.GONE);
        }


        }
    }



