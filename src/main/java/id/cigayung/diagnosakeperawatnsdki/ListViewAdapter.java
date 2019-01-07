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
