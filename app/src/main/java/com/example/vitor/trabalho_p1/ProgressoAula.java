package com.example.vitor.trabalho_p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgressoAula extends AppCompatActivity {

    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progresso_aula);

        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retornaSelecionarTarefa = new Intent (ProgressoAula.this, SelecionarTarefa.class);
                startActivity(retornaSelecionarTarefa);
            }
        });
    }
}
