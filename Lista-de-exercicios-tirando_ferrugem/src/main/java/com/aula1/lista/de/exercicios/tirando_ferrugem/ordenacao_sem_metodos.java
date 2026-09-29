/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.aula1.lista.de.exercicios.tirando_ferrugem;

import java.util.Scanner;

/**
 *
 * @author Panama
 */
public class ordenacao_sem_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
        int[] numeros = new int[20];
        int[] original = new int[20];
        int comparacoes = 0;
        int trocas = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o numero " + (i + 1) + ":");
            numeros[i] = ler.nextInt();
            original[i] = numeros[i];
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19 - i; j++) {
                comparacoes++;
                if (numeros[j] > numeros[j + 1]) {
                    trocas++;
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }       
        double mediana = (numeros[9] + numeros[10]) / 2.0;      
        System.out.println("\nVETOR ORIGINAL:");
        for (int i = 0; i < 20; i++) {
            System.out.print(original[i] + " ");
        }       
        System.out.println("\n\nVETOR ORDENADO:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }       
        System.out.println("\n\nQUANTIDADE DE TROCAS: " + trocas);
        System.out.println("QUANTIDADE DE COMPARACOES: " + comparacoes);
        System.out.println("MEDIANA: " + mediana);
    }
}
