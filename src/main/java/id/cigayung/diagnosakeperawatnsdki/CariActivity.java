package id.cigayung.diagnosakeperawatnsdki;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import static android.widget.Toast.makeText;

public class CariActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;

    private Toast backToast;
    private long backPressed;

    ArrayList<Model> arrayList = new ArrayList<Model>();


    @Override
    public void onBackPressed (){
        if (backPressed + 2000 > System.currentTimeMillis()){
            backToast.cancel ();
            super.onBackPressed();
            return;
        } else  {
            backToast = makeText(getBaseContext(), "Pencet sakali deui lamun rek tutup aplikasina mah", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressed = System.currentTimeMillis();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Cari SDKI");

        title = new String[]{"Bersihan Jalan Nafas Tidak Efektif","Gangguan Penyapihan Ventilator",
                "Gangguan Pertukaran Gas","Gangguan Ventilasi Spontan","Pola Napas Tidak Efektif","Risiko Aspirasi",
                "Gangguan Sirkulasi Spontan","Penurunan Curah Jantung","Perfusi Perifer Tidak Efektif",
                "Risiko Gangguan Sirkulasi Spontan","Risiko Penurunan Curah Jantung","Risiko Perdarahan",
                "Risiko Perfusi Gastrointestinal Tidak Efektif","Risiko Perfusi Miokard Tidak Efektif",
                "Risiko Perfusi Perifer Tidak Efektif","Risiko Perfusi Renal Tidak Efektif",
                "Risiko Perfusi Serebral Tidak Efektif", "Berat Badan Lebih","Defisit Nutrisi","Diare",
                "Disfungsi Motilitas Gastrointestinal","Hipervolemia","Hipovolemia","Ikterik Neonatus",
                "Kesiapan Peningkatan Keseimbangan Cairan","Kesiapan Peningkatan Nutrisi",
                "Ketidakstabilan Kadar Glukosa Darah","Menyusui Efektif","Menyusui Tidak Efektif","Obesitas",
                "Risiko Berat Badan Lebih","Risiko Defisit Nutrisi","Risiko Disfungsi Motilitas Gastrointestinal",
                "Risiko Hipovolemia","Risiko Ikterik Neonatus","Risiko Ketidakseimbangan Cairan",
                "Risiko Ketidakseimbangan Elektrolit","Risiko Ketidakstabilan Kadar Glukosa Darah","Risiko Syok",
                "Gangguan Eliminasi Urin", "Inkontinensia Fekal","Inkontinensia Urin Berlanjut",
                "Inkontinensia Urin Berlebih","Inkontinensia Urin Fungsional","Inkontinensia Urin Refleks",
                "Inkontinensia Urin Stres","Inkontinensia Urin Urgensi","Kesiapan Peningkatan Eliminasi Urin",
                "Konstipasi", "Retensi Urin","Risiko Inkontinensia Urin Urgensi","Risiko Konstipasi",
                "Disorganisasi Perilaku Bayi","Gangguan Mobilitas Fisik","Gangguan Pola Tidur","Intoleransi Aktivitas",
                "Keletihan","Kesiapan Peningkatan Tidur","Risiko Disorganisasi Perilaku Bayi",
                "Risiko Intoleransi Aktivitas","Disrefleksia Otonom","Gangguan Memori","Gangguan Menelan",
                "Konfusi Akut","Konfusi Kronis","Penurunan Kapasitas Adaptif Intrakranial","Risiko Disfungsi Neurovaskuler Perifer",
                "Risiko Konfusi Akut","Disfungsi Seksual","Kesiapan Persalinan","Pola Seksual Tidak Efektif",
                "Risiko Disfungsi Seksual","Risiko Kehamilan Tidak Dikehendaki", "Gangguan Rasa Nyaman","Ketidaknyamanan Pasca Partum",
                "Nausea","Nyeri Akut","Nyeri Kronis","Nyeri Melahirkan", "Ansietas","Berduka", "Distres Spiritual",
                "Ganguan Citra Tubuh","Gangguan Identitas Diri","Gangguan Persepsi Sensori","Harga Diri Rendah Kronis",
                "Harga Diri Rendah Situasional"};



        listView = findViewById(R.id.listView);

        for (int i =0; i<title.length; i++){
            Model model = new Model(title[i]);
            //bind all strings in an array
            arrayList.add(model);
        }

        //pass results to listViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }


}
