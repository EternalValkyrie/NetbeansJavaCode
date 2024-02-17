/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

//@author SHADIA

import java.util.Scanner;

public class TerrenoInmobiliario {
    
    // Función para calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
    
    // Función para calcular la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }
    
    // Función para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    
    // Función para calcular el perímetro del terreno
    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);
        return ladoA + ladoB + ladoC + hipotenusa;
    }
    
    public static void main(String[] args) {
        // Leer las dimensiones de los 3 lados del terreno
        try (Scanner scanner = new Scanner(System.in)) {
            // Leer las dimensiones de los 3 lados del terreno
            System.out.print("Ingrese la longitud del lado A: ");
            double ladoA = scanner.nextDouble();
            
            System.out.print("Ingrese la longitud del lado B: ");
            double ladoB = scanner.nextDouble();
            
            System.out.print("Ingrese la longitud del lado C: ");
            double ladoC = scanner.nextDouble();
            
            // Calcular el área y el perímetro del terreno
            double perimetro = calcularPerimetroTerreno(ladoA, ladoB, ladoC);
            double semiperimetro = perimetro / 2;
            double area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
            
            // Imprimir resultados
            System.out.println("El área del terreno es: " + area);
            System.out.println("El perímetro del terreno es: " + perimetro);
        }
    }
}
