package com.siladem.ulubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Odeme extends AppCompatActivity {

    EditText adSoyad ;
    EditText kartNo;
    EditText guvenlikKodu ;
    EditText sonKullanmaTarihi;
    TextView tutar;
    String adSoyad_ , kartNo_ , guvenlikKodu_ , sonKullanmaTarihi_ ;
    String nereden,nereye,tarih,ad,soyad,tc,telefon,email,koltuk_no;
    int toplam_ucret , def_ucret , yolcuSayi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();

        nereden = extras.getString("nereden");
        nereye = extras.getString("nereye");
        tarih = extras.getString("tarih");
        yolcuSayi = extras.getInt("yolcuSayi");
        toplam_ucret = extras.getInt("toplam_ucret");
        def_ucret = extras.getInt("def_ucret");
        ad = extras.getString("ad");
        soyad = extras.getString("soyad");
        tc = extras.getString("tc");
        telefon = extras.getString("telefon");
        email = extras.getString("email");
        koltuk_no = extras.getString("koltuk_no");
        setContentView(R.layout.activity_odeme);

        adSoyad = (EditText)findViewById(R.id.editTxtAdSoyad);
        kartNo = (EditText)findViewById(R.id.editTxtKartNo);
        guvenlikKodu = (EditText)findViewById(R.id.editTxtGuvenlikKodu);
        sonKullanmaTarihi = (EditText)findViewById(R.id.editTxtSonKullanmaTarihi);
        tutar = findViewById(R.id.txtViewTl);

        String tutarTxt_ = toplam_ucret + " TL";
        tutar.setText(tutarTxt_);
    }

    public void odemeTamamlandı(View view){

        adSoyad_ = adSoyad.getText().toString();
        kartNo_ = kartNo.getText().toString();
        guvenlikKodu_ = guvenlikKodu.getText().toString();
        sonKullanmaTarihi_ = sonKullanmaTarihi.getText().toString();

        if(kartNo_.trim().length() !=16) {
            Toast.makeText(this, "16 Haneli kart numarasını giriniz..", Toast.LENGTH_LONG).show();
        }
        else if(guvenlikKodu_.trim().length() !=3 ){
            Toast.makeText(this, "Kartınızın 3 haneli güvenlik kodunu giriniz.", Toast.LENGTH_LONG).show();
        }
        else if(sonKullanmaTarihi_.trim().length() != 5){
            Toast.makeText(this, "Geçersiz tarih girdiniz.", Toast.LENGTH_LONG).show();
        }

        else {


            if (adSoyad_.trim().equals("")) {
                Toast.makeText(this, "Ad Soyad Bölümü Boş Bırakılamaz.", Toast.LENGTH_LONG).show();
            } else if (kartNo_.trim().equals("")) {
                Toast.makeText(this, "Kart Numarası Boş Bırakılamaz.", Toast.LENGTH_LONG).show();
            } else if (guvenlikKodu_.trim().equals("")) {
                Toast.makeText(this, "Güvenlik Kodu Boş Bırakılamaz.", Toast.LENGTH_LONG).show();
            } else if (sonKullanmaTarihi_.trim().equals("")) {
                Toast.makeText(this, "Son kullanma Tarihi Boş Bırakılamaz.", Toast.LENGTH_LONG).show();
            } else {
                Intent intent = new Intent(getApplicationContext(), OnayEkran.class);
                intent.putExtra("nereden", nereden);
                intent.putExtra("nereye", nereye);
                intent.putExtra("tarih", tarih);
                intent.putExtra("yolcuSayi", yolcuSayi);
                intent.putExtra("toplam_ucret", toplam_ucret);
                intent.putExtra("def_ucret", def_ucret);
                intent.putExtra("ad", ad);
                intent.putExtra("soyad", soyad);
                intent.putExtra("tc", tc);
                intent.putExtra("telefon", telefon);
                intent.putExtra("email", email);
                intent.putExtra("koltuk_no", koltuk_no);


                startActivity(intent);
            }

        }
    }
}
