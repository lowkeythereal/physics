package com.example.s432825.physics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox massBox;
    CheckBox forceBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        massBox=findViewById(R.id.Mass);


    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        Intent intent=new Intent(this,EnterValues.class);
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.Mass:
                if (checked) {
                    intent.putExtra("CHECK", "Mass");
                }
                break;
            case R.id.Force:
                if (checked) {
                    intent.putExtra("CHECK", "Force");
                }
                break;
            case R.id.Acceleration:
                if (checked) {
                    intent.putExtra("CHECK", "Acceleration");
                }
                break;
            case R.id.Distance:
                if (checked) {
                    intent.putExtra("CHECK", "Distance");
                }
                break;
            case R.id.FinalVelocity:
                if (checked) {
                    intent.putExtra("CHECK", "FinalVelocity");
                }
                break;
            case R.id.InitialVelocity:
            if (checked) {
                intent.putExtra("CHECK", "InitialVelocity");
            }
                break;
            case R.id.Time:
            if (checked) {
                intent.putExtra("CHECK", "Time");
            }
        }
        startActivity(intent);
    }
 //   public void Next(View view) {
   //     Intent intent=new Intent(this,EnterValues.class);
     //   if (massBox.isSelected()){
       //     intent.putExtra("CHECK","Mass");
        //}else if (forceBox.isSelected()){
         //   intent.putExtra("CHECK","Force");
      //  }
       // startActivity(intent);
   // }
}
