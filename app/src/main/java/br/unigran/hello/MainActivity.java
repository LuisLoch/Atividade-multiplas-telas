package br.unigran.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public String nomePrimeiraTela;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextPrimeiraTela);
    }
    
    public void salvarNome(View view){
        nomePrimeiraTela = editText.getText().toString();
        if(nomePrimeiraTela == editText.getText().toString())
            Toast.makeText(this, "Nome salvo.", Toast.LENGTH_SHORT).show();
    }

    public void nextScreen(View view){
        Intent intent = new Intent(getApplicationContext(), SecondaryActivity.class);
        intent.putExtra("Nome", nomePrimeiraTela);
        startActivity(intent);
    }
}