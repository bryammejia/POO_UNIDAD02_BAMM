/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

/**
 *
 * @author USER
 */
public class Revista {

    private String nombre;
    private String editor;
    private String isbn;

    public Revista(String nombre, String editor, String isbn) {
        this.nombre = nombre;
        this.editor = editor;
        this.isbn = isbn;
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

    @Override
    public String toString() {
        return "Revista{" + "nombre=" + nombre + ", editor=" + editor
                + ", isbn=" + isbn + '}';
    }

}
