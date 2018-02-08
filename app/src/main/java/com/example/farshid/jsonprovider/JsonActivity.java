package com.example.farshid.jsonprovider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JsonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);
        TextView textView_json= (TextView) findViewById(R.id.textView_Json);
        textView_json.setText(getIntent().getStringExtra("Json"));
    }
}
