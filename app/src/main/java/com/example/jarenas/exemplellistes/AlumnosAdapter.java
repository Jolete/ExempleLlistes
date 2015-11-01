package com.example.jarenas.exemplellistes;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * Created by jarenas on 1/11/2015.
 */
public class AlumnosAdapter extends ArrayAdapter{
    Context context;
    int layoutResourceId;
    Alumnos[] data;

    public AlumnosAdapter(Context context, int resource, Alumnos[] data) {
        super(context, resource, data);

        this.context = context;
        this.layoutResourceId = resource;
        this.data = data;
    }

    public AlumnosAdapter(Context context, int resource) {
        super(context, resource);
    }

    public AlumnosAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public AlumnosAdapter(Context context, int resource, Object[] objects) {
        super(context, resource, objects);
    }

    public AlumnosAdapter(Context context, int resource, int textViewResourceId, Object[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public AlumnosAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
    }

    public AlumnosAdapter(Context context, int resource, int textViewResourceId, List objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        AlumnosHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId,parent, false);

            holder = new AlumnosHolder();
            holder.image = (ImageView) row.findViewById(R.id.image);
            holder.text = (TextView) row.findViewById(R.id.text);
            row.setTag(holder);
        } else
        {
            holder = (AlumnosHolder) row.getTag();
        }

        Alumnos alumnos = data[position];
        holder.text.setText(alumnos.title);
        holder.image.setImageResource(alumnos.icon);

        return row;
    }

    // Ens permet manternir les dades de la llista i millorar el rendiment de la llista
    static class AlumnosHolder {
        ImageView image;
        TextView text;
    }
}
