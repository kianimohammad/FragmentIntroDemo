package com.f19.fragmentintrodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PositionActivity extends AppCompatActivity implements Listener {

    private boolean mIsDualPane = false;


    public void showDescription(View view) {
        Intent intent = new Intent(this, DescriptionActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View detailView = findViewById(R.id.description_frag);
        mIsDualPane = detailView != null && detailView.getVisibility() == View.VISIBLE;
    }

    @Override
    public void onItemClick(int id) {
        if (mIsDualPane) {
            DescriptionFragment descriptionFragment = (DescriptionFragment) getSupportFragmentManager().findFragmentById(R.id.description_frag);
            descriptionFragment.displayDetails(id);
        } else {

            Intent intent = new Intent(this, DescriptionActivity.class);
            intent.putExtra(DescriptionActivity.TAG, id);
            startActivity(intent);
        }
    }
}
