/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HistorialReparaciones;
import Reparaciones.Reparacion;
import java.util.Stack;

/**
 *
 * @author dashs
 */
public class HistorialReparacion {
    private Stack<Reparacion> historial;

    public HistorialReparacion() {
        this.historial = new Stack<>();
    }
    
    public void agregarReparacion(Reparacion reparacion) {
        historial.push(reparacion);
    }

    public Reparacion deshacerReparacion() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
    
    public Reparacion verUltimaReparacion() {
        if (!historial.isEmpty()) {
            return historial.peek();
        }
        return null;
    }
    
    public boolean estaVacio() {
        return historial.isEmpty();
    }
    
    public String listarHistorial() {
        StringBuilder sb = new StringBuilder();
        for (Reparacion reparacion : historial) {
            sb.append(reparacion.toString()).append("\n");
        }
        return sb.toString();
    }
    
}