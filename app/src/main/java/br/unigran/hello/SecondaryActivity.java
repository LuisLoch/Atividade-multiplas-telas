package br.unigran.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondaryActivity extends AppCompatActivity {
    String nomeInformado;
    TextView textViewTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        textViewTela2 = findViewById(R.id.textView2);
        nomeInformado = getIntent().getStringExtra("Nome");
        try {
            textViewTela2.setText("Olá " + nomeInformado + ", sou a segunda tela!");
        }catch (Exception e){
            Toast.makeText(this, "Erro ao obter o nome na primeira tela!", Toast.LENGTH_SHORT).show();
        }
    }

    public void nextScreen(View view){
        Intent intent = new Intent(this, TerciaryActivity.class);
        startActivity(intent);
    }
}