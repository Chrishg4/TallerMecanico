/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mecanicos;

import java.util.HashSet;



/**
 *
 * @author krist
 */
public class Mecanico {
    private int id;
    private String nombre;
    private String especialidad;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public Mecanico(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public Mecanico() {
        this(0,"","");
    }
    
    public static boolean registrarMecanico(HashSet<Mecanico> mecanicos, Mecanico nuevoMecanico) {
        return mecanicos.add(nuevoMecanico); 
    }
  
    @Override
    public String toString() {
        return "Mecanico{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
    
    
    
}
