package exercicios.exerciciosLoop;

import java.util.Scanner;

/* Ler um valor inteiro (aceitar somente valores entre 1 e 10)
e escrever a tabuada de 1 a 10 do valor lido*/

public class For04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num, tabuada;
        
        System.out.println("Digite um número inteiro de 1 à 10, "
            + "para saber a tabuada:");
        num = scan.nextInt();
        
        if (num <= 0 || num > 10) {
            System.out.println("\nNúmero inválido."
                + "\nO número tem que ser entre 1 e 10"); 
        
        } else {
            System.out.println("\n------ Tabuada do " + num + " ------\n");
        
            for(int i = 0; i<= 10 ; i++){

                tabuada = num * i;

                System.out.println( + num + " x " + i + " = " + tabuada);

            }
            
        }
        
        scan.close();
        
    }
}
