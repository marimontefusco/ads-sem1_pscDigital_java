package exercicios.exerciciosCondicional;

/* Tendo as variáveis salario, ir e salliq, e considerando os valores da 
tabela, informe se as expressões a, b e c são verdadeiras ou falsas
*/

public class Condicional01 {
    public static void main(String[] args) {
              
        //expressão 1a       
        double salarioA = 100.0, 
               irA = 0.0,
               salLiqA = salarioA - irA;
                       
        if(salLiqA >= 100) {
            System.out.println("1a: Verdadeiro"); 
            
        } else {
            System.out.println("1a: Falso"); 
            
        }
        
        //expressão 1b       
        double salarioB = 200.0, 
               irB = 10.0,
               salLiqB = salarioB - irB;
        
        if(salLiqB < 190) {
            System.out.println("1b: Verdadeiro");  
            
        } else {
            System.out.println("1b: Falso");
            
        }
        
         //expressão 1c       
        double salarioC = 300.0, 
               irC = 15.0,
               salLiqC = salarioC - irC;
        
        if(salLiqC == salarioC + irC) {
            System.out.println("1c: Verdadeiro \n\n"); 
            
        } else {
            System.out.println("1c: Falso \n\n");             
            
        }
        
    }
    
}
