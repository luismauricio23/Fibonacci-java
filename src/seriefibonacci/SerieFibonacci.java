/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci;

import java.util.Scanner;

/**
 *
 * @author lmrse
 */
public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);// mecanismo para poder ingresar datos 

        int primerNumero = 0; //primer elemento de la serie Fibonacci
        int segundoNumero = 1;//Segundo elemento de la serie Fibonacci
        int Suma;// Variable donde se suma el valor de primerNumero+SegundoNumero
        int numeroUsuario;// numero que ingresa el usuario para dar el tamaño de la serie Fibonacci
        int count = 0;//acumulador donde van llagando los numeros que cumplen la condicion 

        System.out.print("Por favor ingrese cantidad de elmentos para la serie: ");// mensaje que visualiza el usuario
        numeroUsuario = teclado.nextInt();// elemento donde se almacena lo que dijita el usuario por teclado

        for (int i = 1; i <= numeroUsuario; i++) {//ciclo que se repite hasta el numero que dijita el usuario
            System.out.println(primerNumero);// mensaje donde se imprime la serie
            Suma = primerNumero+ segundoNumero;// se suma el valor de primerNumero+SegundoNumero
            primerNumero = segundoNumero;// me toma el valor de  primerNumero y lo iguala en el valor de segundoNumero
            segundoNumero = Suma;// segundoNumero toma el valor de Suma
            if (primerNumero% i == 0) {//condicion donde se verifica se i es divisor de primerNumero
                count++;//donde se acumilan los numeros divisores
            }
        }
        if (count == 2) {//donde se compara que los numeros divisores sea igual a 2

            System.out.println("el numero es primo");//donde se confirma que el numero es primo
        } else {// llega a este citio cuando el numero no es promo
            System.out.println("el numero no es primo");//donde se confirma que el numero no es promo
        }

    }

}
