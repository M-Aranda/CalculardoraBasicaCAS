/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabasicacas;

import java.util.Scanner;

/**
 *
 * @author Chelo
 */
public class CalculadoraBasicaCAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        mostrarMenu();

    }

    public static int suma(int x, int y) {
        return x + y;
    }

    ;
    
    public static int mult(int x, int y) {
        return x * y;
    }

    ;

 
    public static int restar(int n1, int n2) {
        return n1 - n2;
    }

    public static int dividir(int n1, int n2) {
        float resultado = n1 / n2;
        int resultadoAInt = Math.round(resultado);
        return resultadoAInt;
    }

    public static void mostrarMenu() {

        try {

            System.out.println("Eliga operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            Scanner s = new Scanner(System.in);

            /*
             while (!s.hasNextInt()) {
             System.out.println("Debe ingresar un número del 1 al 4");
             s.next();
             }
             */
            int opcionElegida = s.nextInt();

            /*if (opcionElegida > 4 || opcionElegida < 1) {
             System.out.println("");
             System.out.println("Opción inválida");
             System.out.println("");
             mostrarMenu();
             }*/
            if (opcionElegida == 1) {
                //Sumar
                System.out.print("Digite primer número:");
                int n1 = s.nextInt();
                System.out.print("Digite segundo número:");
                int n2 = s.nextInt();
                int resultado = suma(n1, n2);
                System.out.println("");
                System.out.println("El resultado es:" + resultado);
                System.out.println("");
                mostrarMenu();

            } else if (opcionElegida == 2) {
                //Restar
                System.out.print("Digite primer número:");
                int n1 = s.nextInt();
                System.out.print("Digite segundo número:");
                int n2 = s.nextInt();
                int resultado = restar(n1, n2);
                System.out.println("");
                System.out.println("El resultado es:" + resultado);
                System.out.println("");
                mostrarMenu();

            } else if (opcionElegida == 3) {
                //Multiplicar
                System.out.print("Digite primer número:");
                int n1 = s.nextInt();
                System.out.print("Digite segundo número:");
                int n2 = s.nextInt();
                int resultado = mult(n1, n2);
                System.out.println("");
                System.out.println("El resultado es:" + resultado);
                System.out.println("");
                mostrarMenu();

            } else if (opcionElegida == 4) {
                //Dividir
                System.out.print("Digite primer número:");
                int n1 = s.nextInt();
                System.out.print("Digite segundo número:");
                int n2 = s.nextInt();
                int resultado = dividir(n1, n2);
                System.out.println("");
                System.out.println("El resultado es:" + resultado);
                System.out.println("");
                mostrarMenu();
            }

        } catch (Exception e) {
            System.out.println("Debe ingresar un número");
            mostrarMenu();
        }

    }

}
