package all.co;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void tentang(View view) {
        Intent tentang = new Intent(home.this, all.co.tentang.class);
        startActivity(tentang);
    }
    public void P(View view) {
        Intent P = new Intent(home.this, all.co.P.class);
        startActivity(P);
    }
    public void H(View view) {
        Intent H = new Intent(home.this, all.co.H.class);
        startActivity(H);
    }
}