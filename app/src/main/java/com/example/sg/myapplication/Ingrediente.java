package com.example.sg.myapplication;

/**
 * Created by SG on 29-12-2015.
 */
public class Ingrediente {

    String nombre;
    String categoria;

    public Ingrediente(String nombre) {
        this.nombre = nombre;
        this.categoria = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
