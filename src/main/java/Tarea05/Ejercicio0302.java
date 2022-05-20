/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Tarea05;

import java.awt.Color;

/**
 *
 * @author HP OME
 */
public class Ejercicio0302 {
    
    public static void main(String[] args) {

    var v = new Ventana_Inscripcion("INSCRIBETE");
        v.setVisible(true);
    var v1 = new Datos_Personales("DATOS PERSONALES");
        v1.setVisible(true); 
    var v2 = new Seleccione("");
        v2.setVisible(true);     
    var v3 = new Ventana3("INFORMACION DE CARRERA");
        v3.setVisible(true);
    var v4 = new Ventana4("CREAR GRUPO");
        v4.setVisible(true);
    }
    
}
