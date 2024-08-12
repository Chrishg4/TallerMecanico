/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroMecanicos;

import Mecanicos.Mecanico;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author dashs
 */
public class RegistroMecanico {
    private Set<Mecanico> mecanicos;

    public RegistroMecanico() {
        this.mecanicos = new HashSet<>();
    }

    public void agregarMecanico(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }

    public Set<Mecanico> obtenerMecanicos() {
        return new HashSet<>(mecanicos);
    }

    public boolean eliminarMecanico(int id) {
        Iterator<Mecanico> iterator = mecanicos.iterator();
        while (iterator.hasNext()) {
            Mecanico mecanico = iterator.next();
            if (mecanico.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    
}