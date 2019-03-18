package com.siladem.ulubus;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Koltuk extends AppCompatActivity {
    String neredenText;
    String nereyeText;
    String tarihText;
    int yolcuSayi;
    int toplam_ucret,def_ucret;
    String secilen_koltuk = " ";
    TextView koltuk;
    int temp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koltuk);
        Bundle extras = getIntent().getExtras();
        koltuk = findViewById(R.id.koltukText);
        temp = 0;

        neredenText = extras.getString("nereden");
        nereyeText = extras.getString("nereye");
        tarihText = extras.getString("tarih");

        def_ucret = extras.getInt("ucret");

        final Button koltuk1= (Button)findViewById(R.id.koltuk1);
        koltuk1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
             secilen_koltuk = secilen_koltuk + "1 ";
                koltuk.setText(secilen_koltuk);
                koltuk1.setClickable(false);

                temp++;

            }
        });

        final Button koltuk2= (Button)findViewById(R.id.koltuk2);
        koltuk2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "2 ";
                koltuk.setText(secilen_koltuk);
                koltuk2.setClickable(false);

                temp++;

            }
        });
        final Button koltuk3= (Button)findViewById(R.id.koltuk3);
        koltuk3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "3 ";
                koltuk.setText(secilen_koltuk);
                koltuk3.setClickable(false);

                temp++;

            }
        });
        final Button koltuk4= (Button)findViewById(R.id.koltuk4);
        koltuk4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "4 ";
                koltuk.setText(secilen_koltuk);
                koltuk4.setClickable(false);

                temp++;

            }
        });
        final Button koltuk5= (Button)findViewById(R.id.koltuk5);
        koltuk5.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "5 ";
                koltuk.setText(secilen_koltuk);
                koltuk5.setClickable(false);

                temp++;

            }
        });
        final Button koltuk6= (Button)findViewById(R.id.koltuk6);
        koltuk6.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "6 ";
                koltuk.setText(secilen_koltuk);
                koltuk6.setClickable(false);

                temp++;

            }
        });
       final Button koltuk7= (Button)findViewById(R.id.koltuk7);
        koltuk7.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "7 ";
                koltuk.setText(secilen_koltuk);
                koltuk7.setClickable(false);

                temp++;

            }
        });
        final Button koltuk8= (Button)findViewById(R.id.koltuk8);
        koltuk8.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "8 ";
                koltuk.setText(secilen_koltuk);
                koltuk8.setClickable(false);

                temp++;

            }
        });
        final Button koltuk9= (Button)findViewById(R.id.koltuk9);
        koltuk9.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "9 ";
                koltuk.setText(secilen_koltuk);
                koltuk9.setClickable(false);

                temp++;

            }
        });
        final Button koltuk10= (Button)findViewById(R.id.koltuk10);
        koltuk10.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "10 ";
                koltuk.setText(secilen_koltuk);
                koltuk10.setClickable(false);

                temp++;

            }
        });
       final Button koltuk11= (Button)findViewById(R.id.koltuk11);
        koltuk11.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "11 ";
                koltuk.setText(secilen_koltuk);
                koltuk11.setClickable(false);

                temp++;
            }
        });

        final Button koltuk12= (Button)findViewById(R.id.koltuk12);
        koltuk12.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "12 ";
                koltuk.setText(secilen_koltuk);
                koltuk12.setClickable(false);

                temp++;
            }
        });
       final Button koltuk13= (Button)findViewById(R.id.koltuk13);
        koltuk13.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "13 ";
                koltuk.setText(secilen_koltuk);
                koltuk13.setClickable(false);

                temp++;

            }
        });
       final Button koltuk14= (Button)findViewById(R.id.koltuk14);
        koltuk14.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "14 ";
                koltuk.setText(secilen_koltuk);
                koltuk14.setClickable(false);

                temp++;

            }
        });
       final Button koltuk15= (Button)findViewById(R.id.koltuk15);
        koltuk15.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "15 ";
                koltuk.setText(secilen_koltuk);
                koltuk15.setClickable(false);

                temp++;

            }
        });
        final Button koltuk16= (Button)findViewById(R.id.koltuk16);
        koltuk16.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "16 ";
                koltuk.setText(secilen_koltuk);
                koltuk16.setClickable(false);

                temp++;

            }
        });
        final Button koltuk17= (Button)findViewById(R.id.koltuk17);
        koltuk17.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "17 ";
                koltuk.setText(secilen_koltuk);
                koltuk17.setClickable(false);

                temp++;
            }
        });
        final Button koltuk18= (Button)findViewById(R.id.koltuk18);
        koltuk18.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "18 ";
                koltuk.setText(secilen_koltuk);
                koltuk18.setClickable(false);

                temp++;

            }
        });
        final Button koltuk19= (Button)findViewById(R.id.koltuk19);
        koltuk19.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "19 ";
                koltuk.setText(secilen_koltuk);
                koltuk19.setClickable(false);

                temp++;

            }
        });
        final Button koltuk20= (Button)findViewById(R.id.koltuk20);
        koltuk20.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "20 ";
                koltuk.setText(secilen_koltuk);
                koltuk20.setClickable(false);

                temp++;

            }
        });
        final Button koltuk21= (Button)findViewById(R.id.koltuk21);
        koltuk21.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "21 ";
                koltuk.setText(secilen_koltuk);
                koltuk21.setClickable(false);

                temp++;

            }
        });
       final Button koltuk22= (Button)findViewById(R.id.koltuk22);
        koltuk22.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "22 ";
                koltuk.setText(secilen_koltuk);
                koltuk22.setClickable(false);

                temp++;

            }
        });
       final Button koltuk23= (Button)findViewById(R.id.koltuk23);
        koltuk23.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "23 ";
                koltuk.setText(secilen_koltuk);
                koltuk23.setClickable(false);

                temp++;

            }
        });
        final Button koltuk24= (Button)findViewById(R.id.koltuk24);
        koltuk24.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "24 ";
                koltuk.setText(secilen_koltuk);
                koltuk24.setClickable(false);

                temp++;

            }
        });
        final Button koltuk25= (Button)findViewById(R.id.koltuk25);
        koltuk25.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "25 ";
                koltuk.setText(secilen_koltuk);
                koltuk25.setClickable(false);

                temp++;

            }
        });
        final Button koltuk26= (Button)findViewById(R.id.koltuk26);
        koltuk26.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "26 ";
                koltuk.setText(secilen_koltuk);
                koltuk26.setClickable(false);

                temp++;

            }
        });
        final Button koltuk27= (Button)findViewById(R.id.koltuk27);
        koltuk27.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "27 ";
                koltuk.setText(secilen_koltuk);
                koltuk27.setClickable(false);

                temp++;

            }
        });
        final Button koltuk28= (Button)findViewById(R.id.koltuk28);
        koltuk28.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "28 ";
                koltuk.setText(secilen_koltuk);
                koltuk28.setClickable(false);

                temp++;

            }
        });
       final Button koltuk29= (Button)findViewById(R.id.koltuk29);
        koltuk29.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "29 ";
                koltuk.setText(secilen_koltuk);
                koltuk29.setClickable(false);

                temp++;

            }
        });
        final Button koltuk30= (Button)findViewById(R.id.koltuk30);
        koltuk30.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "30 ";
                koltuk.setText(secilen_koltuk);
                koltuk30.setClickable(false);
                temp++;

            }
        });

        final Button koltuk31= (Button)findViewById(R.id.koltuk31);
        koltuk31.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "31 ";
                koltuk.setText(secilen_koltuk);
                koltuk31.setClickable(false);
                temp++;

            }
        });
        final Button koltuk32= (Button)findViewById(R.id.koltuk32);
        koltuk32.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "32 ";
                koltuk.setText(secilen_koltuk);
                koltuk32.setClickable(false);
                temp++;

            }
        });
        final Button koltuk33= (Button)findViewById(R.id.koltuk33);
        koltuk33.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "33 ";
                koltuk.setText(secilen_koltuk);
                koltuk33.setClickable(false);
                temp++;

            }
        });
        final Button koltuk34= (Button)findViewById(R.id.koltuk34);
        koltuk34.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "34 ";
                koltuk.setText(secilen_koltuk);
                koltuk34.setClickable(false);
                temp++;

            }
        });
        final Button koltuk35= (Button)findViewById(R.id.koltuk35);
        koltuk35.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "35 ";
                koltuk.setText(secilen_koltuk);
                koltuk35.setClickable(false);
                temp++;

            }
        });
        final Button koltuk36= (Button)findViewById(R.id.koltuk36);
        koltuk36.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "36 ";
                koltuk.setText(secilen_koltuk);
                koltuk36.setClickable(false);
                temp++;

            }
        });
        final Button koltuk37= (Button)findViewById(R.id.koltuk37);
        koltuk37.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "37 ";
                koltuk.setText(secilen_koltuk);
                koltuk37.setClickable(false);
                temp++;

            }
        });
        final Button koltuk38= (Button)findViewById(R.id.koltuk38);
        koltuk38.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "38 ";
                koltuk.setText(secilen_koltuk);
                koltuk38.setClickable(false);
                temp++;

            }
        });
        final Button koltuk39= (Button)findViewById(R.id.koltuk39);
        koltuk39.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "39 ";
                koltuk.setText(secilen_koltuk);
                 koltuk39.setClickable(false);
                temp++;

            }
        });
        final Button koltuk40= (Button)findViewById(R.id.koltuk40);
        koltuk40.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secilen_koltuk = secilen_koltuk + "40 ";
                koltuk.setText(secilen_koltuk);
                koltuk40.setClickable(false);
                temp++;

            }
        });

    }


    public void koltukDevam(View view) {
        String koltuk_no = koltuk.getText().toString();
        /*myDatabase.koltukEkranı(myDatabase.getId(neredenText,nereyeText),Integer.parseInt(koltuk_no));
        if(myDatabase.koltukEkranı(myDatabase.getId(neredenText,nereyeText),Integer.parseInt(koltuk_no)) == false){
            Toast.makeText(this, "Koltuk dolu", Toast.LENGTH_LONG).show();

        }*/

        if(temp >= 9){
            AlertDialog.Builder builder = new AlertDialog.Builder(Koltuk.this);
            builder.setTitle("Uyarı!!");
            builder.setMessage("Dokuzdan Fazla Koltuk Seçemezsiniz");
            builder.setNegativeButton("TAMAM", new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog, int id) {
                    //İptal butonuna basılınca yapılacaklar.Sadece kapanması isteniyorsa boş bırakılacak
                }
            });
            builder.show();
        }else{
            Toast.makeText(this, temp + " Koltuk Seçildi", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(),KullaniciBilgileri.class);
            intent.putExtra("nereden",neredenText);
            intent.putExtra("nereye",nereyeText);
            intent.putExtra("tarih",tarihText);
            intent.putExtra("yolcuSayi",temp);
            intent.putExtra("ucret",def_ucret);
            intent.putExtra("koltuk_no",koltuk_no);

            startActivity(intent);
        }





    }
}