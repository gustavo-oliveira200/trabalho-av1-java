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
public class remocao_valores_invertidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
       int[]n = new int[15];
       int[]p = new int[15];
        int distintos=0;
        for(int i=0; i<15; i++){
            System.out.println("DIGITE OS VALORES INTEIROS: "+i+ "");
            n[i]=ler.nextInt();
                boolean existe = false;
            
        for (int x=0; x<distintos; x++){
           if (n[i] == p[x]){
               existe=true;
           }
        }
        if(existe == false){
            p[distintos]=n[i];
            distintos++;
        }
    }
        for (int i = 0; i < distintos; i++) {
            System.out.println("NUMEROS DISTINTOS "+p[i]);
            
        }
      System.out.println("QUANTIDADE DE VALORES DIFERENTES: " + distintos);
}
}