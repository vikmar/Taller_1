package com.example.vikmar.taller_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Suma;
    private TextView Contador, ciclo ;
    private int n ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ciclo = (TextView)findViewById(R.id.txtSaludo);
        ciclo.setText("OnCreate");

        Suma= (Button)findViewById(R.id.btnAumentar);
        Contador= (TextView)findViewById(R.id.txtSumar);
        Suma.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                n++;
                Contador.setText("Número de Clic: "+ n);
                ciclo.setText("OnClick");
            }
        });

    }
}
