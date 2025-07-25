/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultaveterinaria;

/**
 *
 * @author BICHO
 */
// creación de clase abstracta
public abstract class Mascota {
    //creación de método abstracto
    public abstract void hacerSonido();
    
    public void descansar(){
        System.out.println("La mascota esta descansando");
    }
}
