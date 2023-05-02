package exercicios.exerciciosLoop;

/* Escrever um programa para exibir os números pares de 1 até 50 na tela */

public class While02 {
    public static void main(String[] args) {
        
        //Solução 1:
        System.out.println("\n------------ Versão 1 ------------\n");
        
        int i = 2,
            par = i % 2;
        
        while( i <= 50 && par == 0) {
            
            System.out.println(i);
            
            i++;
            
        }
        
        
        //Solução 2:
        System.out.println("\n------------ Versão 2 ------------\n");
        
        int ii = 0;
        
        while( ii < 50) {
            
            System.out.println(ii += 2);
            
        }

    }
}
