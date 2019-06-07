package br.com.digitalhouse.listadecompra;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    private TextInputEditText editTextSenha;
    private TextInputEditText editTextConfirmaSenha;
    private TextInputEditText editTextEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        FloatingActionButton fab = findViewById(R.id.fab_register);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botaoClicado(v);
            }
        });

        editTextSenha = findViewById(R.id.register_in_senha);
        editTextSenha.getEditableText().toString();
        editTextConfirmaSenha = findViewById(R.id.register_in_confirma_senha);
        editTextConfirmaSenha.getEditableText().toString();
        editTextEmail =findViewById(R.id.register_in_email);
        editTextEmail.getEditableText().toString();

    }


    public void botaoClicado(View view) {

        editTextSenha.setError(null);
        editTextConfirmaSenha.setError(null);
        editTextEmail.setError(null);

        if (!editTextSenha.getEditableText().toString().equals(editTextConfirmaSenha.getEditableText().toString())) {
            editTextSenha.setError("As senhas nâo conferem");
            editTextConfirmaSenha.setError("As senhas nâo conferem");
        }else if(editTextEmail.getEditableText().toString().equals("")) {
            editTextEmail.setError("Campo obrigatório");
        }

            Snackbar.make(view, "Usuário cadastrado", Snackbar.LENGTH_INDEFINITE)
                    .setAction("OK", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                        }
                    })
                    .setActionTextColor(getResources().getColor(R.color.verde))
                    .show();


    }
    private void irParaLogin(){
        startActivity(new Intent(this, LoginLinearActivity.class));
    }
}
