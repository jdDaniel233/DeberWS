package com.example.deberws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FgeneralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fgeneral);
    }
    public void irAtras(View view){
        Intent intent=new Intent(this,MainActivity.class);
        view.getContext().startActivity(intent);
    }
}