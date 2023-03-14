package desafios;

import java.util.Scanner;

/* João é pescador e tem um computador pra controlar seu rendimento diário. 
Toda vez que ele traz um peso de peixe maior do que o estabelecido no regimento 
de pesca do Estado de SP(50kgs), ele deve pagar uma multa de R$4,00 por kilo
excedente. Faça um programa, quando João informar o peso de peixes que trouxe 
no dia, o programa retorne o valor da multa.
*/

public class Condicional06 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double pesoDiario,
               pesoMaxSp = 50.00, 
               multaKg = 4.00,
               multaTotal;
        
        System.out.println("Digite o peso no dia de hoje");
        pesoDiario = scan.nextDouble();
        
        if( pesoDiario < 0){
            System.out.println("\nValor inválido, tente novamente!\n");
            
        } else {
            if ( pesoDiario > pesoMaxSp ){
                multaTotal = ( pesoDiario - pesoMaxSp ) * multaKg;
                
                System.out.printf("\nO peso excedeu o limite máximo estabelecido."
                        + "\nSua multa é de R$ %.2f. \n\n", multaTotal);
            
            } else if ( pesoDiario == pesoMaxSp ){
                System.out.printf("\nO peso ficou exatamente no limite máximo "
                     + "estabelecido. \nVocê não tem multa a pagar! \n\n");
             
            } else if ( pesoDiario <= pesoMaxSp ){
                System.out.println("\nO peso está dentro do limite estabelecido "
                        + "(50,00kgs). \nVocê não tem multa a pagar! \n\n");
            
            } else {
                System.out.println("\nValor inválido, tente novamente!\n");
            
            }
            
        }
          
    }
    
}
