/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author UTN
 */
public class Servicios {
    private static int codigoservicio =1;
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    
    public Servicios(String nombre, String descripcion, double precio){
        this.codigo=codigoservicio++;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
    }

    public static int getCodigoservicio() {
        return codigoservicio;
    }

    public static void setCodigoservicio(int codigoservicio) {
        Servicios.codigoservicio = codigoservicio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
