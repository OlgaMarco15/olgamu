package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a=0;
        double b=0;
        double resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextDouble();
        resultado = multiplica(a, b);
        System.out.println("El resultado de la multiplicación es: " + resultado);

    }

    private static double multiplica ( double a, double b) {

        return a*b;
    }


}
