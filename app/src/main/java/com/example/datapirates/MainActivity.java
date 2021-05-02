package com.example.datapirates;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.FileAsyncHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;


@RequiresApi(api = Build.VERSION_CODES.M)
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvCases, tvRecovered;
    

    public CardView card1,card2,card3,card4;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // HIDES THE TOP

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();//hides actionbar

        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);
        card3 = (CardView) findViewById(R.id.c3);
        card4 = (CardView) findViewById(R.id.c4);

        card1.setOnClickListener((View.OnClickListener) this);
        card2.setOnClickListener((View.OnClickListener) this);
        card3.setOnClickListener((View.OnClickListener) this);
        card4.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View v) {
        Intent i;



        switch (v.getId()) {
            case R.id.c1:
                i = new Intent(this, one.class);
                startActivity(i);
                break;
            case R.id.c2:
                i = new Intent(this, two.class);
                startActivity(i);
                break;
            case R.id.c3:
                i = new Intent(this, webmap.class);
                startActivity(i);
                break;
            case R.id.c4:
                i = new Intent(this, Prevention.class);
                startActivity(i);
                break;
        }
    }
}