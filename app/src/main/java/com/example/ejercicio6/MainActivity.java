package com.example.ejercicio6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv1, tv2;
    private Spinner sp1, sp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv_resultado1);
        tv2 = (TextView) findViewById(R.id.tv_resultado2);
        sp1 = (Spinner) findViewById(R.id.sp_1);
        sp2 = (Spinner) findViewById(R.id.sp_2);
        String[] opciones = {"Albacete", "Ciudad Real", "Cuenca", "Guadalajara", "Toledo"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_rcorp, opciones);
        sp1.setAdapter(adapter);

        String[] opciones2 = {"Talavera de la Reina", "Mejorada", "Navalcán", "Lucillos", "Hontanar"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.spinner_item_rcorp, opciones2);
        sp2.setAdapter(adapter2);




    }
        public void Calcular(View view) {
            String seleccion = sp1.getSelectedItem().toString();
            String seleccion2 = sp2.getSelectedItem().toString();
            if (seleccion.equals("Albacete")) {

                tv1.setText("Has seleccionado Albacete");
            }
            if (seleccion.equals("Ciudad Real")) {

                tv1.setText("Has seleccionado Ciudad Real");
            }
            if (seleccion.equals("Cuenca")) {

                tv1.setText("Has seleccionado Cuenca");
            }
            if (seleccion.equals("Guadalajara")) {

                tv1.setText("Has seleccionado Guadalajara");
            }
            if (seleccion.equals("Toledo")) {

                tv1.setText("Has seleccionado Toledo");
            }





            if (seleccion2.equals("Talavera de la Reina")) {


                tv2.setText("Has seleccionado Talavera de la Reina");
            }


            if (seleccion2.equals("Mejorada")) {

                tv2.setText("Has seleccionado Mejorada");
            }
            if (seleccion2.equals("Navalcán")) {

                tv2.setText("Has seleccionado Navalcán");
            }
            if (seleccion2.equals("Lucillos")) {

                tv2.setText("Has seleccionado Lucillos");
            }
            if (seleccion2.equals("Hontanar")) {

                tv2.setText("Has seleccionado Hontanar");
            }
        }

    }


