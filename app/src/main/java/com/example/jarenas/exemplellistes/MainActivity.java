package com.example.jarenas.exemplellistes;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    static final String[] Nombres = new String[] {"José", "Luís", "Ariadna", "Arnau", "Lourdes", "Mariano", "Agustí", "Pepo", "Àngel", "Alfredo", "Alfonso", "Roberto", "Pablo"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setListAdapter(new ArrayAdapter<String>( this, listView , Nombres));
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Nombres));
        listView = getListView();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object listItem = listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
