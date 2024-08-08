/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reparaciones;

import Mecanicos.Mecanico;
import Vehiculos.Vehiculo;
import java.time.LocalDate;


public class Reparacion {
    private int id;
    private Vehiculo vehiculo;
    private Mecanico mecanico;
    private LocalDate fecha;
    private String descripcion;
    private char estado;
    public static final char MANT='M', TERMI='T', PROC='P';

    public int getId() {
        return id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return switch (estado) {
            case MANT -> "Mantenimiento";
            case TERMI -> "Terminada";
            case PROC -> "Procesando";
            default -> "Estado no reconocido";
        };
    }

    public void setEstado(char estado) {
        estado=Character.toUpperCase(estado);
        if (estado=='M'||estado=='A'||estado=='P' ||estado=='D'){
        this.estado=estado;
        }
    }

    public Reparacion(int id, Vehiculo vehiculo, Mecanico mecanico, LocalDate fecha, String descripcion, char estado) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.mecanico = mecanico;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Reparacion() {
        this(0, new Vehiculo(), new Mecanico(), LocalDate.now(), "", MANT);
    }

    @Override
    public String toString() {
        return "Reparacion{" + "id=" + id + ", vehiculo=" + vehiculo + ", mecanico=" + mecanico 
                + ", fecha=" + fecha + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }
}