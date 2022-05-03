/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Pais {
    
    private String nombre;
    private float poblacion;
    private ArrayList<Provincia> provinciaList;

    public Pais(String nombre, float poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.provinciaList = new ArrayList<>();
    }

    public Provincia crear(String nombre, float poblacion, int ciudades){
        var provi = new Provincia(nombre,poblacion,ciudades);
        this.provinciaList.add(provi);
        return provi;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(float poblacion) {
        this.poblacion = poblacion;
    }

    public ArrayList<Provincia> getProvinciaList() {
        return provinciaList;
    }

    public void setProvinciaList(ArrayList<Provincia> provinciaList) {
        this.provinciaList = provinciaList;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", poblacion=" + poblacion + ", provinciaList=" + provinciaList + '}';
    }

    
    
    
    
    
}
