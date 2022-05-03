/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

import java.awt.PageAttributes;

/**
 *
 * @author USER
 */
public class Revista1 {

    private String nombre;
    private String editor;
    private String isbn;
    private Articulo1[] articuloList1;

    public Revista1(String nombre) {
        this.nombre = nombre;
        this.articuloList1 = new Articulo1[10];
    }

    public Revista1(String nombre, String editor, String isbn) {
        this.nombre = nombre;
        this.editor = editor;
        this.isbn = isbn;
        this.articuloList1 = new Articulo1[10];
    }

  
    public Articulo1 crear(String nombre, int numeroPalabras, String resumen, int p) {
        var articulo = new Articulo1(nombre, numeroPalabras, resumen);
        this.articuloList1[p]=articulo;
        return articulo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Articulo1[] getArticuloList1() {
        return articuloList1;
    }

    public void setArticuloList1(Articulo1[] articuloList1) {
        this.articuloList1 = articuloList1;
    }

    @Override
    public String toString() {
        var retorno = "Revista1{" + "nombre=" + nombre + ", editor=" + editor + 
                ", isbn=" + isbn +'}';
        retorno = retorno+"\n"+this.articuloList1[0].toString();
        return retorno;
    }

}
