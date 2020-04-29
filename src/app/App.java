package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Trabajo Calculadora");
        Scanner leer = new Scanner(System.in);
        int opcion;
        int n1;
        int n2;
        int rta;

        System.out.println("Elija la operacion que desea calcular");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        opcion = leer.nextInt();

        System.out.println("Escriba el primer numero");
        n1 = leer.nextInt();
        System.out.println("Escriba el segundo Numero");
        n2 = leer.nextInt();

        switch (opcion) {
            case 1:
                rta=n1+n2;
                System.out.println("El resultado es " + rta);
                break;
        
            case 2:
            rta=n1-n2;
            System.out.println("El resultado es " + rta);
                break;

            case 3:
                rta=n1*n2;
                System.out.println("El resultado es " + rta);
                break;

            case 4:
                rta=n1/n2;
                System.out.println("El resultado es " + rta);
                break;
        }
    }
}