package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnCari, btnketentuann, btninfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inisialisasi
        btnCari = findViewById(R.id.btnCari);
        btnketentuann = findViewById(R.id.btnketentuan);
        btninfo = findViewById(R.id.btninfo);

        btnCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CariActivity.class);
                startActivity(i);
            }
        });
        btnketentuann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(MainActivity.this, ketentuanActivity.class);
                startActivity(ii);
            }
        });
        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii = new Intent(MainActivity.this, infoActivity.class);
                startActivity(iii);
            }
        });


        ;
    }
}
