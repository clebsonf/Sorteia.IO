package com.ixion.sorteiaio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void modifyText(View v){
        TextView textView = findViewById(R.id.textView3);
        textView.setVisibility(v.VISIBLE);
        Random random = new Random();
        int valor = random.nextInt(10);
        String texto = "O numero sorteado foi: "+ valor;
        textView.setText(texto);
    }
}
