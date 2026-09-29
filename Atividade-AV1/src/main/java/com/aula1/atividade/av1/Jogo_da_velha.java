/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.aula1.atividade.av1;

import java.util.Scanner;

/**
 *
 * @author Panama
 */
public class Jogo_da_velha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);

        int[] jogo = {
            0, 0, 0,
            0, 0, 0,
            0, 0, 0
        };

        int jogadas = 0;

        mostrarTabuleiro(jogo);

        while (jogadas < 9) {

            int posicao;

            System.out.println("DIGITE A POSICAO DO TABULEIRO");
            posicao = ler.nextInt();

            if (posicao < 0 || posicao >= 9) {
                System.out.println("POSICAO INVALIDA");
            }

            else if (jogo[posicao] == 0) {

                jogo[posicao] = 1;
                jogadas++;

                if (
                    (jogo[0] == 1 && jogo[1] == 1 && jogo[2] == 1) ||
                    (jogo[3] == 1 && jogo[4] == 1 && jogo[5] == 1) ||
                    (jogo[6] == 1 && jogo[7] == 1 && jogo[8] == 1) ||
                    (jogo[0] == 1 && jogo[3] == 1 && jogo[6] == 1) ||
                    (jogo[1] == 1 && jogo[4] == 1 && jogo[7] == 1) ||
                    (jogo[2] == 1 && jogo[5] == 1 && jogo[8] == 1) ||
                    (jogo[0] == 1 && jogo[4] == 1 && jogo[8] == 1) ||
                    (jogo[2] == 1 && jogo[4] == 1 && jogo[6] == 1)
                ) {
                    mostrarTabuleiro(jogo);
                    System.out.println("JOGADOR VENCEU!");
                    break;
                }

                int maquina = (int) (Math.random() * 9);

                System.out.println("A MAQUINA VAI ESCOLHER A POSICAO");

                while (jogo[maquina] != 0) {
                    maquina = (int) (Math.random() * 9);
                }

                jogo[maquina] = 2;
                jogadas++;

                if (
                    (jogo[0] == 2 && jogo[1] == 2 && jogo[2] == 2) ||
                    (jogo[3] == 2 && jogo[4] == 2 && jogo[5] == 2) ||
                    (jogo[6] == 2 && jogo[7] == 2 && jogo[8] == 2) ||
                    (jogo[0] == 2 && jogo[3] == 2 && jogo[6] == 2) ||
                    (jogo[1] == 2 && jogo[4] == 2 && jogo[7] == 2) ||
                    (jogo[2] == 2 && jogo[5] == 2 && jogo[8] == 2) ||
                    (jogo[0] == 2 && jogo[4] == 2 && jogo[8] == 2) ||
                    (jogo[2] == 2 && jogo[4] == 2 && jogo[6] == 2)
                ) {
                    mostrarTabuleiro(jogo);
                    System.out.println("MAQUINA VENCEU!");
                    break;
                }

            } else {
                System.out.println("CASA JA DIGITADA");
            }

            if (jogadas == 9) {
                mostrarTabuleiro(jogo);
                System.out.println("EMPATE");
                break;
            }

            mostrarTabuleiro(jogo);
        }
    }

    public static void mostrarTabuleiro(int[] jogo) {

        System.out.println(
            (jogo[0] == 1 ? "X" : jogo[0] == 2 ? "O" : " ") + " | " +
            (jogo[1] == 1 ? "X" : jogo[1] == 2 ? "O" : " ") + " | " +
            (jogo[2] == 1 ? "X" : jogo[2] == 2 ? "O" : " ")
        );

        System.out.println("___________");

        System.out.println(
            (jogo[3] == 1 ? "X" : jogo[3] == 2 ? "O" : " ") + " | " +
            (jogo[4] == 1 ? "X" : jogo[4] == 2 ? "O" : " ") + " | " +
            (jogo[5] == 1 ? "X" : jogo[5] == 2 ? "O" : " ")
        );

        System.out.println("___________");

        System.out.println(
            (jogo[6] == 1 ? "X" : jogo[6] == 2 ? "O" : " ") + " | " +
            (jogo[7] == 1 ? "X" : jogo[7] == 2 ? "O" : " ") + " | " +
            (jogo[8] == 1 ? "X" : jogo[8] == 2 ? "O" : " ")
        );
    }
}