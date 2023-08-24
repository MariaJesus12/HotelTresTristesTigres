/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Servicios;
import java.util.HashMap;

/**
 *
 * @author UTN
 */
public class AdministracionDeServicios implements List<Servicios> {
    private HashMap<Integer, Servicios> servicios;

    public AdministracionDeServicios() {
        servicios = new HashMap<>();
    }
    @Override
    public void insert(Servicios obj) {
        Servicios servicio = new Servicios("", "", 0);
        servicios.put(servicio.getCodigo(), servicio);
    }

    @Override
    public void update(Servicios obj) {
        Servicios servicio = servicios.get(obj);
        if (servicio != null) {
            String nuevaDescripcion = null;
            servicio.setDescripcion(nuevaDescripcion);
            System.out.println("La descripcion ha sido actualizada existosamente");
            double nuevoPrecio = 0;
            servicio.setPrecio(nuevoPrecio);
            System.out.println("El precio ha sido actualizadp exitosamente");
        }
    }

    @Override
    public void delete(Servicios codigo) {
        servicios.remove(codigo);
    }

    @Override
    public Servicios search(Object codigo) {
        return servicios.get(codigo);
    }

 
}
