
package paquete2;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
         */
        String nombre;
        String ciudad;
        int numeroDoctores;
        int numeroEnfermeros;

        System.out.print("Ingrese el nombre del hospital: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el nombre de la cuidad: ");
        ciudad = sc.nextLine();
        System.out.print("Ingrese el numero de doctores: ");
        numeroDoctores = sc.nextInt();
         System.out.print("Ingrese el numero de enfermeros: ");
        numeroEnfermeros = sc.nextInt();

        Hospital h2 = new Hospital(nombre, ciudad, numeroDoctores, numeroEnfermeros);
        h2.establecerNombre(nombre);
        h2.establecerCiudad(ciudad);
        h2.establecerNumeroDoctores(numeroDoctores);
        h2.establecerNumeroEnfermeros(numeroEnfermeros);
        
        System.out.printf("%s\n", h2);

       }
}
