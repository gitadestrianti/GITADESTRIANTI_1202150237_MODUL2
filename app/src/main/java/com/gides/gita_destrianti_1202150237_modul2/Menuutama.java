package com.gides.gita_destrianti_1202150237_modul2;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Menuutama extends AppCompatActivity {
    //Deklarasi variabel
    RadioGroup group;
    RadioButton rdbtnTakeAway, rdbtnDineIn;
    Button btnPesanSekarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutama);//layout menu utama

        //id sesuai dengan yang diberikan di xml
        group = findViewById(R.id.rb_group);
        rdbtnDineIn = findViewById(R.id.radioButton_dinein);
        rdbtnTakeAway = findViewById(R.id.radioButton_takeaway);
        btnPesanSekarang = findViewById(R.id.button_pesansekarang);


        //apabila di klik maka...
        btnPesanSekarang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int selectId = group.getCheckedRadioButtonId();//apabila salah satu radio button ini dipilih maka..
                if(selectId == rdbtnDineIn.getId()){
                    Intent menuDI = new Intent(Menuutama.this,MenuDineIn.class);
                    startActivity(menuDI);//apabila radiobutton Dine In dipilih, akan ke activity MenuDineIn
                    Toast.makeText(Menuutama.this,"Dine In",Toast.LENGTH_LONG).show();//menampilkan toast "Dine In"
                    finish();
                }else if(selectId == rdbtnTakeAway.getId()){
                    Intent menuTA = new Intent(Menuutama.this,MenuTakeAway.class);
                    startActivity(menuTA);//apabila radiobutton take away dipilih, akan ke activity MenuTakeAway
                    Toast.makeText(Menuutama.this,"Take Away", Toast.LENGTH_LONG).show();//Menampilkan toast "Take Away"
                }else{
                    Toast.makeText(Menuutama.this,"Pilih salah satu",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
