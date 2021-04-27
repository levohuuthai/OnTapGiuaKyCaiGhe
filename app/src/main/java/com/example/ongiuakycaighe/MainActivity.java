package com.example.ongiuakycaighe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    AdapterGhe adapterGhe;
    ArrayList<DataGhe> arrGhe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycle;
        recycle = findViewById(R.id.recycle);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        recycle.setLayoutManager(layoutManager);

        arrGhe = new ArrayList<>();
        arrGhe.add(new DataGhe(R.drawable.images3,"$550","Matteo Armchair","+"));
        arrGhe.add(new DataGhe(R.drawable.images5,"$350","Morden Armchair","+"));
        arrGhe.add(new DataGhe(R.drawable.images1,"$250","Nice Armchair","+"));
        arrGhe.add(new DataGhe(R.drawable.images2,"$350","Circle Armchair","+"));

        adapterGhe = new AdapterGhe(arrGhe,getApplicationContext());
        recycle.setAdapter(adapterGhe);

        adapterGhe.setOnitemClick(new AdapterGhe.OnitemClickListener() {
            @Override
            public void onItemclick(int position) {
                changeItem(position);
            }


        });


    }
    private void changeItem(int position) {
        intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("img",arrGhe.get(position).getGhe());
        intent.putExtra("price",arrGhe.get(position).getPrice());
        intent.putExtra("name",arrGhe.get(position).getName());
        startActivity(intent);
        adapterGhe.notifyItemChanged(position);


    }
}