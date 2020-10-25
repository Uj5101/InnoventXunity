package com.example.innoventx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.unity3d.player.UnityPlayerActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private WebView webView;
    ImageView ImageContact, Imagearduino, ImageArvr, ImageBluetooth;
    private static final String TAG = "MainActivity";
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
    TextView TextContact, Textblueetooth, TextArduino, TextArvr;
    CardView arvr, contactUs, arduino, bluetooth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbarhome);
        setSupportActionBar(toolbar);

        arvr = findViewById(R.id.arvr);
        contactUs = findViewById(R.id.contactus);
        arduino = findViewById(R.id.arduino);
        bluetooth = findViewById(R.id.bluetooth);

        ImageContact = findViewById(R.id.imgcontact);
        Imagearduino = findViewById(R.id.imgardui);
        ImageBluetooth = findViewById(R.id.imgbluetooth);
        ImageArvr = findViewById(R.id.imgArvr);

        TextContact = findViewById(R.id.textContact);
        TextArduino = findViewById(R.id.textarduino);
        Textblueetooth = findViewById(R.id.textbluetooth);
        TextArvr = findViewById(R.id.textArvr);

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

        arvr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arvr.setCardBackgroundColor(getResources().getColor(R.color.purple));
                arvr.animate().scaleX(1.05f).scaleY(1.05f).setDuration(1000);
                ImageArvr.setColorFilter(Color.WHITE);
                TextArvr.setTextColor(Color.WHITE);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MainActivity.this, UnityPlayerActivity.class);
                        startActivity(intent);
                    }
                }, 1000);
                Log.d(TAG, "onClick: arvr");
            }
        });

        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contactUs.setCardBackgroundColor(getResources().getColor(R.color.purple));
                contactUs.animate().scaleX(1.05f).scaleY(1.05f).setDuration(1000);
                ImageContact.setColorFilter(Color.WHITE);
                TextContact.setTextColor(Color.WHITE);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivityForResult(new Intent(MainActivity.this, bt2.class), 0);
                    }
                }, 1000);
                Log.d(TAG, "onClick: contact us");
            }
        });

        bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bluetooth.setCardBackgroundColor(getResources().getColor(R.color.purple));
                bluetooth.animate().scaleX(1.05f).scaleY(1.05f).setDuration(1000);
                ImageBluetooth.setColorFilter(Color.WHITE);
                Textblueetooth.setTextColor(Color.WHITE);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivityForResult(new Intent(MainActivity.this, third.class), 0);
                    }
                }, 1000);
                Log.d(TAG, "onClick: contact us");
            }
        });

        arduino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arduino.setCardBackgroundColor(getResources().getColor(R.color.purple));
                arduino.animate().scaleX(1.05f).scaleY(1.05f).setDuration(1000);
                TextArduino.setTextColor(Color.WHITE);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivityForResult(new Intent(MainActivity.this, Arduino.class), 0);
                    }
                }, 1000);
                Log.d(TAG, "onClick: contact us");
            }
        });

    }

    @Override
    public void onResume(){
        super.onResume();
        // put your code here...
        contactUs.setCardBackgroundColor(getResources().getColor(R.color.card));
        contactUs.animate().scaleX(1.0f).scaleY(1.0f);
        ImageContact.setColorFilter(getResources().getColor(R.color.ImageColor));
        TextContact.setTextColor(getResources().getColor(R.color.TextColor));

        arvr.setCardBackgroundColor(getResources().getColor(R.color.card));
        arvr.animate().scaleX(1.0f).scaleY(1.0f);
        ImageArvr.setColorFilter(getResources().getColor(R.color.ImageColor));
        TextArvr.setTextColor(getResources().getColor(R.color.TextColor));

        bluetooth.setCardBackgroundColor(getResources().getColor(R.color.card));
        bluetooth.animate().scaleX(1.0f).scaleY(1.0f);
        ImageBluetooth.setColorFilter(getResources().getColor(R.color.ImageColor));
        Textblueetooth.setTextColor(getResources().getColor(R.color.TextColor));

        arduino.setCardBackgroundColor(getResources().getColor(R.color.card));
        arduino.animate().scaleX(1.0f).scaleY(1.0f);
        TextArduino.setTextColor(getResources().getColor(R.color.TextColor));
        Log.d(TAG, "onResume: onresume");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return false;
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        drawerLayout.closeDrawer(GravityCompat.START);
        switch (menuItem.getItemId()) {
            case R.id.home:
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.Aboutus:
                Intent intent1 = new Intent(MainActivity.this, second.class);
                startActivity(intent1);
                return true;
            case R.id.website:
                Intent intent3 = new Intent(MainActivity.this, bt1.class);
                startActivity(intent3);
                return true;
            case R.id.contactus:
                Intent intent2 = new Intent(MainActivity.this, bt2.class);
                startActivity(intent2);
                return true;
        }

        return true;
    }
}
