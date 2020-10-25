package com.example.innoventx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class second extends AppCompatActivity {


    Toolbar toolbar;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        toolbar = findViewById(R.id.toolbarabout);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        toolbar = findViewById(R.id.toolbar2);
//        setSupportActionBar(toolbar);
//
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//       // getMenuInflater().inflate(R.menu.menubtv, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//
//        if (item.getItemId()==android.R.id.home){
//            finish();
//        }
//        return super.onOptionsItemSelected(item);
//    }
@Override
public boolean onOptionsItemSelected(@NonNull MenuItem item) {

    if (item.getItemId() == android.R.id.home) {
        finish();
    }
    return super.onOptionsItemSelected(item);
}


}
