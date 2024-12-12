/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoprogramado2;

/**
 *
 * @author smuri
 */
public class Casoprogramado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel hotel = new Hotel(3, 10);
        hotel.mostrarEstadoHabitaciones();
        hotel.inicializarHotel();
        
    }
    enum Estado {
        LIBRE, OCUPADA, SUCIA
        
    }
    
}


