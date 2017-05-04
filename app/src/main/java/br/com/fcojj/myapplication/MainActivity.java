package br.com.fcojj.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin  = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txUsuario = (EditText) findViewById(R.id.txUsuario);
                String login = txUsuario.getText().toString();
                EditText txSenha = (EditText) findViewById(R.id.txSenha);
                String senha = txSenha.getText().toString();

                alert("Login: "+login+" / Senha: "+senha);
            }
        });
    }

    private void alert(String message) {
        Log.e("Login",message);
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
