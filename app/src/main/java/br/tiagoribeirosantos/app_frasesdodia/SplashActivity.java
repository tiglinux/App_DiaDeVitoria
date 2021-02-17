/*
      Code by : Tiago Ribeiro Santos
      Date : 17/02/2021
      email : tiago.programador@hotmail.com
      WhatsApp : +55 27 99601-1693

      Classe desenvolvida para Splash Atividade (inicializador de tela no aplicativo) roda por 2 segundos.
 */


package br.tiagoribeirosantos.app_frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_main);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarMenuPrincipal();
            }
        },2000);
    }
    private void mostrarMenuPrincipal(){
        Intent intencaoMostraVindas = new Intent(SplashActivity.this,TelaInicial.class);
        startActivity(intencaoMostraVindas);
        finish();
    }
}