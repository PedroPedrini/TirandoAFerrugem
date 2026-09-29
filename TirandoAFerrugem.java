/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tirandoaferrugem;

import java.util.Scanner;

/**
 *
 * @author lalas
 */
public class TirandoAFerrugem {

    public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
        

     double media, MaiorN = 0,MenorN = 0,soma=0;
     int Aprovado=0, Reprovado=0;
     Double [] nota = new Double [10];
     
     for(int i=0;i<10;i++){
         System.out.println("Digite a nota do Aluno"+(i+1)+":");
     nota [i] = ler.nextDouble();
     soma = soma+ nota[i];  
     }
       media = soma/10;
       
       for(int i =0 ; i<10; i++){
           if(nota[i]>MaiorN){
               MaiorN = nota[i];
       }
           if(nota[i]<MenorN){
               MenorN = nota[i]; 
       }
           if(nota[i]>6){
               Aprovado++;
       }}
        for(int i=0;i<10;i++){
         if(Reprovado<media){
             Reprovado++;
         }}
        
        System.out.println("Resultado :");
        System.out.println(" media da turma"+media);
        System.out.println("menor nota :"+MenorN);
        System.out.println("maior nota :"+MaiorN);
        System.out.println("Alunos com notas maiores que 6 :"+Aprovado);
        System.out.println("Alunos com nota menor que a media :"+Reprovado);
        
       
                            
     
    }
}
