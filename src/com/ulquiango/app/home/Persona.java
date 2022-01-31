package com.ulquiango.app.home;

import java.util.PrimitiveIterator;

public class Persona {
    private String nombre;
    private String apellido;
    private ColorPelo colorPelo;
    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String lansarPelota(){
        return "Lanza la pelota al perrp!";
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    public static String saludar(){
        return "Hola que hace";
    }
}
