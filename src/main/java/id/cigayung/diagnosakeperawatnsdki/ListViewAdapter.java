package id.cigayung.diagnosakeperawatnsdki;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter{

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;

    //constructor
    public ListViewAdapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitleTv;

    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.mainTitle);



            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textviews
        holder.mTitleTv.setText(modellist.get(postition).getTitle());

        //set the result in imageview


        //listview item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code later
                if (modellist.get(postition).getTitle().equals("Bersihan Jalan Nafas Tidak Efektif")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, bersihanjlnafasActivity.class);
                    intent.putExtra("actionBarTitle", "Bersihan Jalan Nafas Tidak Efektif");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Gangguan Pertukaran Gas")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, ggpertukarangasActivity.class);
                    intent.putExtra("actionBarTitle", "Gangguan Pertukaran Gas");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Gangguan Penyapihan Ventilator")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, res2Activity.class);
                    intent.putExtra("actionBarTitle", "Gangguan Penyapihan Ventilator");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Gangguan Ventilasi Spontan")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Mres04Activity.class);
                    intent.putExtra("actionBarTitle", "Gangguan Ventilasi Spontan");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Pola Napas Tidak Efektif")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, res05Activity.class);
                    intent.putExtra("actionBarTitle", "Pola Napas Tidak Efektif");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Risiko Aspirasi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, res06Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Aspirasi");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Gangguan Sirkulasi Spontan")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sir1Activity.class);
                    intent.putExtra("actionBarTitle", "Gangguan Sirkulasi Spontan");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Penurunan Curah Jantung")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sir2Activity.class);
                    intent.putExtra("actionBarTitle", "Penurunan Curah Jantung");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Perfusi Perifer Tidak Efektif")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sir3Activity.class);
                    intent.putExtra("actionBarTitle", "Perfusi Perifer Tidak Efektif");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Risiko Gangguan Sirkulasi Spontan")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sir4Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Gangguan Sirkulasi Spontan");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Risiko Penurunan Curah Jantung")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sir5Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Penurunan Curah Jantung");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Risiko Perdarahan")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sir6Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Perdarahan");
                    mContext.startActivity(intent);

                }

                if (modellist.get(postition).getTitle().equals("Risiko Perfusi Gastrointestinal Tidak Efektif")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sir7Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Perfusi Gastrointestinal Tidak Efektif");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Risiko Perfusi Miokard Tidak Efektif")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sir8Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Perfusi Miokard Tidak Efektif");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Risiko Perfusi Perifer Tidak Efektif")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sir9Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Perfusi Perifer Tidak Efektif");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Risiko Perfusi Renal Tidak Efektif")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sir10Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Perfusi Renal Tidak Efektif");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Risiko Perfusi Serebral Tidak Efektif")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sir11Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Perfusi Serebral Tidak Efektif");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Berat Badan Lebih")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut1Activity.class);
                    intent.putExtra("actionBarTitle", "Berat Badan Lebih");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Defisit Nutrisi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut2Activity.class);
                    intent.putExtra("actionBarTitle", "Defisit Nutrisi");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Diare")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut3Activity.class);
                    intent.putExtra("actionBarTitle", "Diare");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Disfungsi Motilitas Gastrointestinal")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut4Activity.class);
                    intent.putExtra("actionBarTitle", "Disfungsi Motilitas Gastrointestinal");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Hipervolemia")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut5Activity.class);
                    intent.putExtra("actionBarTitle", "Hipervolemia");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Hipovolemia")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut6Activity.class);
                    intent.putExtra("actionBarTitle", "Hipovolemia");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Ikterik Neonatus")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut7Activity.class);
                    intent.putExtra("actionBarTitle", "Ikterik Neonatus");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Kesiapan Peningkatan Keseimbangan Cairan")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut8Activity.class);
                    intent.putExtra("actionBarTitle", "Kesiapan Peningkatan Keseimbangan Cairan");
                    mContext.startActivity(intent);

                }
                if (modellist.get(postition).getTitle().equals("Kesiapan Peningkatan Nutrisi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut9Activity.class);
                    intent.putExtra("actionBarTitle", "Kesiapan Peningkatan Nutrisi");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Ketidakstabilan Kadar Glukosa Darah")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut10Activity.class);
                    intent.putExtra("actionBarTitle", "Ketidakstabilan Kadar Glukosa Darah");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Menyusui Efektif")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut11Activity.class);
                    intent.putExtra("actionBarTitle", "Menyusui Efektif");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Menyusui Tidak Efektif")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut12Activity.class);
                    intent.putExtra("actionBarTitle", "Menyusui Tidak Efektif");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Obesitas")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut13Activity.class);
                    intent.putExtra("actionBarTitle", "Obesitas");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Berat Badan Lebih")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut14Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Berat Badan Lebih");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Defisit Nutrisi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut15Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Defisit Nutrisi");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Disfungsi Motilitas Gastrointestinal")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut16Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Disfungsi Motilitas Gastrointestinal");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Hipovolemia")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut17Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Hipovolemia");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Ikterik Neonatus")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut18Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Ikterik Neonatus");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Ketidakseimbangan Cairan")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut19Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Ketidakseimbangan Cairan");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Ketidakseimbangan Elektrolit")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut20Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Ketidakseimbangan Elektrolit");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Ketidakstabilan Kadar Glukosa Darah")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut21Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Ketidakstabilan Kadar Glukosa Darah");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Syok")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, nut22Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Syok");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Gangguan Eliminasi Urin")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, eliminasi1Activity.class);
                    intent.putExtra("actionBarTitle", "Gangguan Eliminasi Urin");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Inkontinensia Fekal")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, eliminasi2Activity.class);
                    intent.putExtra("actionBarTitle", "Inkontinensia Fekal");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Inkontinensia Urin Berlanjut")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, eliminasi3Activity.class);
                    intent.putExtra("actionBarTitle", "Inkontinensia Urin Berlanjut");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Inkontinensia Urin Berlebih")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, elimiansi4Activity.class);
                    intent.putExtra("actionBarTitle", "Inkontinensia Urin Berlebih");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Inkontinensia Urin Fungsional")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, eliminasi5Activity.class);
                    intent.putExtra("actionBarTitle", "Inkontinensia Urin Fungsional");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Inkontinensia Urin Refleks")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, eliminasi6Activity.class);
                    intent.putExtra("actionBarTitle", "Inkontinensia Urin Refleks");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Inkontinensia Urin Stres")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, eliminasi7Activity.class);
                    intent.putExtra("actionBarTitle", "Inkontinensia Urin Stres");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Inkontinensia Urin Urgensi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, eliminasi8Activity.class);
                    intent.putExtra("actionBarTitle", "Inkontinensia Urin Urgensi");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Kesiapan Peningkatan Eliminasi Urin")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, eliminasi9Activity.class);
                    intent.putExtra("actionBarTitle", "Kesiapan Peningkatan Eliminasi Urin");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Konstipasi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, eliminasi10Activity.class);
                    intent.putExtra("actionBarTitle", "Konstipasi");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Retensi Urin")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, eliminasi11Activity.class);
                    intent.putExtra("actionBarTitle", "Retensi Urin");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Inkontinensia Urin Urgensi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, eliminasi12Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Inkontinensia Urin Urgensi");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Konstipasi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, eliminasi13Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Konstipasi");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Disorganisasi Perilaku Bayi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, aktivis1Activity.class);
                    intent.putExtra("actionBarTitle", "Disorganisasi Perilaku Bayi");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Gangguan Mobilitas Fisik")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, aktivis2Activity.class);
                    intent.putExtra("actionBarTitle", "Gangguan Mobilitas Fisik");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Gangguan Pola Tidur")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, aktivis3Activity.class);
                    intent.putExtra("actionBarTitle", "Gangguan Pola Tidur");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Intoleransi Aktivitas")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, aktivis4Activity.class);
                    intent.putExtra("actionBarTitle", "Intoleransi Aktivitas");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Keletihan")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, aktivis5Activity.class);
                    intent.putExtra("actionBarTitle", "Keletihan");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Kesiapan Peningkatan Tidur")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, aktivis6Activity.class);
                    intent.putExtra("actionBarTitle", "Kesiapan Peningkatan Tidur");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Disorganisasi Perilaku Bayi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, aktivis7Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Disorganisasi Perilaku Bayi");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Intoleransi Aktivitas")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, aktivis8Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Intoleransi Aktivitas");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Disrefleksia Otonom")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, neuro1Activity.class);
                    intent.putExtra("actionBarTitle", "Disrefleksia Otonom");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Gangguan Memori")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, neuro2Activity.class);
                    intent.putExtra("actionBarTitle", "Gangguan Memori");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Gangguan Menelan")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, neuro3Activity.class);
                    intent.putExtra("actionBarTitle", "Gangguan Menelan");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Konfusi Akut")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, neuro4Activity.class);
                    intent.putExtra("actionBarTitle", "Konfusi Akut");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Konfusi Kronis")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, neuro5Activity.class);
                    intent.putExtra("actionBarTitle", "Konfusi Kronis");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Penurunan Kapasitas Adaptif Intrakranial")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, neuro6Activity.class);
                    intent.putExtra("actionBarTitle", "Penurunan Kapasitas Adaptif Intrakranial");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Disfungsi Neurovaskuler Perifer")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, neuro7Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Disfungsi Neurovaskuler Perifer");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Konfusi Akut")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, neuro8Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Konfusi Akut");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Disfungsi Seksual")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, repro1Activity.class);
                    intent.putExtra("actionBarTitle", "Disfungsi Seksual");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Kesiapan Persalinan")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, repro2Activity.class);
                    intent.putExtra("actionBarTitle", "Kesiapan Persalinan");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Pola Seksual Tidak Efektif")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, repro3Activity.class);
                    intent.putExtra("actionBarTitle", "Pola Seksual Tidak Efektif");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Disfungsi Seksual")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, repro4Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Disfungsi Seksual");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Risiko Kehamilan Tidak Dikehendaki")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, repro5Activity.class);
                    intent.putExtra("actionBarTitle", "Risiko Kehamilan Tidak Dikehendaki");
                    mContext.startActivity(intent);
                }

            }
        });


        return view;
    }

    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}
