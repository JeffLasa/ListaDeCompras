package br.com.digitalhouse.listadecompra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginLinearActivity extends AppCompatActivity {

    private EditText emailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_linear);

        emailEditText = findViewById(R.id.login_email_edit_text);

        Button botaoLogin = findViewById(R.id.login_button);
        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irParaLogin();
            }

        });
    }

    private void irParaLogin() {
        Intent intent = new Intent(this, LoginLinearActivity.class);
        String email = emailEditText.getEditableText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("EMAIL", email);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
