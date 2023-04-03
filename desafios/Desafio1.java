package exerciciosCondicional;
import java.lang.Integer;

//Calcule e mostre a soma do menor valor inteiro com o maior valor inteiro do Java

public class Desafio1 {
    public static void main(String[] args) {
        
        int minInt, maxInt, soma;
        
        minInt = Integer.MIN_VALUE;
        maxInt = Integer.MAX_VALUE;
        
        soma = minInt + maxInt;
        
        System.out.println("\nA soma do menor inteiro com do maior inteiro no Java é: " + soma);
        System.out.println(minInt + " + " + maxInt + " = " + soma + "\n\n");
       
    }
}
