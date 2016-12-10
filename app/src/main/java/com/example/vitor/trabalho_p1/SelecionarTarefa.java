package com.example.vitor.trabalho_p1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelecionarTarefa extends MainActivity {

    private Button btnSair;

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
    }
}
