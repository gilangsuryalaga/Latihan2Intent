package com.example.latihan2intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonlogin;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonlogin = (Button) findViewById(R.id.buttonlogin);
        buttonlogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonlogin:
                Intent button1 = new Intent(MainActivity.this, Listview.class);
                startActivity(button1);
                break;
            default:
                break;
        }
    }
}
