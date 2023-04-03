package exercicios.exerciciosCondicional;

import java.util.Scanner;

/* Faça um programa que leia um número inteiro e retorna ao usuário uma 
mensagem informando se o número é par ou ímpar e positivo ou negativo 

Lógica condicional encadeada -> um if dentro de outro
 */
public class Condicional04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
                
        int num;
        
        System.out.println("Digite um número inteiro: ");
        num = scan.nextInt();
        
        if( num % 2 == 0){ //Pares
            if(num >= 0) {
                System.out.println("\nO número é par e positivo! \n\n");
                
            } else if(num < 0){
                System.out.println("\nO número é par e negativo! \n\n");
                
            }
          
        } else if ( num % 2 != 0){ //Ímpares
            if(num >= 0){
                System.out.println("\nO número é ímpar e positivo! \n\n");
                
            } else if(num < 0){
                System.out.println("\nO número é ímpar e negativo! \n\n");
            }
            
        } else {         
           System.out.println("\nNúmero inválido, tente novamente! \n\n");
           
        }
        
    }
    
}
