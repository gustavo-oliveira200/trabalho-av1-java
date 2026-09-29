/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.aula1.olimpiadas_revisao;

import java.util.Scanner;

/**
 *
 * @author Panama
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);

        System.out.print("DIGITE O VALOR DA SOMA: ");
        int s = ler.nextInt();

        System.out.print("DIGITE O INICIO DO INTERVALO: ");
        int a = ler.nextInt();

        System.out.print("DIGITE O FINAL DO INTERVALO: ");
        int b = ler.nextInt();

        int contador = 0;

        for (int i = a; i <= b; i++) {
            int numero = i;
            int soma = 0;

            while (numero > 0) {
                soma = soma + (numero % 10);
                numero = numero / 10;
            }

            if (soma == s) {
                contador++;
            }
        }

        System.out.println("QUANTIDADE DE NUMEROS: " + contador);
    }
}