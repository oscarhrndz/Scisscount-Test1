package com.example.myapplication20;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class ChatActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        container = findViewById(R.id.container);

        // Manejar la selección de elementos en el BottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_chats:
                        showMessage("Chats seleccionados");
                        return true;
                    case R.id.menu_calls:
                        showMessage("Llamadas seleccionadas");
                        return true;
                    case R.id.menu_bills:
                        showMessage("Facturas seleccionadas");
                        return true;
                }
                return false;
            }
        });


        // Manejar el clic en el botón de opciones
        findViewById(R.id.fabOptions).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para el botón de opciones (añadir usuario, crear grupo, etc.)
                showMessage("Botón de opciones clicado");
            }
        });
    }

    private void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
