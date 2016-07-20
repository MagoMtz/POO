package main;

import clases.Profesor;

/**
 * Created by Mago on 19/07/2016.
 */
public class Implementacion {

    public static void main(String[] args) {
        Profesor pedro = new Profesor("Pedro", "Perez", 35, "125");
        pedro.muestraDatos();
        String list [] ={"Matemáticas", "Español", "Historia"};
        String clases = pedro.clases(list);
        System.out.println(clases);
        pedro.setApellido("Dominguez");
        pedro.muestraDatos();
    }

}
