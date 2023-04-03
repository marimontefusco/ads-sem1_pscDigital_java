package exercicios.exerciciosLoop;

import java.util.Scanner;

/* Leia várias idades e calcule a média entre as idades
(usar uma variável para idade) */

public class For05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int input, idade = 0, somaIdades = 0, media = 0;
        
        System.out.println("Quantas idades serão digitadas?");
        input = scan.nextInt();
        
        for(int i = 0; i < input; i++){
            
            System.out.println("\nDigite a idade: ");
            idade = scan.nextInt();
            
            somaIdades += idade;
            
            media = somaIdades / input;
            
        }
        
        System.out.println("\n--------------\n\nA média das idades é " + media);
        
        scan.close();
        
    }
}
