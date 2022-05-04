/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

import modelo.Asignatura;
import modelo.Estudiante;

/**
 *
 * @author USER
 */
public class PrincipalComAgre {
    public static void main(String[] args) {
        
        Asignatura a = new Asignatura(1, "Ing. Software", "Mauricio");
        var e1 = new Estudiante(1, "Andres");
        var e2 = new Estudiante(2, "Bryam");
        var e3 = new Estudiante(3, "Jhon");
        a.crear(e1);
        a.crear(e2);
        a.crear(e3);
        
        System.out.println(a);
    }
}
