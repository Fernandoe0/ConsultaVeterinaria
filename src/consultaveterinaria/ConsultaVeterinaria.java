/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consultaveterinaria;

import java.util.ArrayList;

/**
 *
 * @author BICHO
 */
public class ConsultaVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Perro());
        mascotas.add(new Gato());
        mascotas.add(new Conejo());
        
        for (Mascota a : mascotas) {
            a.hacerSonido();
            a.descansar();
            if (a instanceof AtencionEspecial atencionEspecial) {
                atencionEspecial.recibirAtencionEspecial();
            }
        }
    }
    
}
