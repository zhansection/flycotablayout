package com.zhanke.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zhanke.demo.table.ui.SimpleHomeActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnTable);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//忽略文件
                Intent intent = new Intent(MainActivity.this, SimpleHomeActivity.class);
                startActivity(intent);
            }
        });
//fatal: pathspec '.idea' did not match any files
    }
}
