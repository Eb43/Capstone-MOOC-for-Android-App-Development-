package com.example.capstoneproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonTapGoogle (View v){
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Launching Google", Toast.LENGTH_LONG);
        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
        myWebLink.setData(Uri.parse("http://www.google.com"));
        startActivity(myWebLink);
        myToast.show();
    }

    public void onButtonTapBing (View v){
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Launching Bing", Toast.LENGTH_LONG);
        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
        myWebLink.setData(Uri.parse("http://www.bing.com"));
        startActivity(myWebLink);
        myToast.show();
    }
}