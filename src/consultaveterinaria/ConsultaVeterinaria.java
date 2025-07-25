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
        //Implementación de lista y creación de diferentes objetos
        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Perro());
        mascotas.add(new Gato());
        mascotas.add(new Conejo());
        mascotas.add(new Tortuga());
        //recorrido de lista e invocación de métodos
        for (Mascota a : mascotas) {
            a.hacerSonido();
            a.descansar();
            // verificación si los objetos implementan función especial
            if (a instanceof AtencionEspecial atencionEspecial) {
                atencionEspecial.recibirAtencionEspecial();
            }
            if (a instanceof Vacunable vacunable){
                vacunable.vacunar();
            
            }
        }
    }
    
}
