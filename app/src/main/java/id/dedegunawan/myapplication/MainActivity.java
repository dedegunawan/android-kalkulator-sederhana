package id.dedegunawan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etAngka1, etAngka2;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAngka1 = findViewById(R.id.txt1);
        etAngka2 = findViewById(R.id.txt2);
        tvHasil = findViewById(R.id.tvHasil);
    }

    public void tambah(View view) {
        String angka1 = etAngka1.getText().toString();
        String angka2 = etAngka2.getText().toString();

        if (TextUtils.isEmpty(angka1) || TextUtils.isEmpty(angka2)) {
            Toast.makeText(
                    MainActivity.this,
                    "Masukkan Angka1 & Angka2 terlebih dahulu",
                    Toast.LENGTH_SHORT)
                    .show();
            tvHasil.setText("-");
            return ;
        } else {
            Double hasil = Double.valueOf(angka1) + Double.valueOf(angka2);
            tvHasil.setText(String.valueOf(hasil));
        }


    }
    public void kurang(View view) {
        String angka1 = etAngka1.getText().toString();
        String angka2 = etAngka2.getText().toString();

        if (TextUtils.isEmpty(angka1) || TextUtils.isEmpty(angka2)) {
            Toast.makeText(
                    MainActivity.this,
                    "Masukkan Angka1 & Angka2 terlebih dahulu",
                    Toast.LENGTH_SHORT)
                    .show();
            tvHasil.setText("-");
            return ;
        }
        else {
            Double hasil = Double.valueOf(angka1) - Double.valueOf(angka2);
            tvHasil.setText(String.valueOf(hasil));
        }

    }
    public void kali(View view) {
        String angka1 = etAngka1.getText().toString();
        String angka2 = etAngka2.getText().toString();

        if (TextUtils.isEmpty(angka1) || TextUtils.isEmpty(angka2)) {
            Toast.makeText(
                    MainActivity.this,
                    "Masukkan Angka1 & Angka2 terlebih dahulu",
                    Toast.LENGTH_SHORT)
                    .show();
            tvHasil.setText("-");
            return ;
        } else {
            Double hasil = Double.valueOf(angka1) * Double.valueOf(angka2);
            tvHasil.setText(String.valueOf(hasil));
        }


    }
    public void bagi(View view) {
        String angka1 = etAngka1.getText().toString();
        String angka2 = etAngka2.getText().toString();

        if (TextUtils.isEmpty(angka1) || TextUtils.isEmpty(angka2)) {
            Toast.makeText(
                    MainActivity.this,
                    "Masukkan Angka1 & Angka2 terlebih dahulu",
                    Toast.LENGTH_SHORT)
                    .show();
            tvHasil.setText("-");
            return ;
        }

        else if (Integer.valueOf(angka2) == 0) {
            Toast.makeText(
                    MainActivity.this,
                    "Angka 2 Tidak boleh sama dengan 0",
                    Toast.LENGTH_SHORT)
                    .show();
            tvHasil.setText("-");
            return ;
        } else {
            Double hasil = Double.valueOf(angka1) / Double.valueOf(angka2);
            tvHasil.setText(String.valueOf(hasil));
        }


    }
}
