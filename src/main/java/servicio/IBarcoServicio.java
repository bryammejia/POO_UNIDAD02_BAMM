/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Barco;

/**
 *
 * @author USER
 */
public interface IBarcoServicio {

    public Barco crear(Barco b);

    public Barco modificar(int c, Barco b);

    public Barco eliminar(int c);

    public List<Barco> listar();

    public Barco buscarPosicion(int c);
}
