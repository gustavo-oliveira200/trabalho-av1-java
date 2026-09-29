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
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);
        
        System.out.println("DIGITE A IDADE 1");
        int idade1 = ler.nextInt();
        System.out.println("DIGITE A IDADE 2");
        int idade2 = ler.nextInt();
        System.out.println("DIGITE A IDADE 3");
        int idade3 = ler.nextInt();

        int camila;

        if ((idade1 >= idade2 && idade1 <= idade3) ||
            (idade1 >= idade3 && idade1 <= idade2)) {

            camila = idade1;

        } else if ((idade2 >= idade1 && idade2 <= idade3) ||
                   (idade2 >= idade3 && idade2 <= idade1)) {

            camila = idade2;

        } else {

            camila = idade3;
        }

        System.out.println("IDADE DA CAMILA " +camila);
    }
}
