package com.example.ongiuakycaighe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity2 extends AppCompatActivity {
    ImageView imgGheChon;
    TextView tvGiaChon,tvNameChon;
    Button btnAddToCart;
    String name;
    String price;
    int img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img = 0;
         name ="dddsdsd";
        price= "dd";
        Bundle extras =getIntent().getExtras();
        if(extras!=null){
            img = extras.getInt("img");
            price = extras.getString("price");
            name = extras.getString("name");
        }
        imgGheChon = findViewById(R.id.imgGheChon);
        tvGiaChon = findViewById(R.id.tvGiaChon);
        tvNameChon = findViewById(R.id.tvNameChon);
        imgGheChon.setImageResource(img);
        tvGiaChon.setText(price);
        tvNameChon.setText(name);

        int finalimg = img;
        String finalgia = price;
        String finalName = name;
        btnAddToCart = findViewById(R.id.btnAddToCart);
        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                intent.putExtra("name",tvNameChon.getText());
                intent.putExtra("gia",tvGiaChon.getText());
                intent.putExtra("img",(Serializable) imgGheChon.getTag());
                startActivity(intent);


                DataGhe ghe = new DataGhe(Integer.parseInt(String.valueOf(finalimg)),finalgia.toString(),finalName.toString());
                DSGheC.getInstance().themGhe(ghe);
            }
        });













    }
}