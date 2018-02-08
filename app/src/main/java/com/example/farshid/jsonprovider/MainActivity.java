package com.example.farshid.jsonprovider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.farshid.jsonprovider.JsonProvider;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText_key= (EditText) findViewById(R.id.editText_Key);
        final EditText editText_value= (EditText) findViewById(R.id.editText_Value);
        Button button_make_json= (Button) findViewById(R.id.button_Make_Json);
        button_make_json.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               JSONObject jsonObject= JsonProvider.buildJsonObject(editText_key.getText().toString(),editText_value.getText().toString());
                Intent intent=new Intent(MainActivity.this,JsonActivity.class);
                intent.putExtra("Json",jsonObject.toString());
                startActivity(intent);
            }
        });
    }
}
