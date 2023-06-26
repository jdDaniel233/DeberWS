package com.example.deberws;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irPotencia(View view){
        Intent intent=new Intent(this,potenciaActivity.class);
        view.getContext().startActivity(intent);
    }

    public void irFormulaG(View view){
        Intent intent=new Intent(this,FgeneralActivity.class);
        view.getContext().startActivity(intent);
    }
    public void irTrinomioCP(View view){
        Intent intent=new Intent(this,TrinomiocpActivity.class);
        view.getContext().startActivity(intent);
    }
}