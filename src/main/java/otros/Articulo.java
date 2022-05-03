/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

/**
 *
 * @author USER
 */
public class Articulo {

    private String nombre;
    private int numeroPalabras;
    private String resumen;
    private Revista unaRevista;

    public Articulo(String nombre) {
        this.nombre = nombre;
    }

    public Articulo(String nombre, int numeroPalabras, String resumen, Revista unaRevista) {
        this.nombre = nombre;
        this.numeroPalabras = numeroPalabras;
        this.resumen = resumen;
        this.unaRevista = unaRevista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPalabras() {
        return numeroPalabras;
    }

    public void setNumeroPalabras(int numeroPalabras) {
        this.numeroPalabras = numeroPalabras;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Revista getUnaRevista() {
        return unaRevista;
    }

    public void setUnaRevista(Revista unaRevista) {
        this.unaRevista = unaRevista;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", numeroPalabras="
                + numeroPalabras + ", resumen=" + resumen + ", unaRevista=" + unaRevista + '}';
    }

}
