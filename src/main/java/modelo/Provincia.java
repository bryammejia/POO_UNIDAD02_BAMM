/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Provincia {
    
    private String nombre;
    private float poblacion;
    private int ciudades;

    public Provincia(String nombre, float poblacion, int ciudades) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.ciudades = ciudades;
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

    public int getCiudades() {
        return ciudades;
    }

    public void setCiudades(int ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public String toString() {
        return "Provincia{" + "nombre=" + nombre + ", poblacion=" + poblacion + ", ciudades=" + ciudades + '}';
    }

    
    
}
