package com.example.customlistview_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class LanguageAdapter extends ArrayAdapter<Language> {

    private Context mContext;
    private int mResource;


    public LanguageAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Language> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource, parent, false);

        ImageView imageView = convertView.findViewById(R.id.image);

        TextView textName = convertView.findViewById(R.id.textName);

        TextView textDescription = convertView.findViewById(R.id.textDescription);

        imageView.setImageResource(getItem(position).getImage());

        textName.setText(getItem(position).getName());
        textDescription.setText(getItem(position).getDescription());

        return convertView;
    }
}
