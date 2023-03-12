package desafios;
import java.lang.Integer;

public class Desafio1 {
    public static void main(String[] args) {
        
        int minInt, maxInt, soma, media;
        
        minInt = Integer.MIN_VALUE;
        maxInt = Integer.MAX_VALUE;
        
        soma = minInt + maxInt;
        media = soma /2;
        
        System.out.println("\nA soma do menor valor inteiro com do maior inteiro no Java é: " + soma);
        System.out.println(minInt + " + " + maxInt + " = " + soma + "\n\n");
        
        System.out.println(media);
       
    }
}
