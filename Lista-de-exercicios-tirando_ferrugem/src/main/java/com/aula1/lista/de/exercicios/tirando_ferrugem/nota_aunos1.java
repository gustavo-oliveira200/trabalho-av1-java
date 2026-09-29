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
public class nota_aunos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
       double[] NotasAlunos = new double [10];
       double media=0;
       double maior =0 , menor =10;
       int abaixo=0, acima=0;
       double soma=0;
       
       
       for(int i=0; i<10; i++){
           System.out.println("ENTRE COM A NOTA DO ALUNO " +i+ "");
           NotasAlunos[i] = ler.nextDouble();       
           soma += NotasAlunos[i];
           
       if(maior<NotasAlunos[i]){
           maior=NotasAlunos[i];
       }
         if(menor>NotasAlunos[i]){
           menor=NotasAlunos[i]; 
           }
       }
           media=soma/10;    
       for (int n=0; n<10; n++){
           if(NotasAlunos[n]>=7){
               acima++;
           }
            if(NotasAlunos[n]<=media){
                abaixo++;
            }
    }
       
        System.out.println("MEDIA DA TURMA: " +media);
        System.out.println("MAIOR NOTA: " +maior);
        System.out.println("MENOR NOTA: " +menor);
        System.out.println("A quantidade de alunos com nota maior ou igual a 7: "+acima);
        System.out.println("quantidade de alunos abaixo da média da turma: "+abaixo);
}
}    
