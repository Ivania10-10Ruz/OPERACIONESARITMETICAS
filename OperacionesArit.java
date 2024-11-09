/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacionesarit;
import java.util.Scanner;


/**
 *
 * @author Graciela
 */
public class OperacionesArit {
 public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Validar entrada del primer número entero
        System.out.print("Introduce el primer numero (entero): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada no válida. Introduce un numero entero.");
            scanner.next();  // Descartar la entrada no válida
        }
        int num1 = scanner.nextInt();
        
        // Validar entrada del segundo número entero
        System.out.print("Introduce el segundo numero (entero): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada no válida. Introduce un numero entero.");
            scanner.next();  // Descartar la entrada no válida
        }
        int num2 = scanner.nextInt();

        // Realizar las operaciones aritméticas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        // Validación para la división y el módulo
        double division = (num2 != 0) ? (double) num1 / num2 : 0; // Convertir a double para obtener decimal
        int modulo = (num2 != 0) ? num1 % num2 : 0;

        // Imprimir los resultados en la consola
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        if (num2 != 0) {
            System.out.printf("Division: %.2f\n", division);  // Mostrar resultado con 2 decimales
            System.out.println("Modulo: " + modulo);
        } else {
            System.out.println("Division: No se puede dividir por 0");
            System.out.println("Modulo: No se puede obtener modulo por 0");
        }
    }
}
