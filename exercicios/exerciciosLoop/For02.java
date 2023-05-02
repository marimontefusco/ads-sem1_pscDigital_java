package exercicios.exerciciosLoop;

import java.util.Scanner;

/* Crie um programa que calcula o fatorial de um número, 
mas o incremento do for deve ser regressivo.
*/

public class For02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num, fatorial = 1;//fatorial não pode ser 0
        
        System.out.println("Digite o número inteiro para saber o fatorial: ");
        num = scan.nextInt();
        
        for(int i = num; i > 0; i--) {
            
            fatorial *= i;
            //fatorial = fatorial * i;
          
        }
        
        System.out.printf("\nFatorial de %d! = %d \n\n", num, fatorial);
        
        scan.close();
        
        /* ex: se num = 5 e fatorial = 1:
        
        int i = num  |  fatorial = fatorial * i   | i--
        
        i = 5 -->>      fatorial = 1 * 5 = 5      | i = 4
        i = 4 -->>      fatorial = 5 * 4 = 20     | i = 3
        i = 3 -->>      fatorial = 20 * 3 = 60    | i = 2
        i = 2 -->>      fatorial = 60 * 2 = 120   | i = 1
        i = 1 -->>      fatorial = 120 * 1 = 120  | i = 0
        i = 0 -->> sai do loop
        */

    }
    
}
