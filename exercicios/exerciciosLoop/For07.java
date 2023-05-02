package exercicios.exerciciosLoop;

import java.util.Scanner;

/* Faça um programa, utilizando For, que permita o usuário fazer 3 contas de 
subtraçao. O usuário deve conseguir reconhecer que são 3 contas diferentes
*/

public class For07 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double num1, num2, subtracao;
         
        System.out.println("Você pode fazer 3 contas de subtração");
        
        for (int i = 1; i <= 3; i++) {
            
            System.out.println("\n--------------------------------------");      
            System.out.printf("\nSubtração %d: \n", i);
            
            System.out.println("\nDigite o número: ");
            num1 = scan.nextDouble();
 
            System.out.println("\nDigite o outro número: ");
            num2 = scan.nextDouble();
            
            subtracao = num1 - num2;
            
            System.out.printf("\nResultado: %.2f - %.2f = %.2f \n\n", 
                num1, num2, subtracao);

        }
        
        scan.close();
        
    }
}