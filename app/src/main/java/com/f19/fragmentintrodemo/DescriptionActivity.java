package com.f19.fragmentintrodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class DescriptionActivity extends AppCompatActivity {

    public static final String TAG = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        DescriptionFragment descriptionFragment = (DescriptionFragment) getSupportFragmentManager().findFragmentById(R.id.description_frag);
        Intent intent = getIntent();
        int id = intent.getExtras().getInt(TAG);
        descriptionFragment.displayDetails(id);
    }
}
