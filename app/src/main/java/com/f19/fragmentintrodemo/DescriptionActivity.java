package com.f19.fragmentintrodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        DescriptionFragment descriptionFragment = (DescriptionFragment) getSupportFragmentManager().findFragmentById(R.id.description_frag);
        descriptionFragment.setPosition_id(1);
    }
}
