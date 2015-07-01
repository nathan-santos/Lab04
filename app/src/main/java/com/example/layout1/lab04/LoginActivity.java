package com.example.layout1.lab02;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by MarileneQuintanilhaM on 24/06/2015.
 */
public class LoginActivity extends Activity{

    private Button entrarbotao;
    private Button cancelarbotao;
    private EditText login;
    private EditText senha;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.login);
        senha = (EditText) findViewById(R.id.senha);
        result = (TextView) findViewById(R.id.result);

        entrarbotao = (Button)findViewById(R.id.entrarbotao);
        entrarbotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrarbotaoAction();
            }
            private void entrarbotaoAction() {
                String loginInserido = login.getText().toString();
                String senhaInserido = senha.getText().toString();

                if (loginInserido.equals("Natalia") && senhaInserido.equals("1994")) {
                    result.setText("Bem vindo");
                }
                else{
                    result.setText("Login e/ou senha errada");
                }
            }
        });

        cancelarbotao = (Button)findViewById(R.id.cancelarbotao);
        cancelarbotao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cancelarbotaoAction();
            }
            private void cancelarbotaoAction() {
                login.setText(null);
                senha.setText(null);
                result.setText(null);
            }
        });
    }
}
