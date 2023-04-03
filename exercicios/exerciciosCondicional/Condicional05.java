package exercicios.exerciciosCondicional;

import java.util.Scanner;

/* Tendo como dados de entrada a altura e o sexo de uma pessoa, construa 
um programa que calcule seu peso ideal utilizando as seguintes fórmulas:
    a. Homens: Peso ideal = (72,7 * altura) - 58
    b. Mulheres: Peso ideal = (62,1 * altura) - 44,7
*/

public class Condicional05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
                
        double altura;
        //double altura, pesoIdeal;
        char sexo;
        
        System.out.println("Digite sua altura (mts): ");
        altura = scan.nextDouble();
        
        System.out.println("\nDigite seu sexo biológico: ");
        sexo = scan.next().charAt(0);
            //Convertendo entrada pra achar o caractere
                
        //Lógica encadeada:
        if (altura > 2.10) {
            System.out.println("\nDados inconsistentes, tente novamente!");
            
        } else {
            if( sexo == 'f' || sexo == 'F') {
                double pesoIdeal = (62.1 * altura) - 44.7;
            
                System.out.printf("\nSexo Feminino \nPeso ideal: %.2f \n\n", pesoIdeal);
            
            } else if ( sexo == 'm' || sexo == 'M' ){
                double pesoIdeal = (72.7 * altura) - 58.0;
            
                System.out.printf("\nSexo Masculino \nPeso ideal: %.2f \n\n", pesoIdeal);
        
            } else {
                System.out.println("\nDados incorretos, tente novamente!");
        
            }  
            
        }
        
        scan.close();
   
    }
    
}

//java não reconhece variáveis fora do escopo
//string.equals()
//.next() -> pega só a primeira palavra q foi digitada
//.nextLine() -> pega tudo o q foi digitado

//eliminar a comparação (sexo == 'f' || sexo == 'F'):
//nome.ToLowerCase()
//nome.ToUpperCase()

//nome.equalsIgnoreCase(); ->> vê igualdade ignorando o CaseSensitive
//nao importa se a letra é maiuscula ou minuscula

//nao posso usar o switch case pra todos os casos -> ele não é tao genérico
//usar somente nos casos de igualdade -> == ou != td bem,
//mas se for >= ou <=, ele não funciona

