package Ejercicio_clase1;

import java.util.ArrayList;

public class Persona {
//Atributos
    private String nombre;

    private int edad;

    private EstadoCivil estadoCivil;


    private ArrayList<Persona> hijos= new ArrayList<>();

    private Persona [] padres = new Persona[2];


//Constructores
    public Persona() {
    }

    public Persona(String nombre, int edad, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }
//Métodos
//Nombre de la persona
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//Edad de la persona
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

//Estado civil de la persona
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

//Lista de hijos de la persona
    public ArrayList<Persona> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Persona> hijos) {
        this.hijos = hijos;
    }
//Array de pardes de la persona
    public Persona[] getPadres() {
        return padres;
    }

    public void setPadres(Persona[] padres) {
        this.padres = padres;
    }
//Metodo para agregar un hijo a la lista de hijos de la persona
    public void agregarHijos(Persona hijo){

        this.hijos.add(hijo);


    }
//Metodo para agregar un padre a la matriz de padres de la persona
    public void agregarPadre(Persona padre){

        for (int i = 0; i < padres.length ; i++) {

            if (padres[i] == null) {
                this.padres[i] = padre;
                break;
            }
        }

    }

//Metodo para mostrar que la persona camina por determinado lugar
    public int caminar(String lugar, int km){
        int pasos;

        pasos = km*3000;

        System.out.println("Estuve caminando por "+lugar);

        return pasos;
    }
}
