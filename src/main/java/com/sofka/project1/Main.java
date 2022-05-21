package com.sofka.project1;

import java.util.Scanner;

/**
 * Primer projecto Traiing desarrollo.
 * Programa que toma tres valores nombre, celular y edad e imprime en pantalla un mensaje
 *
 * @author Mateo Gutiérrez Medina
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nombre: ");
        String name = scan.nextLine();

        System.out.println("Celular: ");
        String cel = scan.nextLine();

        System.out.println("Edad: ");
        int age = scan.nextInt();

        System.out.println("Bienvenido señor " + name + ", es un placer para nosotros contar con una persona de " + age + " años.\n");
        System.out.println("Próximamente nos comunicaremos con usted al numero "+cel+".\n"+"\nFeliz día");

    }
}
