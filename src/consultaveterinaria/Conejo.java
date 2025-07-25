/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultaveterinaria;

/**
 *
 * @author BICHO
 */
//implementación de herencia de clase Mascota e interfaz Atención especial
public class Conejo extends Mascota implements AtencionEspecial {
    //Sobreescritura de método hacer sonido
    @Override
    public void hacerSonido(){
        System.out.println("El Conejo Ronronea");
    }
    //Sobreescritura de método recibir atención especial
    @Override
    public void recibirAtencionEspecial(){
        System.out.println("El Conejo Necesita limpieza dental");
    }
    
}
