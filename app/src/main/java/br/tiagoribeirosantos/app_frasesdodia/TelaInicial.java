/*
      Code by : Tiago Ribeiro Santos
      Date : 17/02/2021
      email : tiago.programador@hotmail.com
      WhatsApp : +55 27 99601-1693

      Initial class develop for start a application.
 */

package br.tiagoribeirosantos.app_frasesdodia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TelaInicial extends AppCompatActivity {
    Button btnGerarVitoria;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boasvindas);
        
        btnGerarVitoria = findViewById(R.id.btnGerarVitoria);
        
        btnGerarVitoria.setOnClickListener(new View.OnClickListener() {         //Se botão for clicado abre para nova atividade.
            @Override
            public void onClick(View v) {
                Intent intencaoBoasVindas = new Intent(TelaInicial.this,MainActivity.class);
                startActivity(intencaoBoasVindas);
            }
        });
    }
}
