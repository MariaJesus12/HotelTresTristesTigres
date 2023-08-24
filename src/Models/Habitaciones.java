/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Chiky
 */
public class Habitaciones {
    private int idhabitacion;
    private Enum habitacion;
    private boolean estado;
    private double precio;
    
    public Habitaciones(int idhabitacion, Enum habitacion, boolean estado, double precio){
        this.idhabitacion = idhabitacion;
        this.habitacion= habitacion;
        this.estado = false;
        this.precio= precio;
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public Enum getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Enum habitacion) {
        this.habitacion= habitacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void ocuparHabitacion() {
        estado = true;
    }

    public void liberarHabitacion() {
        estado = false;
    }
}
