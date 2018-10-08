package com.example.user.aplikasiberitaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage1 (View view) {

        Intent intent = new Intent ( this, berita.class);
        startActivity(intent);
    }
    public void sendMessage2 (View view) {
        Intent intent = new Intent(this, beritaa.class);
        startActivity(intent);
    }
    public void sendMessage3 (View view) {
        Intent intent = new Intent(this, beritaaa.class);
        startActivity(intent);
    }
    public void sendMessage4 (View view) {
        Intent intent = new Intent(this, beritaaaa.class);
        startActivity(intent);
    }
}
