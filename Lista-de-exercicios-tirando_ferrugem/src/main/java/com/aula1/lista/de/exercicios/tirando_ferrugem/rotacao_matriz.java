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
public class rotacao_matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int[][] rotacionada = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite o valor [" + i + "][" + j + "]:");
                matriz[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                rotacionada[j][4 - i] = matriz[i][j];
            }
        }
        System.out.println("\n MATRIZ ORIGINAL:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n MATRIZ ROTACIONADA:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(rotacionada[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
