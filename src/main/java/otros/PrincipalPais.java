/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

import modelo.Pais;

/**
 *
 * @author USER
 */
public class PrincipalPais {

    public static void main(String[] args) {
        Pais p = new Pais("ECUADOR", 1203321);
        p.crear("Azuay", 100000, 23);
        p.crear("Guayas", 100000, 25);
        p.crear("Pichincha", 100000, 2);
        p.crear("Cañar", 100000, 5);
        p.crear("Santo Domingo", 100000, 33);

        System.out.println(p);

    }
}
