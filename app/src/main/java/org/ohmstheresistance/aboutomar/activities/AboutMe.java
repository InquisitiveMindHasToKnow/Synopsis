package org.ohmstheresistance.aboutomar.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.ohmstheresistance.aboutomar.R;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(0, 0);

    }
}

