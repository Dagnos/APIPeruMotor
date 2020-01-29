package com.example.motorproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button prueba_ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prueba_ingresar = (Button)findViewById(R.id.ingresar);

        prueba_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prueba_ingresar = new Intent(MainActivity.this, ListActivity.class);
                startActivity(prueba_ingresar);
            }
        });
    }
}
