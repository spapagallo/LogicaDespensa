package com.example.sg.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import java.util.ArrayList;

/**
 * Created by SG on 28-12-2015.
 */

public class Despensa extends Activity {

    ArrayList<String> ingredientes = new ArrayList<String>();;
    ListView lv;
    Ingrediente[] modelItems;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.despensa);
        ingredientes.add("sal");
        ingredientes.add("pimienta");
        ingredientes.add("aceite");
        ingredientes.add("arroz");
        ingredientes.add("zanahoria");
        ingredientes.add("algo1");
        ingredientes.add("algo2");
        ingredientes.add("algo3");
        ingredientes.add("algo4");
        irAddIngrediente();
        mostrarIngredientes();
    }

    private void irAddIngrediente(){
        Button agregar = (Button) findViewById(R.id.btnAdd);
        final EditText text = (EditText) findViewById(R.id.addIngText);
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingredientes.add(text.getText().toString());
                text.setText("");
                mostrarIngredientes();
            }
        });
    }
    private  void mostrarIngredientes(){

        lv = (ListView) findViewById(R.id.listView1);

        modelItems = new Ingrediente[ingredientes.size()];
        for (int i=0; i<ingredientes.size(); i++) {
            modelItems[i] = new Ingrediente(ingredientes.get(i));
        }

        DespensaAdapter adapter = new DespensaAdapter(this, modelItems);
        lv.setAdapter(adapter);
    }
}
