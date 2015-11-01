package com.example.jarenas.exemplellistes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listView = (ListView) findViewById(R.id.listview);

        Alumnos alumnos_datos[] = new Alumnos[] {
                new Alumnos(R.drawable.ic_launcher, "José"),
                new Alumnos(R.drawable.ic_launcher, "Luís"),
                new Alumnos(R.drawable.ic_launcher, "Ariadna"),
                new Alumnos(R.drawable.ic_launcher, "Lourdes"),
                new Alumnos(R.drawable.ic_launcher, "Arnau"),
                new Alumnos(R.drawable.ic_launcher, "Mariano"),
                new Alumnos(R.drawable.ic_launcher, "Agustí"),
                new Alumnos(R.drawable.ic_launcher, "Pepo"),
                new Alumnos(R.drawable.ic_launcher, "Àngel"),
                new Alumnos(R.drawable.ic_launcher, "Alfredo"),
                new Alumnos(R.drawable.ic_launcher, "Alfonso"),
                new Alumnos(R.drawable.ic_launcher, "Roberto"),
                new Alumnos(R.drawable.ic_launcher, "Pablo"),
                new Alumnos(R.drawable.ic_launcher, "José"),
                new Alumnos(R.drawable.ic_launcher, "Luís"),
                new Alumnos(R.drawable.ic_launcher, "Ariadna"),
                new Alumnos(R.drawable.ic_launcher, "Lourdes"),
                new Alumnos(R.drawable.ic_launcher, "Arnau"),
                new Alumnos(R.drawable.ic_launcher, "Mariano"),
                new Alumnos(R.drawable.ic_launcher, "Agustí"),
                new Alumnos(R.drawable.ic_launcher, "Pepo"),
                new Alumnos(R.drawable.ic_launcher, "Àngel"),
                new Alumnos(R.drawable.ic_launcher, "Alfredo"),
                new Alumnos(R.drawable.ic_launcher, "Alfonso"),
                new Alumnos(R.drawable.ic_launcher, "Roberto"),
                new Alumnos(R.drawable.ic_launcher, "Pablo")
        };

        AlumnosAdapter adapter = new AlumnosAdapter(this, R.layout.listview_item_row, alumnos_datos);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header_row, null);
        listView.addHeaderView(header);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v = (TextView) view.findViewById(R.id.text);
                Toast.makeText(getApplicationContext(), v.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
