package paquete;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        // Se crea la variable scanner
        Scanner scannerCalculadora = new Scanner(System.in);
        System.out.println("Digite su primer valor" );
        int cal1 = scannerCalculadora.nextInt();
        System.out.println("Digite su segundo valor" );
        int cal2 = scannerCalculadora.nextInt();


       // Crear un objeto tipo Calculadora
        Calculadora miCalculadora = new Calculadora(cal1, cal2); // 10 se pasa la operador 1 y 2 al operador 2

        int suma = miCalculadora.sumar();
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es " + miCalculadora.restar());
        System.out.println("La multiplicación es " + miCalculadora.multiplicar());
        System.out.println("La división es " + miCalculadora.dividir());
    }
}
