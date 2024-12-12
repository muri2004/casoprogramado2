/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoprogramado2;

/**
 *
 * @author smuri
 */
public class Hotel {
    private Habitacion[][] habitaciones;
    private int pisos;
    private int habitacionesPorPiso;

    Hotel(int i, int i0) {
        
    }
    public void mostrarEstadoHabitaciones() {
        for (Habitacion[] piso : habitaciones) {
            for (Habitacion habitacion : piso) {
                System.out.println(habitacion);
                
            }
        }
    }

    public void inicializarHotel() {
         
    }
    
}











