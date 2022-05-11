/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Barco {
    
    private int codigo;
    private String nombre;
    private String pais;
    private String placa;
    private Capitan capitan;

    public Barco(int codigo, String nombre, String pais, String placa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
        this.placa = placa;
    }

    public Barco(int codigo, String nombre, String pais, String placa, Capitan capitan) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
        this.placa = placa;
        this.capitan = capitan;
    }

    public boolean esLatinoAmericano(){
        var retorno = false;
        if(this.pais.equals("Ecuador"));
            this.pais.equals("Peru");
            this.pais.equals("Argentina");
            this.pais.equals("Brasil");
                retorno = true;
                
                return retorno;
        
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    @Override
    public String toString() {
        return "Barco{" + "codigo=" + codigo + ", nombre=" + nombre + ", pais=" 
                + pais + ", placa=" + placa + ", capitan=" + capitan + '}';
    }
  
}
