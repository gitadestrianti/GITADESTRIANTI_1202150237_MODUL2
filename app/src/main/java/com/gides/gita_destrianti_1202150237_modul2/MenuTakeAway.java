package com.gides.gita_destrianti_1202150237_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuTakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_take_away);

        Button btnPesanTA = (Button)findViewById(R.id.btnPesanTA);
        btnPesanTA.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent menuTakeAway = new Intent(MenuTakeAway.this,DaftarMenu.class);
                startActivity(menuTakeAway);
                Toast.makeText(MenuTakeAway.this,"Take Away",Toast.LENGTH_SHORT).show();
                finish();
            }
        }


        );
    }

  /**  public void onClickOrder(View view) {
        Intent intent = new Intent(this,DaftarMenu.class);
        startActivity(intent);
    }*/

}
