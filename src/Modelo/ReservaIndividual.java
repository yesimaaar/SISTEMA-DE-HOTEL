/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Pablo
 */
public class ReservaIndividual extends Reserva {
    public ReservaIndividual(Cliente cliente, String direccion, String fechaLlegada, String fechaSalida, String tipoHabitacion, int numeroPersonas) {
        super(cliente, direccion, fechaLlegada, fechaSalida, tipoHabitacion, numeroPersonas); // Llamada al constructor de Reserva
    }

    @Override
    public double calcularPrecioBase() {
        return 100.0; // Precio fijo para una persona
    }
}
