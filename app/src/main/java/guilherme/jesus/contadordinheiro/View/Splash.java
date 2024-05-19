package guilherme.jesus.contadordinheiro.View;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import guilherme.jesus.contadordinheiro.R;

public class Splash extends AppCompatActivity {
    int delay = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        trocarTela();

    }

    private void trocarTela(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent trocarDeTela = new Intent(Splash.this, MainActivity.class);
                startActivity(trocarDeTela);
                finish();


            }
        },delay);


    }

}