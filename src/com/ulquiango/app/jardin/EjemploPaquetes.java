package com.ulquiango.app.jardin;

import com.ulquiango.app.home.*;

import static com.ulquiango.app.home.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Kevin");
        persona.setApellido("Ulquiango");
        persona.setColorPelo(RUBIO);
        System.out.println(persona.getNombre());

        Perro perro = new Perro();
        perro.nombre  = "Boby";
        perro.rasa = "Frenspudol";

        String jugando =  perro.jugar(persona);
        System.out.println(jugando);

        String saludo = Persona.saludar();
        String generoMasculino =  Persona.GENERO_MASCULINO;
        String generoFemenino = Persona.GENERO_FEMENINO;
        System.out.println(generoFemenino);
        System.out.println(generoMasculino);
        System.out.println(saludo);
    }
}
