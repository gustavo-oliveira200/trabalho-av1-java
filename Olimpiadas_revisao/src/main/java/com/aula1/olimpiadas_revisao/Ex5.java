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
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int n1, d1, v1;
        int n2, d2, v2;
        double tempo1, tempo2;

        System.out.print("DIGITE O NUMERO DA PRIMEIRA CHARRETE: ");
        n1 = ler.nextInt();

        System.out.print("DIGITE A DISTANCIA DA PRIMEIRA CHARRETE: ");
        d1 = ler.nextInt();

        System.out.print("DIGITE A VELOCIDADE DA PRIMEIRA CHARRETE: ");
        v1 = ler.nextInt();

        System.out.print("DIGITE O NUMERO DA SEGUNDA CHARRETE: ");
        n2 = ler.nextInt();

        System.out.print("DIGITE A DISTANCIA DA SEGUNDA CHARRETE: ");
        d2 = ler.nextInt();

        System.out.print("DIGITE A VELOCIDADE DA SEGUNDA CHARRETE: ");
        v2 = ler.nextInt();

        tempo1 = (double) d1 / v1;
        tempo2 = (double) d2 / v2;

        if (tempo1 < tempo2) {
            System.out.println("CHARRETE VENCEDORA: " + n1);
        } else {
            System.out.println("CHARRETE VENCEDORA: " + n2);
        }
    }
}
