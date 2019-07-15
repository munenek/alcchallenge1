package com.foreverrafs.challengeone;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Toolbar mToolbar;
    Button mBtnMyProfile;
    Button mBtnAboutAlc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize views
        mToolbar = findViewById(R.id.toolbar);
        mBtnMyProfile = findViewById(R.id.btnAboutAlc);
        mBtnAboutAlc = findViewById(R.id.btnMyProfile);

        //Attach click listeners
        mBtnMyProfile.setOnClickListener(this);
        mBtnAboutAlc.setOnClickListener(this);

        setSupportActionBar(mToolbar);


    }

    @Override
    public void onClick(View view) {
        Log.d("TAG", "onClick: ");
        Intent intent = new Intent();

        switch (view.getId()) {
            case R.id.btnAboutAlc:
                intent.setClass(this, AboutALCActivity.class);
                break;

            case R.id.btnMyProfile:
                intent.setClass(this, MyProfileActivity.class);
                break;

            default:
                Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
                break;
        }

        startActivity(intent);
    }
}
