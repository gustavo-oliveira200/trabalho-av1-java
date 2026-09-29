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
public class verificacao_matriz_magica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean numerosCorretos = true;
        boolean[] usado = new boolean[10];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor [" + i + "][" + j + "]:");
                matriz[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = matriz[i][j];
                if (valor < 1 || valor > 9) {
                    numerosCorretos = false;
                } else if (usado[valor]) {
                    numerosCorretos = false;
                } else {
                    usado[valor] = true;
                }
            }
        }
        int somaReferencia = 0;
        for (int j = 0; j < 3; j++) {
            somaReferencia += matriz[0][j];
        }
        boolean linhasIguais = true;
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha != somaReferencia) {
                linhasIguais = false;
            }
        }
        boolean colunasIguais = true;
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna != somaReferencia) {
                colunasIguais = false;
            }
        }
        int diagonalPrincipal =
                matriz[0][0] +
                matriz[1][1] +
                matriz[2][2];
        int diagonalSecundaria =
                matriz[0][2] +
                matriz[1][1] +
                matriz[2][0];

        boolean diagonaisIguais =
                diagonalPrincipal == diagonalSecundaria;
        if (numerosCorretos &&
            linhasIguais &&
            colunasIguais &&
            diagonaisIguais) {

            System.out.println("\nA MATRIZ E MAGICA!");

        } else {

            System.out.println("\nA MATRIZ NAO E MAGICA.");

            if (!numerosCorretos) {
                System.out.println("- Os numeros de 1 a 9 nao foram usados corretamente.");
            }

            if (!linhasIguais) {
                System.out.println("- As linhas nao possuem a mesma soma.");
            }

            if (!colunasIguais) {
                System.out.println("- As colunas nao possuem a mesma soma.");
            }

            if (!diagonaisIguais) {
                System.out.println("- As diagonais nao possuem a mesma soma.");
            }
        }
    }
}
