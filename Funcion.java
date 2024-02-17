/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionalgebraica;

/**
 *
 * @author SHADIA
 */
public class Funcion {

    public static int calcularValorF(int x, int y) {
        return x*x + 2*x*y + y*y;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int resultado = calcularValorF(3, 4);
        System.out.println("El valor de la funcion f(3, 4) es: " + resultado);
    }
}