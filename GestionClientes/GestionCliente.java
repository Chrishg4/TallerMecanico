/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionClientes;

import Clientes.Cliente;
import Vehiculos.Vehiculo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dashs
 */
public class GestionCliente {
    private Map<Integer, Cliente> clientes;

    public GestionCliente() {
        this.clientes = new HashMap<>();
    }

    public void agregarCliente(Cliente cliente){
        clientes.put(cliente.getId(), cliente);
    }
    
    public List<Cliente> obtenerClientes() {
        return new ArrayList<>(clientes.values());
    }
    
    public void eliminarCliente(int id) {
        clientes.remove(id);
    }

}
