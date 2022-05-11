/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Barco;
import modelo.Capitan;
import servicio.BarcoServicio;

/**
 *
 * @author USER
 */
public class BarcoControl {
    
    public BarcoServicio  barcoServicio = new BarcoServicio();
    
    public Barco crear(int c, String n, String p, String pl, int cC, String nC){
        var capitan = new Capitan(cC, nC);
        var barco = new Barco(c,n,p,pl);
        return barco;
    }
}
