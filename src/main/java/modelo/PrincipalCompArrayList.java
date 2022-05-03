/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class PrincipalCompArrayList {

    public static void main(String[] args) {
        Laboratorio lab = new Laboratorio(9, 47);
        lab.crear(1, "DELL", "i5", 1000);
        lab.crear(1, "DELL", "i5", 2000);
        lab.crear(1, "DELL", "i5", 3000);
        lab.crear(1, "DELL", "i5", 4000);
        lab.crear(1, "DELL", "i5", 5000);

        System.out.println(lab);
    }
}
