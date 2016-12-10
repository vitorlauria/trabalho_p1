package com.example.vitor.trabalho_p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelecionarTarefa extends MainActivity {

    private Button btnSair;
    private Button btnCadastro;
    private Button btnProgresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecionar_tarefa);

        btnSair = (Button) findViewById(R.id.btnSair);

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent retornaMainActivity = new Intent (SelecionarTarefa.this, MainActivity.class);
                startActivity(retornaMainActivity);
            }
        });

        btnCadastro = (Button) findViewById(R.id.btnCadastro);

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chamaCadastroALuno = new Intent (SelecionarTarefa.this, CadastroAluno.class);
                startActivity(chamaCadastroALuno);
            }
        });

        btnProgresso = (Button) findViewById(R.id.btnProgresso);

        btnProgresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chamaProgressoAula = new Intent (SelecionarTarefa.this, ProgressoAula.class);
                startActivity(chamaProgressoAula);
            }
        });
    }
}
