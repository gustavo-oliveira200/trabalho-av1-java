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
public class diagonal_matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     
       int matriz[][] = new int [4][4];
       int somap=0;
       int somas=0;
       for(int i=0; i<4; i++){
           for(int j=0; j<4; j++){
           System.out.println("INFORME O VALOR DA LINHA " +i+ " COLUNA " +j);
           matriz[i][j]= ler.nextInt();
       }
       }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==j){
                    System.out.println("VALOR DA DIAGONAL PRINCIPAL: "+matriz[i][j]);
                    somap+=matriz[i][j];
                }
                
            }
            
        }
        
        System.out.println("\n");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i+j==3){ 
                    System.out.println("VALOR DA DIAGONAL SECUNDARIA: "+matriz[i][j]);
                    somas+=matriz[i][j];
                } 
            }
        }
        System.out.println("SOMA DA DIAGONAL PRINCIPAL "+somap);
        System.out.println("SOMA DA DIAGONAL PRINCIPAL "+somas);
        if(somap>somas){
            System.out.println("Diagonal maior: "+somap);
        }
       else if(somas>somap){
            System.out.println("Diagonal maior: "+somas);
    }
       else {
            System.out.println("As duas tem o mesmo valor");
       }
    
}
}
