package com.venky.androidsamples.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.venky.androidsamples.R;

public class AndroidMainActivity extends ListActivity {

    private String LOG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_main);


        String[] values = new String[] {"Dagger 2", "RX Java", "Retrofit"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);

        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        int itemPosition     = position;
        String  itemValue    = (String) l.getItemAtPosition(position);

        Log.i(LOG, "onListItemClick: " + itemValue + " Position -->" + itemPosition);
    }
}
