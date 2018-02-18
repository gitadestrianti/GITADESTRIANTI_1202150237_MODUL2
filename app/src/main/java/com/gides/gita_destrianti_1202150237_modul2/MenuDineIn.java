package com.gides.gita_destrianti_1202150237_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MenuDineIn extends AppCompatActivity {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dine_in);

        spinner = (Spinner)findViewById(R.id.spinner);

        Button buttonPesanDI = (Button)findViewById(R.id.buttonPesanDI);
        buttonPesanDI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuDineIn = new Intent(MenuDineIn.this,DaftarMenu.class);
                startActivity(menuDineIn);
                Toast.makeText(MenuDineIn.this,"Dine In",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
