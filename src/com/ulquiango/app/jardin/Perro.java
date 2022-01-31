package com.ulquiango.app.jardin;

import com.ulquiango.app.home.Persona;

public class Perro {
    //protected  es igual a defaul
    protected String nombre;
    protected String rasa;

    String jugar(Persona persona){
        return persona.lansarPelota();
    }
}
