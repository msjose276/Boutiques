package com.example.mateusjose.boutiques;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mateusjose on 1/9/18.
 */

public class FragTabCamisa extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View page=inflater.inflate(R.layout.tab_general,container,false);
        List<Item> items=new ArrayList<>();


        items.add(new Item("1,000"));
        items.add(new Item("4,000"));
        items.add(new Item("3,000"));
        items.add(new Item("130"));
        items.add(new Item("900"));
        items.add(new Item("500"));

        CardAdaptor adaptor = new CardAdaptor(getContext(),items);
        ListView listView = (ListView) page.findViewById(R.id.lvItem);
        listView.setAdapter(adaptor);

        return page;
    }
}
