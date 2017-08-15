package br.com.fcojj.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin  = (Button) findViewById(R.id.btLogin);
        Button btEsqueciSenha = (Button) findViewById(R.id.btEsqueciSenha);

        /* FORMA 01 DE TRATAR EVENTOS
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txUsuario = (EditText) findViewById(R.id.txUsuario);
                String login = txUsuario.getText().toString();
                EditText txSenha = (EditText) findViewById(R.id.txSenha);
                String senha = txSenha.getText().toString();

                alert("Login: "+login+" / Senha: "+senha);
            }
        });*/

        /*FORMA 2 DE TRATAR EVENTOS*/
        btLogin.setOnClickListener(this);
        btEsqueciSenha.setOnClickListener(this);

        /* FORMA 3  TRATAR EVENTOS */
        //btLogin.setOnClickListener(onClickLogin());
        //btEsqueciSenha.setOnClickListener(onClickEsqueciSenha());
    }

    /**
     * FORMA 2 DE TRATAR EVENTOS
     * */
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btLogin) {
            EditText txUsuario = (EditText) findViewById(R.id.txUsuario);
            String login = txUsuario.getText().toString();
            EditText txSenha = (EditText) findViewById(R.id.txSenha);
            String senha = txSenha.getText().toString();

            alert("Login: " + login + " / Senha: " + senha);
        } else if(v.getId() == R.id.btEsqueciSenha){
            alert("Botão esqueci senha foi clicado");
        }
    }

    /**
     * FORMA 3 DE SE TRATAR EVENTOS
     * */
    private View.OnClickListener onClickLogin(){
        return new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText txUsuario = (EditText) findViewById(R.id.txUsuario);
                String login = txUsuario.getText().toString();
                EditText txSenha = (EditText) findViewById(R.id.txSenha);
                String senha = txSenha.getText().toString();

                alert("Login: " + login + " / Senha: " + senha);
            }
        };
    }

    private View.OnClickListener onClickEsqueciSenha(){
        return new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                alert("Esqueci senha foi apertado!!!");
            }
        };
    }

    /**
     * FORMA 4 DE TRATAR EVENTOS
     * */
    public void onClickEsqueciSenhaXmlEventos(View view) {
        alert("Evento XML: esqueci senha foi apertado!!!");
    }

    public void onClickLoginXmlEventos(View view) {
        alert("Evento XML: login foi apertado!!!");
    }

    private void alert(String message) {
        Log.e("Login","Log type ERROR: "+ message);
        Log.w("Login","Log type WARNING: "+ message);
        Log.i("Login","Log type INFO: "+ message);
        Log.v("Login","Log type VERBOSE: "+ message);
        Log.d("Login","Log type DEBUG: "+ message);
        Log.println(Log.DEBUG,"Login","Log type DEBUG way other: "+ message);

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

}
