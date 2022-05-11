/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Barco;

/**
 *
 * @author USER
 */
public class BarcoServicio implements IBarcoServicio{
    
    public final List<Barco> barcoList = new ArrayList<>();

    @Override
    public Barco crear(Barco b) {
    this.barcoList.add(b);
    return b;
    }

    
    

    @Override
    public List<Barco> listar() {
        return this.barcoList;
   }

    @Override
    public Barco buscarPosicion(int c) {
        var posicion = -1;
        var i = 0;
        for(var auxBarco: this.barcoList){
            if(auxBarco.getCodigo()==0){
                posicion=i;
            break;
        }
        i++;
        }
        return null;
        
    }

    @Override
    public Barco eliminar(int c) {
    
        return null;
    
    }

    @Override
    public Barco modificar(int c, Barco b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
