/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionReparaciones;

import Reparaciones.Reparacion;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author dashs
 */
public class GestionReparacion {
    private Queue<Reparacion> cola;

    public GestionReparacion() {
        this.cola = new LinkedList<>();
    }
    
    public void agregarReparacion(Reparacion reparacion) {
        cola.add(reparacion);
    }
    
    public Reparacion procesarReparacion() {
        if (cola.isEmpty()) {
            return null;
        }
        Reparacion reparacion = cola.poll();
        return reparacion;
    }

    public Reparacion atenderReparacion() {
        if (!cola.isEmpty()) {
            return cola.poll();
        }
        return null;
    }
    
    public Reparacion verProximaReparacion() {
        return cola.peek();
    }
    
    public boolean estaVacia() {
        return cola.isEmpty();
    }
    
    public int obtenerTamano() {
        return cola.size();
    }
    
    public String  listarReparacion() {
         StringBuilder sb = new StringBuilder();
        for (Reparacion reparacion : cola) {
            sb.append(reparacion.toString()).append("\n");
        }
        return sb.toString();
    }
}
