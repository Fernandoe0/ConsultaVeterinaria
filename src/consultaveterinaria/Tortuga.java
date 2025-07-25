/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultaveterinaria;

/**
 *
 * @author BICHO
 */
public class Tortuga extends Mascota implements Vacunable{
    
   @Override
   public void hacerSonido(){
       System.out.println("La tortuga Gruñe y Gorjea");
       
   } 
   
   
   @Override
     public void vacunar(){
       System.out.println("La tortuga necesita una vacuna");
   
   }
}
