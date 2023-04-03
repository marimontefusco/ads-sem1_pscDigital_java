package exercicios.exerciciosLoop;

/* Projete um programa que imprime na tela os números de 1 a 100, mas:
    a. Sempre que o num for divisível por 3, aparece fizz
    b. Sempre que o num for divisível por 3, aparece buzz
    c. Quando for divisível pelos 2, aparece Fizz Buzz
 */

public class For08 {
    public static void main(String[] args) {
           
        for( int i = 1; i <= 100 ; i++) {
            
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Fizz Buzz");
                
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
                
            } else {
                System.out.println(i);
                
            }
            
        }
        
    }
}
