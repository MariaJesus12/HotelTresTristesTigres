/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Habitaciones;
import java.util.ArrayList;

/**
 *
 * @author Chiky
 */
class AdministracionDeHabitaciones implements List<Habitaciones> {
    private ArrayList<Habitaciones> habitaciones;

    public AdministracionDeHabitaciones() {
        habitaciones = new ArrayList<>();
    }

    @Override
    public void insert(Habitaciones obj) {
        habitaciones.add(obj);
    }

    @Override
    public void update(Habitaciones obj) {
        for (Habitaciones habitacion : habitaciones) {
            if (habitacion.getIdhabitacion() == obj.getIdhabitacion()) {
                habitacion.setHabitacion(obj.getHabitacion());
                break;
            }
        }
    }

    @Override
    public void delete(Habitaciones obj) {
        habitaciones.remove(obj);
    }

    @Override
    public void read(Object id) {
        for (Habitaciones habitacion : habitaciones) {
            if (habitacion.getIdhabitacion() == (int) id) {
                System.out.println("Habitación: " + habitacion.getIdhabitacion());
                System.out.println("Tipo: " + habitacion.getHabitacion());
                System.out.println("Ocupada: " + habitacion.isEstado());
                System.out.println("Precio: " + habitacion.getPrecio());
                break;
            }
        }
    }

    @Override
    public void readAll() {
        for (Habitaciones habitacion : habitaciones) {
            System.out.println("Habitación: " + habitacion.getIdhabitacion());
            System.out.println("Tipo: " + habitacion.getHabitacion());
            System.out.println("Ocupada: " + habitacion.isEstado());
            System.out.println("Precio: " + habitacion.getPrecio());
            System.out.println("---------------");
        }
    }
}

