/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Estudiante implements IDatos, IDatosConstructores{
    
    private int codigo;
    private String nombre;

    public Estudiante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }

    @Override
    public String obtenerInformacion() {
       var retorno = "Computacion";
               return retorno;  
    }

    @Override
    public String autor() {
       var retorno = "Andres Mejia";
        return retorno;
    }

    @Override
    public int obtenerNumero() {
        return 1;
        
    }

    @Override
    public boolean obtenerCostructorDefecto() {
        return false;
        
    }
    
    
}
