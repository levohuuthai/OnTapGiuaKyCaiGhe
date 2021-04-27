package com.example.ongiuakycaighe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    RecyclerView recycle1;
    ArrayList<DataGhe> arrayList;
    AdapterGhe3 adapterGhe3;
    TextView tvGiaChonC;
    TextView tvNameChonC;
    ImageView imgGheC;
    int img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        recycle1 = findViewById(R.id.recycle1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recycle1.setLayoutManager(layoutManager);

        arrayList = new ArrayList<>();

        String name = "";
         img1 = 0;
        String gia = "";
        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            name = extras.getString("name");
            img1 = extras.getInt("img");
            gia = extras.getString("gia");

        }

        //imgGheC = findViewById(R.id.imgGheChonC);
       // imgGheC.setImageAlpha(img);
       // tvGiaChonC = findViewById(R.id.tvGiaChonC);
       //tvGiaChonC.setText("dd");
        //tvNameChonC = findViewById(R.id.tvNameChonC);
        //tvNameChonC.setText(name);



        arrayList.add(new DataGhe(img1,gia,name));
        adapterGhe3 = new AdapterGhe3(arrayList,getApplicationContext());
        recycle1.setAdapter(adapterGhe3);
/*
        arrayList = new ArrayList<>();
        arrayList = DSGheC.getInstance().getDSGHE();
        adapterGhe3 = new AdapterGhe3(arrayList,getApplicationContext());
        recycle1.setAdapter(adapterGhe3);*/

    }
}