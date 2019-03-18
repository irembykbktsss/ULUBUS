package com.siladem.ulubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class KullaniciBilgileri extends AppCompatActivity {
    EditText isim ;
    EditText soyisim ;
    EditText tc;
    EditText telefon;
    EditText email;
    CheckBox sigorta;
    String isim_, soyisim_ , tc_ , telefon_ , email_ ;
    String neredenText;
    String nereyeText;
    String tarihText;
    String koltuk_no;
    int yolcuSayi,top_sigorta;
    int toplam_ucret,def_ucret,sigortali_ucret;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_bilgileri);
        Bundle extras = getIntent().getExtras();

        isim = (EditText)findViewById(R.id.editTxtİsim);
        soyisim = (EditText)findViewById(R.id.editTxtSoyisim);
        tc = (EditText)findViewById(R.id.editTxtTc);
        telefon = (EditText)findViewById(R.id.editTxtTelefon);
        email = (EditText)findViewById(R.id.editTxtEmail);
        sigorta = (CheckBox) findViewById(R.id.checkBoxSigorta);

        neredenText = extras.getString("nereden");
        nereyeText = extras.getString("nereye");
        tarihText = extras.getString("tarih");
        yolcuSayi = extras.getInt("yolcuSayi");
        def_ucret = extras.getInt("ucret");
        koltuk_no = extras.getString("koltuk_no");

        // int yolcu_sayi = Integer.parseInt(yolcuSayi);



    }


    public void devam(View view){

        isim_ = isim.getText().toString();                 //editText ten değerleri alıyoruz
        soyisim_ = soyisim.getText().toString();
        tc_ = tc.getText().toString();
        telefon_ = telefon.getText().toString();
        email_ = email.getText().toString();

        sigorta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(sigorta.isChecked()){

                }

            }
        });

        if(tc_.trim().length() != 11){
            Toast.makeText(this, "11 basamaklı TC numaranızı giriniz. " , Toast.LENGTH_LONG).show();
        }
        else if(telefon_.trim().length() !=11){
            Toast.makeText(this, "11 basamaklı telefon numaranızı giriniz. " , Toast.LENGTH_LONG).show();
        }
        else {


            if (isim_.trim().equals("")) {
                Toast.makeText(this, "İsim Bölümü Boş Bırakılamaz.", Toast.LENGTH_LONG).show();
            } else if (soyisim_.trim().equals("")) {
                Toast.makeText(this, "Soyisim Bölümü Boş Bırakılamaz", Toast.LENGTH_LONG).show();
            } else if (tc_.trim().equals("")) {
                Toast.makeText(this, "TC No Bölümü Boş Bırakılamaz", Toast.LENGTH_LONG).show();
            } else if (telefon_.trim().equals("")) {
                Toast.makeText(this, "Telefon Bölümü Boş Bırakılamaz", Toast.LENGTH_LONG).show();
            } else if (email_.trim().equals("")) {
                Toast.makeText(this, "E-Mail Bölümü Boş Bırakılamaz", Toast.LENGTH_LONG).show();
            } else {
                Intent intent = new Intent(getApplicationContext(), Bilet.class);
                intent.putExtra("nereden", neredenText);
                intent.putExtra("nereye", nereyeText);
                intent.putExtra("tarih", tarihText);
                intent.putExtra("yolcuSayi", yolcuSayi);
                intent.putExtra("toplam_ucret", toplam_ucret);
                intent.putExtra("sigortali_ucret", sigortali_ucret);
                intent.putExtra("def_ucret", def_ucret);
                intent.putExtra("ad", isim_);
                intent.putExtra("soyad", soyisim_);
                intent.putExtra("tc", tc_);
                intent.putExtra("telefon", telefon_);
                intent.putExtra("email", email_);
                intent.putExtra("koltuk_no", koltuk_no);
                intent.putExtra("hasSigorta", sigorta.isChecked());


                startActivity(intent);
            }
        }

    }
}
