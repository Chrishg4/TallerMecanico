/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaVehiculos;

import Vehiculos.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class ListaVehiculo {
    private ArrayList<Vehiculo> listaVehiculos;

    public ListaVehiculo() {
        this.listaVehiculos = new ArrayList<>();
    }

    public ArrayList<Vehiculo> listarVehiculos() {
        return listaVehiculos;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    
}
