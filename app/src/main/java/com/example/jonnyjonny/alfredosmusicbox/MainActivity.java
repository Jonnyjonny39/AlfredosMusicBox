package com.example.jonnyjonny.alfredosmusicbox;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private Button btnEnter;
    private ActionProvider mShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnter=findViewById(R.id.btnEnter);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ViewPagerActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.share_menu2,menu);




        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_item_share4:
                switch (item.getItemId()){
                    case R.id.menu_item_share4:
                      try{
                          Intent shareIntent=new Intent(Intent.ACTION_SEND);
                          shareIntent.setType("text/plain");
                          shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Alfredo's MusicBox");
                          String shareMessage="Come Check Out My Music!";
                          shareMessage=shareMessage+"https://www.alfredosgroove.com"+BuildConfig.APPLICATION_ID;
                          shareIntent.putExtra(Intent.EXTRA_TEXT,shareMessage);
                          startActivity(Intent.createChooser(shareIntent,"Choose One"));

                      }catch (Exception e){
                          e.printStackTrace();
                      }

                break;
        }}

        return super.onOptionsItemSelected(item);
    }}

