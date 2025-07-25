/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultaveterinaria;

/**
 *
 * @author BICHO
 */
//implementación de herencia de clase Mascota
public class Gato extends Mascota {
    //Sobreescritura de método hacer sonido
    @Override
    public void hacerSonido(){
        System.out.println("El Gato Hace Miauuuu");
    }
}
