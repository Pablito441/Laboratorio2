package TP1_UML;
import java.sql.Date;
public class Vuelo {
    //atributos
    private String numeroVuelo;
    private Avion avion;
    private String fecha;
    private String origen;
    private String destino;
    //constructor

    public Vuelo(String numeroVuelo, Avion avion, String fecha, String origen, String destino) {
        this.numeroVuelo = numeroVuelo;
        this.avion = avion;
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
    }

    //gets y setters
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
