/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

/**
 *
 * @author USER
 */
public class PrincipalRevista {

    public static void main(String[] args) {

        Revista1 r = new Revista1("Vistazo", "AblaYala", "123456789abc");
        r.crear("El agua es vida", 3000, "Si es vida.......", 0);
        r.crear("El agua es vida", 2000, "Si es vida.......", 1);
        r.crear("El agua es vida", 5000, "Si es vida.......", 2);
        r.crear("El agua es vida", 6000, "Si es vida.......", 3);

        System.out.println(r);
    }
}
