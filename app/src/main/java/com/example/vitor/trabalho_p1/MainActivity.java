package com.example.vitor.trabalho_p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btnAcessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAcessar = (Button) findViewById(R.id.btnAcessar);

        btnAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chamaSelecionarTarefa = new Intent(MainActivity.this, SelecionarTarefa.class);
                startActivity(chamaSelecionarTarefa);

            }
        });



    }


}
