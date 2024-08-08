/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Vehiculo {
    private String matricula;
    private String modelo;
    private String marca;
    private int añoFabriacion;
    private static ArrayList<Vehiculo> listaVehiculos;

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAñoFabriacion() {
        return añoFabriacion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAñoFabriacion(int añoFabriacion) {
        this.añoFabriacion = añoFabriacion;
    }

    public Vehiculo(String matricula, String modelo, String marca, int añoFabriacion) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.añoFabriacion = añoFabriacion;
    }

    public Vehiculo() {
        this("","","",0);
    }
    
    public static void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    public static void imprimirListaVehiculos() {
        System.out.println("Lista de Vehículos:");
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println(vehiculo.toString());
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", a\u00f1oFabriacion=" + añoFabriacion + '}';
    }
    
    
}
