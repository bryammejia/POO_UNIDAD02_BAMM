/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otros;

/**
 *
 * @author USER
 */
public class PrincipalComposicion {
    public static void main(String[] args) {
        Revista r = new Revista("La semana del estudiante","AblaYala", "1234567890");
        Articulo a = new Articulo("La inseguridad en el pais", 3000, ".......",r);
        System.out.println(a);
                
        
    }
    
}
