/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import Vehiculos.Vehiculo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author pamel
 */
public class Cliente {
    private int id;
    private String nombre;
    private String telefono; 
    private String direccion; 
    private HashMap<Cliente, List<Vehiculo>> relacionesClientesVehiculos;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente(int id, String nombre, String telefono, String direccion, HashMap<Cliente, List<Vehiculo>> relacionesClientesVehiculos) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.relacionesClientesVehiculos = new HashMap<>();
    }

    public Cliente(){
        this(0, "", "", "",new HashMap<>());
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
    public void AgregarVehiculo(Cliente cliente, Vehiculo vehiculo){
        List<Vehiculo> vehiculos = relacionesClientesVehiculos.get(cliente);
         if (vehiculos == null){
              vehiculos = new ArrayList<>();
            vehiculos.add(vehiculo);
            relacionesClientesVehiculos.put(cliente, vehiculos);
        } else{
              vehiculos.add(vehiculo);
         }
    }
     public List<Vehiculo> obtenerVehiculos(Cliente cliente) {
        return relacionesClientesVehiculos.get(cliente);
    }
 
    
}
