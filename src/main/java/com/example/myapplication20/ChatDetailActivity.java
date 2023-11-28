package com.example.myapplication20;

public class ChatDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_detail);

        // Obtén la referencia al botón de opciones
        ImageButton btnOptions = findViewById(R.id.btnOptions);

        // Configura el menú desplegable
        btnOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOptionsMenu(v);
            }
        });
    }

    private void showOptionsMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.menu_chat_options, popupMenu.getMenu());

        // Maneja los clics en el menú
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_call:
                        // Lógica para la opción de llamada
                        showMessage("Llamada seleccionada");
                        return true;
                    case R.id.menu_video_call:
                        // Lógica para la opción de videollamada
                        showMessage("Videollamada seleccionada");
                        return true;
                    default:
                        return false;
                }
            }
        });

        // Muestra el menú desplegable
        popupMenu.show();
    }

    private void showMessage(String message) {
        // Muestra el mensaje, puedes adaptar esta función según tus necesidades
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
