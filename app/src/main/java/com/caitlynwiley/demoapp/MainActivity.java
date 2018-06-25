package com.caitlynwiley.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sayHello(View view) {
        EditText name = (EditText) findViewById(R.id.name);
        Log.i("HELLO", "Hello " + name.getText().toString() + "!");

        Toast.makeText(MainActivity.this, "Hello " + name.getText().toString() + "!", Toast.LENGTH_LONG).show();
    }
}
