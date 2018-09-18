package com.example.amanhans.intelligent_routeplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_waypoints).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.btn_waypoints) {
            goToWaypointsDirection();
        }

    }

    private void goToWaypointsDirection() {

        openActivity(Main2Activity.class);
    }

    private void openActivity(Class<Main2Activity> main2ActivityClass) {
        startActivity(new Intent(this, main2ActivityClass));
    }
}
