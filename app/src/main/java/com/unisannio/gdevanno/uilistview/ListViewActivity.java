package com.unisannio.gdevanno.uilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Create a new Adapter containing a list of colors
        //Set the adapter on this ListActivity's built-in ListView

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_list_view,
                getResources().getStringArray(R.array.colors)));

        ListView lv = getListView();

        //Enable filtering when the user types in the virtual keyboard
        lv.setTextFilterEnabled(true);

        //Set on setOnItemClickListener on the ListView

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Display a toast message indicting the selected item
                Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}