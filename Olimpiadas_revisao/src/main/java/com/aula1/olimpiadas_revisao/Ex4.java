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
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

        System.out.print("DIGITE O VALOR DE N: ");
        int n = ler.nextInt();

        int pecas = ((n + 1) * (n + 2)) / 2;

        System.out.println("QUANTIDADE DE PECAS: " + pecas);
    }
}