package clases;

import interfaces.Interfaz;

import java.util.Arrays;

/**
 * Created by Mago on 19/07/2016.
 */
public class Profesor extends Persona implements Interfaz {
    private String claveProfesor;

    public Profesor(String nombre, String apellido, int edad, String claveProfesor) {
        super(nombre, apellido, edad);
        this.claveProfesor=claveProfesor;
    }

    public String getClaveProfesor() {
        return claveProfesor;
    }

    public void setClaveProfesor(String claveProfesor) {
        this.claveProfesor = claveProfesor;
    }

    @Override
    public void muestraDatos() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Edad: "+getEdad());
        System.out.println("Clave: "+claveProfesor);
    }

    public String clases(String list[]){
        return Arrays.toString(list);
    }

}
