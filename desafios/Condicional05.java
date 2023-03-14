package desafios;

import java.util.Scanner;

/* Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um 
programa que calcule seu peso ideal utilizando as seguintes fórmulas:
    a. Homens: Peso ideal = (72,7 * altura) - 58
    b. Mulheres: Peso ideal = (62,1 * altura) - 44,7
*/

public class Condicional05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
                
        double altura, pesoIdeal;
        char sexo;
        
        System.out.println("Digite sua altura (mts): ");
        altura = scan.nextDouble();
        
        System.out.println("\nDigite seu sexo: ");
        sexo = scan.next().charAt(0);
            //Convertendo entrada pra achar o caractere
                
        if (altura > 2.30) {
            System.out.println("\nDados inconsistentes, tente novamente!");
            
        } else {
            if( sexo == 'f' || sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            
            System.out.printf("\nSexo Feminino \nPeso ideal: %.2f \n\n", pesoIdeal);
            
            } else if ( sexo == 'm' || sexo == 'M' ){
            pesoIdeal = (72.7 * altura) - 58.0;
            
            System.out.printf("\nSexo Masculino \nPeso ideal: %.2f \n\n", pesoIdeal);
        
            } else {
            System.out.println("\nDados incorretos, tente novamente!");
        
            }  
            
        }
   
    }
    
}
