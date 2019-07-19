package all.co;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class H extends AppCompatActivity {
    EditText input_KG;
    Button KG_RP;
    TextView hasil_konversi;

    double angka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h);

        input_KG = (EditText) findViewById(R.id.KG);
        KG_RP = (Button) findViewById(R.id.rp);
        hasil_konversi = (TextView) findViewById(R.id.hasil_konversi);
    }

    public boolean cek(){
        if (input_KG.getText().toString().isEmpty()){
            Toast.makeText(this, "Masukkan berat sampah", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }


    public void kerp(View v){
        if (!cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_KG.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka * 1250;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Lo).format(hasil));
        Toast.makeText(this, "1 KG = Rp 1250", Toast.LENGTH_SHORT).show();
    }
}