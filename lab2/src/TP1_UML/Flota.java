package TP1_UML;

public class Flota {
    //atributo
    private Avion[] aviones;
//constructor
    public Flota(Avion[] aviones) {
        this.aviones = aviones;
    }
//get y setter
    public Avion[] getAviones() {
        return aviones;
    }

    public void setAviones(Avion[] aviones) {
        this.aviones = aviones;
    }
//Metodo para agregar y eliminar avion de la flota solo a modo de ejemplificación
    public void agregarAvion(Avion avion) {
    }

    public void eliminarAvion(Avion avion) {
    }
}
