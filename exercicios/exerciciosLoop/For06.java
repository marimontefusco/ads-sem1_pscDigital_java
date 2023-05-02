package exercicios.exerciciosLoop;

import java.util.Scanner;

/* Programa que lê 10 números e imprime quantos deles são pares 
e quantos são ímpares */

public class For06 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);  
        
        int num, par = 0, impar = 0;
        
        for(int i = 0; i < 10 ; i++) {
            
            System.out.println("\nDigite o número inteiro:  ");
            num = scan.nextInt();
            
            int condition = (num % 2 == 0 ) ? par++ : impar++;
           
        }
        
        System.out.println("\n----------------------------------------\n");
        System.out.printf("Dos 10 números digitados, \n%d são números pares "
            + "e %d são números ímpares \n", par, impar);
        System.out.println("\n----------------------------------------\n");
    
        scan.close();
        
    }
 
}
