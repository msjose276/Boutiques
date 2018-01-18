package com.example.mateusjose.boutiques;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mateusjose on 1/9/18.
 */

public class CardAdaptor extends ArrayAdapter<Item> {

    List<Item> listCard;
    LayoutInflater layoutInflater;
    public CardAdaptor(@NonNull Context context, @NonNull List objects) {
        super(context, R.layout.activity_card, objects);
        listCard=objects;
        layoutInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView=layoutInflater.inflate(R.layout.activity_card,parent,false);
        }

        TextView Price =(TextView) convertView.findViewById(R.id.tvPrice);
        TextView Location =(TextView) convertView.findViewById(R.id.tvBoutique);
        TextView Boutique =(TextView) convertView.findViewById(R.id.tvLocation);
        ImageView Image =(ImageView) convertView.findViewById(R.id.ivImage);

        Price.setText(listCard.get(position).getPrice());
        Location.setText("Sao Paulo");
        //Boutique.setText(listCard.get(position).toString());
        Image.setImageBitmap(listCard.get(position).getImages().get(0));

        return convertView;
    }

}
