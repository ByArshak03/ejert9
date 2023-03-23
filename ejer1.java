package Ejerciciost9;

import java.util.Scanner;
public class ejer1 {
    public static void  main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre: ");
    String nombre = sc.next();

        System.out.println("Introduce la edad: ");
    int edad = sc.nextInt();

        System.out.println("Introduce la estatura en metros : ");
    double estatura = sc.nextDouble();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + " metros");
}
}

