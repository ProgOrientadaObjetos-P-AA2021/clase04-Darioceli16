/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
         */
        String nombre = "Isidro Ayora";
        String ciudad = "Loja";
        int numeroDoctores = 100;
        int numeroEnfermeros = 200;
        Hospital h2 = new Hospital(nombre, ciudad, numeroDoctores, numeroEnfermeros);
        System.out.print("Los datos son\n");
        System.out.printf("Nombre:%s\n" + "Cuidad%s\n"
                + "Numero de doctores%d\n" + "Numero de enfermos%d\n",
                h2.obtenerNombre(), h2.obtenerCiudad(),
                h2.obtenerNumeroDoctores(), h2.obtenerNumeroEnfermeros());

    }
}
