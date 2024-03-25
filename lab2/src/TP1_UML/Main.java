package TP1_UML;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear avión
        Avion avion = new Avion("Boeing 737", 150);

        // Crear vuelo
        Vuelo vuelo = new Vuelo("VN123", avion, "21 de Julio","Argentina","Japón");

        // Realizar reserva
        Reserva reserva = new Reserva("R123456", vuelo,  "Pablo Cáceres");

        // Imprimir detalles de la reserva
        System.out.println("Reserva realizada:");
        System.out.println("Número de reserva: " + reserva.getNumeroReserva());
        System.out.println("Vuelo: " + vuelo.getNumeroVuelo());
        System.out.println("Fecha del vuelo: " + vuelo.getFecha());
        System.out.println("Pasajero: " + reserva.getPasajero());
    }
}
