package com.example.sg.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by SG on 29-12-2015.
 */
public class DespensaAdapter extends ArrayAdapter<Ingrediente>{

    Ingrediente[] modelItems = null;
    Context context;

    public DespensaAdapter(Context context, Ingrediente[] resource) {
        super(context,R.layout.row,resource);
        this.context = context;
        this.modelItems = resource;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.row, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.textView1);
        CheckBox cb = (CheckBox) convertView.findViewById(R.id.checkBox1);
        name.setText(modelItems[position].getNombre());
        return convertView;
    }

}
