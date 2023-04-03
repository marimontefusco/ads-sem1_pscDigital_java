package exercicios.exerciciosCondicional;

/* Sabendo que a = 3, b = 7 e c = 4, 
informe se as expressões abaixo são verdadeiras:
*/

public class Condicional02 {
    public static void main(String[] args) {
        
        int a = 3,
            b = 7,
            c = 4;
        
        //expressão A:
        if ((a + c) > b) {
            System.out.println("A expressão A é verdadeira");
            
        } else {
            System.out.println("A expressão A é falsa");
            
        }
        
        //expressão B:
        if (b >= (a + 2)) {
            System.out.println("A expressão B é verdadeira");
            
        } else {
            System.out.println("A expressão B é falsa");
            
        }
        
        //expressão C:
        if (c == (b - a)) {
            System.out.println("A expressão C é verdadeira");
            
        } else {
            System.out.println("A expressão C é falsa");
        }
       
        //expressão D:
        if ((b + a) <= c) {
            System.out.println("A expressão D é verdadeira");
            
        } else {
            System.out.println("A expressão D é falsa");
        }
        
        //expressão E:
        if ((c + a) > b) {
            System.out.println("A expressão E é verdadeira \n\n");
            
        } else {
            System.out.println("A expressão E é falsa \n\n");
        }
        
    }
    
}
