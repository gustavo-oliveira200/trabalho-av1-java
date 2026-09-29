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
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner ler = new Scanner(System.in);

        String[] jogos = new String[6];
        int vitorias = 0;

        for (int i = 0; i < jogos.length; i++) {

            System.out.print("DIGITE 'V' PARA VITORIA E 'P' PARA DERROTA " + (i + 1) + ": ");
            jogos[i] = ler.next();

            if (jogos[i].equalsIgnoreCase("V")) {
                vitorias++;
            }
        }

        System.out.println("\nTOTAL DE VITORIA: " + vitorias);

        if (vitorias == 5 || vitorias == 6) {

            System.out.println("GRUPO 1");

        } else if (vitorias == 3 || vitorias == 4) {

            System.out.println("GRUPO 2");

        } else if (vitorias == 1 || vitorias == 2) {

            System.out.println("GRUPO 1");

        } else {

            System.out.println("-1");
        }
    }
}
