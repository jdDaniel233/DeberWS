package com.example.deberws;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class potenciaActivity extends AppCompatActivity {
    EditText txtn1, txtn2, txtresultado;
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potencia);

        txtn1 = findViewById(R.id.txtn1);
        txtn2 = findViewById(R.id.txtn2);
        txtresultado = findViewById(R.id.txtresultado);
        btnCalcular = findViewById(R.id.btnCalcular);

        /*btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LeerWs();
            }
        });*/

    }

    public void LeerWs(View view){
        String url= "https://apifunciones.azurewebsites.net/Funciones/Potencia?n1=4&n2=2";

        StringRequest postRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //CAPTURAR LA INFO DEL WS
                try {

                    JSONObject jsonObject = new JSONObject(response);
                    txtn1.setText(jsonObject.getString("n1"));
                    txtn2.setText(jsonObject.getString("n2"));
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("error", error.getMessage());

            }
        });
        Volley.newRequestQueue(this).add(postRequest);
    }
}