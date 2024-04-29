package com.example.jsonparser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class KontakAdapter extends ArrayAdapter<Kontak> {

    private static class ViewHolder {
        TextView id;
        TextView nama;
        TextView email;
        TextView mobile;
    }
    public KontakAdapter(Context context, int resource, List<Kontak> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        Kontak dtKontak = getItem(position);
        ViewHolder v;
        if (convertView == null) {
            v = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
            v.id  = (TextView) convertView.findViewById(R.id.tId);
            v.nama= (TextView) convertView.findViewById(R.id.tNama);
            v.email= (TextView) convertView.findViewById(R.id.email);
            v.mobile = (TextView) convertView.findViewById(R.id.mobile);
            convertView.setTag(v);

//            Button b = (Button)convertView.findViewById(R.id.btn);
//            b.setTag(position);
//            b.setOnClickListener(op);
        } else {
            v = (ViewHolder)convertView.getTag();
        }
        v.id.setText(dtKontak.getId());
        v.nama.setText(dtKontak.getNama());
        v.email.setText(dtKontak.getEmail());
        v.mobile.setText(dtKontak.getMobile());
        return convertView;
    }
}
