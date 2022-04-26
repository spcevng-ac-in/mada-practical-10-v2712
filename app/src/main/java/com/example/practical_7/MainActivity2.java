package com.example.practical_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setImage();
    }
    public void setImage(){
        String s=getIntent().getStringExtra("imagesrc");
        ImageButton ib=(ImageButton) findViewById(R.id.image123);
        if(s.equals("cat"))
        ib.setImageResource(R.drawable.cat);
        else if(s.equals("leopard")){
            ib.setImageResource(R.drawable.leopard);
        }else if(s.equals("dolphin")){
            ib.setImageResource(R.drawable.dolphin);
        }else if(s.equals("peacock")){
            ib.setImageResource(R.drawable.peacock);
        }
    }
}