/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;


/**
 *
 * @author chris
 */
public class Vehiculo {
    private String matricula;
    private String modelo;
    private String marca;
    private int annioFabriacion;
    

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnnioFabriacion() {
        return annioFabriacion;
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
        this.annioFabriacion = annioFabriacion;
    }

    public Vehiculo(String matricula, String modelo, String marca, int annioFabriacion) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.annioFabriacion = annioFabriacion;
        
    }

    public Vehiculo() {
        this("","","",0);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", a\u00f1oFabriacion=" + annioFabriacion + '}';
    }
    
    
}
