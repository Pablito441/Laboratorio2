package TP1_UML;
import  java.sql.Date;
public class Reserva {
    //atributos
    private String numeroReserva;
    private Vuelo vuelo;
    private String pasajero;
//constructores
    public Reserva(String numeroReserva, Vuelo vuelo, String pasajero) {
        this.numeroReserva = numeroReserva;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
    }
//get y setters
    public String getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(String numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }
}