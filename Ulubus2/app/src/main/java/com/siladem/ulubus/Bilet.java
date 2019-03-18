package com.siladem.ulubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bilet extends AppCompatActivity {
    String nereden,nereye,tarih,ad,soyad,tc,telefon,email,koltuk_no;
    int toplam_ucret , def_ucret , yolcuSayi,sigortali_ucret;
    boolean hasSigorta;
    TextView isimText;
    TextView seferText;
    TextView koltukText;
    TextView tarihText;
    TextView sigortaText;
    TextView fiyatText;
    TextView toplamText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilet);
        isimText = findViewById(R.id.isimText);
        seferText = findViewById(R.id.seferText);
        koltukText = findViewById(R.id.koltukText);
        tarihText = findViewById(R.id.tarihText);
        sigortaText = findViewById(R.id.sigortaText);
        fiyatText = findViewById(R.id.fiyatText);
        toplamText = findViewById(R.id.toplamText);

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
        hasSigorta = extras.getBoolean("hasSigorta");
        sigortali_ucret = extras.getInt("sigortali_ucret");
        String str;


        if(hasSigorta == true){
            toplam_ucret = yolcuSayi*(def_ucret + 5);
            str = "Sigorta Eklenmiştir";


        }else{
            toplam_ucret = yolcuSayi*def_ucret;
            str = "Sigorta Eklenmemiştir";
        }

        String def_ucretStr = Integer.toString(def_ucret);
        String toplam_ucretStr = Integer.toString(toplam_ucret);
        String yolcuSayiStr = Integer.toString(yolcuSayi);




        isimText.setText(ad  +" " + soyad);
        seferText.setText(nereden + " - " + nereye + " " + "(" +  yolcuSayiStr + "kişi" + ")");
        koltukText.setText(koltuk_no);
        tarihText.setText(tarih);
        sigortaText.setText(str);
        fiyatText.setText(def_ucretStr);
        toplamText.setText(toplam_ucretStr);
    }

    public void odeme(View view){
        Intent intent = new Intent(getApplicationContext(),Odeme.class);

        intent.putExtra("nereden",nereden);
        intent.putExtra("nereye",nereye);
        intent.putExtra("tarih",tarih);
        intent.putExtra("yolcuSayi",yolcuSayi);
        intent.putExtra("toplam_ucret",toplam_ucret);
        intent.putExtra("def_ucret",def_ucret);
        intent.putExtra("ad",ad);
        intent.putExtra("soyad",soyad);
        intent.putExtra("tc",tc);
        intent.putExtra("telefon",telefon);
        intent.putExtra("email",email);
        intent.putExtra("koltuk_no",koltuk_no);


        startActivity(intent);
    }
}
