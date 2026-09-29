/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.aula1.lista.de.exercicios.tirando_ferrugem;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Panama
 */
public class batalha_naval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int[][] tabuleiro = new int[8][8];
        char[][] jogo = new char[8][8];

        int navios = 5;
        int tiros = 15;
        int acertos = 0;

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                jogo[i][j] = '-';
            }
        }
        for (int i = 0; i < navios; i++) {

            int linha;
            int coluna;

            do {

                linha = random.nextInt(8);
                coluna = random.nextInt(8);

            } while (tabuleiro[linha][coluna] == 1);

            tabuleiro[linha][coluna] = 1;
        }

        System.out.println("==============================");
        System.out.println("         BATALHA NAVAL");
        System.out.println("==============================");
        System.out.println("EXISTEM 5 NAVIOS ESCONDIDOS.");
        System.out.println("VOCE POSSUI 15 TIROS.");

        for (int tentativa = 1; tentativa <= tiros; tentativa++) {

            System.out.println();
            System.out.println("    1 2 3 4 5 6 7 8");

            for (int i = 0; i < 8; i++) {

                System.out.print((i + 1) + " | ");

                for (int j = 0; j < 8; j++) {

                    System.out.print(jogo[i][j] + " ");
                }

                System.out.println();
            }

            System.out.println();
            System.out.println("TIRO " + tentativa + " DE " + tiros);

            System.out.print("DIGITE A LINHA DE 1 A 8: ");
            int linha = ler.nextInt() - 1;

            System.out.print("DIGITE A COLUNA DE 1 A 8: ");
            int coluna = ler.nextInt() - 1;

            if (linha < 0 || linha >= 8 || coluna < 0 || coluna >= 8) {

                System.out.println("POSICAO INVALIDA!");

                tentativa--;

                continue;
            }

            if (jogo[linha][coluna] == 'X'
                    || jogo[linha][coluna] == 'O') {

                System.out.println("VOCE JA ATIROU NESSA POSICAO!");

                tentativa--;

                continue;
            }

            if (tabuleiro[linha][coluna] == 1) {

                System.out.println("ACERTOU UM NAVIO!");

                jogo[linha][coluna] = 'X';

                acertos++;

            } else {

                System.out.println("TIRO NA AGUA!");

                jogo[linha][coluna] = 'O';
            }

            if (acertos == navios) {

                System.out.println();
                System.out.println("==============================");
                System.out.println("VOCE DESTRUIU TODOS OS NAVIOS!");
                System.out.println("VOCE VENCEU!");
                System.out.println("==============================");

                break;
            }
        }

        if (acertos < navios) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("FIM DE JOGO!");
            System.out.println("VOCE ACERTOU " + acertos + " DE 5 NAVIOS.");
            System.out.println("==============================");
        }

        System.out.println();
        System.out.println("TABULEIRO FINAL:");

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                if (tabuleiro[i][j] == 1
                        && jogo[i][j] != 'X') {

                    jogo[i][j] = 'N';
                }
            }
        }

        System.out.println();
        System.out.println("    1 2 3 4 5 6 7 8");

        for (int i = 0; i < 8; i++) {

            System.out.print((i + 1) + " | ");

            for (int j = 0; j < 8; j++) {

                System.out.print(jogo[i][j] + " ");
            }

            System.out.println();
        }

        ler.close();
    }
}
