
package com.lp2.avaliacao_diagnostica;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author cg3017311
 */

public class Main {
            Scanner scnr = new Scanner(System.in);
System.out.println("Insira a quantidade de elementos a ser adicionada (número inteiro): ");
        int N = scnr.nextInt();
    static void Exercicio_1() {
        /*
        Crie um programa em que solicita ao usuário o valor de N e, posteriormente os N 
        números que devem ser armazenados em um vetor. Em um segundo momento, 
        exiba o vetor na ordem em que os elementos foram digitados e em ordem inversa.
        */
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("Insira a quantidade de elementos a ser adicionada (número inteiro): ");
        
        int N = scnr.nextInt();
        int vetor[] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Insira o valor para um novo elemento (número inteiro): ");
            vetor[i] = scnr.nextInt();
            
        }
        
        System.out.println("o vetor é: " + Arrays.toString(vetor));   
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
            System.out.println("Você digitou5: " + vetor[i]);

        }
        
        System.out.println("Seu vetor é: " + vetor);
    
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
        boolean found = false;

        for (int i: vet){
            int R = rand.nextInt((max - min + 1) + min);
            if (i == R){
                R = rand.nextInt((max - min + 1) + min);
            } 
            else {
                vet[i] = R;
            } 
               
           }
        
        System.out.println("vetor aleatório único: " + vetor);
       }
        
    
    

    
    public static void main(String[] args) {
       
        /*System.out.println("Exercício 1: \r\n");
        Exercicio_1();
        System.out.println("Exercício 2: \r\n");
        Exercicio_2();
        
        */
        System.out.println("Exercício 3: \r\n");
        
        int vetor[] = new int[N];

        Insere_Exclusivo(vetor, N);
        
    }
}
