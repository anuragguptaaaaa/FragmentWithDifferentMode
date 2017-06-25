package com.anuragg.fragment1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Anurag_305 on 08-May-17.
 */

public class FragmentB extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
        View v= inflater.inflate(R.layout.fragment_b,container,false);
        textView= (TextView) v.findViewById(R.id.tv);
        return v;
    }
    public void changeData(int i)
    {
        String detail[]=getResources().getStringArray(R.array.details);

        textView.setText(detail[i]);
    }
}
