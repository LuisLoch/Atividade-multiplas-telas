package br.unigran.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TerciaryActivity extends AppCompatActivity {
    TextView textViewTela3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terciary);
        textViewTela3 = findViewById(R.id.textView3);
    }

    public void click(View view){
        Toast.makeText(this, "Você clicou no texto! :D", Toast.LENGTH_SHORT).show();
    }
}