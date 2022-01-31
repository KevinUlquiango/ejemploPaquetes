package com.ulquiango.app.home;

import com.ulquiango.app.jardin.Perro;

import static com.ulquiango.app.home.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Perro perro = new Perro();
        String saludo =  saludar();

        System.out.println(saludo);

    }
}
