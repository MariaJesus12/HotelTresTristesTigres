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
    public Habitaciones search(Object tipo) {
    for (Habitaciones habitacion : habitaciones) {
        if (habitacion.getHabitacion().equals(tipo)) {
            return habitacion;
        }
    }
    return null;
}
}

