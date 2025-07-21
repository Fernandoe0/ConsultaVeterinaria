/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultaveterinaria;

/**
 *
 * @author BICHO
 */
public class Conejo extends Mascota implements AtencionEspecial {
    
    @Override
    public void hacerSonido(){
        System.out.println("El Conejo Ronronea");
    }
    
    @Override
    public void recibirAtencionEspecial(){
        System.out.println("El Conejo Necesita limpieza dental");
    }
    
}
