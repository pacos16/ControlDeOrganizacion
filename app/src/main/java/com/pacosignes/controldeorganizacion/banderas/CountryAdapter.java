package com.pacosignes.controldeorganizacion.banderas;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pacosignes.controldeorganizacion.R;


public class CountryAdapter extends ArrayAdapter {
    private Country[] countries;

    public CountryAdapter(@NonNull Context context,  Country[] countries) {
        super(context, R.layout.listitem_country, countries);
        this.countries = countries;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder holder;
        if(convertView==null) {
            convertView = LayoutInflater.from(this.getContext()).inflate(
                    R.layout.listitem_country, null);
            holder=new ViewHolder();
            holder.ivFlag= (ImageView) convertView.findViewById(R.id.ivFlag);
            holder.tvCountry=  convertView.findViewById(R.id.tvCountry);
            holder.tvCaptial= convertView.findViewById(R.id.tvCapital);
            holder.tvPopulation=convertView.findViewById(R.id.tvPopulation);

            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }

        Country country=countries[position];
        holder.tvCountry.setText(country.getCountryName());
        holder.tvCaptial.setText(country.getCountryCapital());
        holder.tvPopulation.setText(""+country.getCountryPopulation());
        int id = this.getContext().getResources().getIdentifier("_"+country.getCountryCode().toLowerCase(),
                "drawable", holder.ivFlag.getContext().getPackageName());
        holder.ivFlag.setImageResource(id);
        return convertView;

    }

    public static class ViewHolder{
        TextView tvCountry;
        TextView tvCaptial;
        TextView tvPopulation;
        ImageView ivFlag;

    }
}
