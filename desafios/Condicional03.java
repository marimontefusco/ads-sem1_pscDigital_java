package desafios;

/* Sabendo que a = 5, b = 4 e c = 3 e d = 6, informe se 
as expressões abaixo são verdadeiras:
    a.(a > c) AND (c <= d)
    b.(a + b) > 10 OR (a + b) == (c + +d)
    c.(a >= c) AND (d >= c)
*/

public class Condicional03 {
    public static void main(String[] args) {
        
        int a = 5, 
            b = 4, 
            c = 3,
            d = 6;
        
        //Expressão a:
        if( a > c && c <= d ) {
            System.out.println("Expressão A é verdadeira");
             
        } else {
            System.out.println("Expressão A é falsa");
            
        }
        
        //Expressão b:
        if ((a + b) > 10 || (a + b) == (c + ++d)) {
            System.out.println("Expressão B é verdadeira");
             
        } else {
            System.out.println("Expressão B é falsa");
            
        }
        
        //Expressão c:
        if (a >= c && d >= c ){
            System.out.println("Expressão C é verdadeira \n\n");
             
        } else {
            System.out.println("Expressão C é falsa \n\n");
            
        }
       
    }
        
}
