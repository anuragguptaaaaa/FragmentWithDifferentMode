package com.anuragg.fragment1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Anurag_305 on 08-May-17.
 */

public class FragmentA extends Fragment {
    ListView listView;
    Communicator communicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
        View v= inflater.inflate(R.layout.fragment_a,container,false);
        listView= (ListView) v.findViewById(R.id.listview);
        ArrayAdapter arrayAdapter=ArrayAdapter.createFromResource(getActivity(),R.array.chapter,android.R.layout.simple_dropdown_item_1line);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            communicator.respond(i);
            }
        });
        return v;
    }
    public void setCommunicator(Communicator communicator)
    {
        this.communicator=communicator;
    }
    public interface Communicator
    {
        public void respond(int index);
    }


}
