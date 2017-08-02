package com.example.administrator.yy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        feature();
    }

    private void feature() {

        Toast.makeText(MainActivity.this,"这是第一个分支",Toast.LENGTH_LONG).show();
    }
}
