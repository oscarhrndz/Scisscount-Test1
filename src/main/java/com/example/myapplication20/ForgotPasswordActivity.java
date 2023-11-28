package com.example.myapplication20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ForgotPasswordActivity extends AppCompatActivity {

    private EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        editTextEmail = findViewById(R.id.editTextEmail);

        Button buttonRecoverPassword = findViewById(R.id.buttonRecoverPassword);

        buttonRecoverPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para recuperar la contraseña
                // Puedes enviar un correo electrónico con un enlace para restablecer la contraseña
                // o realizar la acción necesaria según tu implementación
                showMessage("Se enviará un correo electrónico de recuperación a " + editTextEmail.getText().toString());
            }
        });
    }

    private void showMessage(String message) {
        // Método para mostrar mensajes, puedes implementarlo según tus necesidades
    }
}
