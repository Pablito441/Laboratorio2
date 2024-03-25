package TP1_UML;

public class Avion {
    //atributos
    private String modelo;
    private int capacidad;
//constructores
    public Avion(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
//gets y setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}

