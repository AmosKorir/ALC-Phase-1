package com.imei.alcchallenge1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  private Button profile, about;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setTitle(getResources().getString(R.string.alc_title));
    profile = findViewById(R.id.profiler);
    about = findViewById(R.id.about);
    profile.setOnClickListener(j -> startActivity(new Intent(MainActivity.this, Profile.class)));
    about.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, About.class)));
  }
}
