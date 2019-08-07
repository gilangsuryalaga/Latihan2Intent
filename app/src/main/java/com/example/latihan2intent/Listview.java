package com.example.latihan2intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.latihan2intent.R;

import java.util.ArrayList;

public class Listview extends AppCompatActivity implements View.OnClickListener {

    ListView listview;
    Button button2;
    ArrayList<String> list = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listview=(ListView)findViewById(R.id.listview);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, list);
        listview.setAdapter(arrayAdapter);
        list.add("Rekayasa Perangkat Lunak");
        list.add("Multimedia");
        list.add("Teknik Komputer Jaringan");
        list.add("TOI");
        list.add("TITL");

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Intent button2 = new Intent(Listview.this, GridLayout.class);
                startActivity(button2);
                break;
            default:
                break;
        }
    }
}
