
package com.lp2.avaliacao_diagnostica;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author cg3017311
 */

public class Main {

    static int[] Exercicio_1() {
        /*
        Crie um programa em que solicita ao usuário o valor de N e, posteriormente os N 
        números que devem ser armazenados em um vetor. Em um segundo momento, 
        exiba o vetor na ordem em que os elementos foram digitados e em ordem inversa.
        */
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("Insira a quantidade de elementos a ser adicionada (número inteiro): ");
        
        int N = scnr.nextInt();
        int vetor[] = new int[N];
        int vetorReverso[] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Insira o valor para um novo elemento (número inteiro): ");
            vetor[i] = scnr.nextInt();
            
        }
                System.out.println("O vetor é: " + Arrays.toString(vetor));
                
 
        System.out.println("vetor reverso: "); 
        for (int k = vetor.length-1; k >= 0; k--) { 
           System.out.print(vetor[k] + " "); 
           }
        
        return vetor;
        }
    
    
    static void Exercicio_2() {
        /*
        Crie um programa em JAVA que solicita ao usuário o valor de N e, posteriormente,
        alimente o vetor com valores aleatórios entre 0 e M (M também é informado pelo 
        usuário). Exiba o vetor gerado.
        */
        
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(); 

        System.out.println("Insira a quantidade de elementos a ser adicionada (número inteiro): ");
        int N = scnr.nextInt();
        
        System.out.println("Insira o valor máximo dos elentos do vetor (número inteiro): ");
        int M = scnr.nextInt();
        
        int vetor[] = new int[N];

        for (int i = 0; i < N; i++) {
            vetor[i] = rand.nextInt(M); 
            System.out.println("Você digitou: " + N + " o vetor é: " + vetor[i]);

        }
        
        System.out.println("Seu vetor é: " + Arrays.toString(vetor));
    
}

    static void Insere_Exclusivo(int vet[], int N) {
    /*
       Exercício 3:
       Crie um método chamado Insere_Exclusivo(int vet[], int N) que alimenta 
       um vetor de N elementos com valores aleatórios entre 1 e N sem que 
       ocorram números repetidos. Exiba o vetor gerado. */
        
        Random rand = new Random(); 

        int min = 1;
        int max = N;
        int vetor[] = vet;
        for (int i = 0; i < max; i++){
            int R = (int)(Math.random() * (max - min) + min);
            while (isUnique(vet, N, i, R)) {
            R = (int)(Math.random() * max) + min;
                    }
            
               vetor[i] = R;
           }
        
        System.out.println("vetor aleatório único: " + Arrays.toString(vetor));
       }
        
        static boolean isUnique(int[] vet, int N, int i, int R) {
            for (int j=0;j<i;j++){
                if (vet[j] == R){
                return true;
            }
        }
        return false;
    }
        
        static void Exercicio_4(){
        /* Crie um programa em JAVA que faça a leitura de um arquivo de texto 
            contendo um número inteiro em cada linha onde: O número da primeira 
            linha é o valor de N e os números subsequentes são a sequência 
            numérica de interesse. Armazene os valores lidos em um vetor e 
            exiba-o. Aproveite sua implementação do Exercício 1. e escreva em 
            outro arquivo a sequência numérica em ordem inversa. 
        */
        int[] vet = Exercicio_1();
        
        System.out.println(Arrays.toString(vet));
        
        
        
        
            
        }

    
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);

       /*System.out.println("Exercício 1: \r\n");
        Exercicio_1();
        System.out.println("Exercício 2: \r\n");
        Exercicio_2();
        
        System.out.println("Exercício 3: \r\n");
*/        /*
        
        int N;
        System.out.println("Insira a quantidade de elementos a ser adicionada (número inteiro): ");
        N = scnr.nextInt();

        int vetor[] = new int[N];
        
        Insere_Exclusivo(vetor, N);

        */
       
       Exercicio_4());
    }
}
