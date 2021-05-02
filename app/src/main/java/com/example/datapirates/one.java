package com.example.datapirates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class one
        extends AppCompatActivity {

private Button button,button4;

    // Create the object of TextView
    TextView tvCases, tvRecovered,
            tvCritical, tvActive,
            tvTodayCases, tvTotalDeaths;

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

button=findViewById(R.id.button);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        openMainActivity();
    }
});

        button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeb1();
            }
        });



        getSupportActionBar().hide();//hides actionbar


        // Link those objects with their respective id's
        // that we have given in .XML file
        tvCases
                = findViewById(R.id.tvCases);
        tvRecovered
                = findViewById(R.id.tvRecovered);
        tvCritical
                = findViewById(R.id.tvCritical);
        tvActive
                = findViewById(R.id.tvActive);
        tvTodayCases
                = findViewById(R.id.tvTodayCases);
        tvTotalDeaths
                = findViewById(R.id.tvTotalDeaths);

        // Creating a method fetchdata()
        fetchdata();
    }

    private void fetchdata()
    {

        // Create a String request
        // using Volley Library
        String url = "https://corona.lmao.ninja/v2/all";

        StringRequest request
                = new StringRequest(
                Request.Method.GET,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response)
                    {

                        // Handle the JSON object and
                        // handle it inside try and catch
                        try {

                            // Creating object of JSONObject
                            JSONObject jsonObject
                                    = new JSONObject(
                                    response.toString());

                            // Set the data in text view
                            // which are available in JSON format
                            // Note that the parameter inside
                            // the getString() must match
                            // with the name given in JSON format
                            tvCases.setText(
                                    jsonObject.getString(
                                            "cases"));
                            tvRecovered.setText(
                                    jsonObject.getString(
                                            "recovered"));
                            tvCritical.setText(
                                    jsonObject.getString(
                                            "critical"));
                            tvActive.setText(
                                    jsonObject.getString(
                                            "active"));
                            tvTodayCases.setText(
                                    jsonObject.getString(
                                            "todayCases"));
                            tvTotalDeaths.setText(
                                    jsonObject.getString(
                                            "deaths"));
                        }
                        catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                        Toast.makeText(
                                one.this,
                                error.getMessage(),
                                Toast.LENGTH_SHORT)
                                .show();
                    }
                });

        RequestQueue requestQueue
                = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

    public void openMainActivity(){
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void openWeb1(){
        Intent intent=new Intent(this, Worldweb.class);
        startActivity(intent);
    }

}

