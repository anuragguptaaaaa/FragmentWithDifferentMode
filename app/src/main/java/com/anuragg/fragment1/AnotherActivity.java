package com.anuragg.fragment1;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnotherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Intent intent=getIntent();
        int index=intent.getIntExtra("index",0);
        FragmentManager manager=getFragmentManager();
        FragmentB f2= (FragmentB) manager.findFragmentById(R.id.fragment2);
        f2.changeData(index);
    }
}
