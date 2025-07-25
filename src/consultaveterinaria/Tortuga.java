/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultaveterinaria;

/**
 *
 * @author BICHO
 */
//implementación de herencia de clase Mascota e interfaz Vacunable
public class Tortuga extends Mascota implements Vacunable{
    //Sobreescritura de método hacer sonido
   @Override
   public void hacerSonido(){
       System.out.println("La tortuga Gruñe y Gorjea");
       
   } 
   
   //Sobreescritura de método vacunar
   @Override
     public void vacunar(){
       System.out.println("La tortuga necesita una vacuna");
   
   }
}
