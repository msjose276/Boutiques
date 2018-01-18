package com.example.mateusjose.boutiques;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mateusjose on 1/9/18.
 */

public class FragTabCalcas extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View page=inflater.inflate(R.layout.tab_general,container,false);

        final EditText editText=(EditText) page.findViewById(R.id.etSearch);
        editText.setHint(R.string.procurar_calcas);
        final List<Item> items=new ArrayList<>();
        final ListView listView = (ListView) page.findViewById(R.id.lvItem);


        //Mateus: create a list of images
        List<Bitmap> List_images = new ArrayList<>();
        //Mateus: add images into the list
        List_images.add(BitmapFactory.decodeResource(this.getResources(), R.drawable.calca));

        //Mateus:create new item and put them into a list
        items.add(new Item("Tia Maria","Maianga","1,000",List_images));
        items.add(new Item("Tia Joana","Talatona","3,500",List_images));
        items.add(new Item("Tia Tete","Mutamba","1,000",List_images));
        items.add(new Item("Tia Marcela","samba","3,500",List_images));

        //Mateus: call and set the card adaptor
        CardAdaptor adaptor = new CardAdaptor(getContext(),items);
        listView.setAdapter(adaptor);


        //Mateus: activate the code to search for a word
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }

        });


        //Mateus: if the text change it will do the search
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                String searchingWord = editText.getText().toString();


                List<Item> searchItems = new ArrayList<>();

                if (searchingWord.equalsIgnoreCase("")) {

                    CardAdaptor adaptor = new CardAdaptor(getContext(), items);
                    listView.setAdapter(adaptor);
                    adaptor.notifyDataSetChanged();

                } else {
                    // loop for the search
                    for (int k = 0; k < items.size(); k++) {

                        //search for boutiques according to the search word
                        if (searchingWord.toLowerCase().contains(items.get(k).getBoutique().toLowerCase())) {
                            searchItems.add(items.get(k));
                        }
                        //search for address according to the search word
                        if (searchingWord.toLowerCase().contains(items.get(k).getAddress().toLowerCase())) {
                            searchItems.add(items.get(k));
                        }
                        //search for price according to the search word
                        if (searchingWord.toLowerCase().contains(items.get(k).getPrice().toLowerCase())) {
                            searchItems.add(items.get(k));
                        }

                    }
                    CardAdaptor adaptor = new CardAdaptor(getContext(), searchItems);
                    listView.setAdapter(adaptor);
                    adaptor.notifyDataSetChanged();

                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        return page;

    }

}
