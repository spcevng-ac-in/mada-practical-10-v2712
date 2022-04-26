package com.example.practical_7;

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
    public void setCat(View v){
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("imagesrc","cat");
        startActivity(i);
    }
    public void setPeacock(View v){
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("imagesrc","peacock");
        startActivity(i);
    }
    public void setLeopard(View v){
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("imagesrc","leopard");
        startActivity(i);
    }
    public void setDolphin(View v){
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("imagesrc","dolphin");
        startActivity(i);
    }
}