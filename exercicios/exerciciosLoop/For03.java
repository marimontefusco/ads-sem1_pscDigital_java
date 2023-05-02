package exercicios.exerciciosLoop;

import static java.lang.Integer.*;

/* Fazer um programa para encontrar todos os números pares de 1 à 100 */

public class For03 {
    public static void main(String[] args) {
              
        // Solução 1
        System.out.println("-------- Versão 1 --------");
        
        for (int i = 1; i <= 100; i++) {  
            
            String message = (i % 2 == 0) ? Integer.toString(i) : " " ;
                //passando o i do tipo Integer para String
            
            System.out.println(message);
            
        }
 
        // Solução 2
        System.out.println("-------- Versão 2 --------");
        
        for (int par = 2; par <= 100; par += 2) {
            
            System.out.println(par);
            
        }
 
        //Versão 3
        System.out.println("-------- Versão 3 --------");
        
        int par;
        
        
        for (int ii = 2; ii <= 100; ii += 1) {
            System.out.println(ii);
        }
      
       
    }
} 
