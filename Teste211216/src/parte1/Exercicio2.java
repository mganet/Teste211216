package parte1;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

    public Exercicio2() {
        cimabaixo();
    }
    
    private void cimabaixo() {
        Random rand = new Random();
        
        int num         = rand.nextInt(11),
            numAnterior = 0,
            pontuacao   = 0;
        
        char escolha    = ' ';
        
        System.out.println("O número é: " + num);
        
        do {
            
            numAnterior = num;
           
           System.out.print("O proximo número esta a baixo(b) ou a cima(c): ");
           escolha = new Scanner(System.in).next().charAt(0);
           
           num         = rand.nextInt(11);
           
           System.out.println("O número é: " + num);
           
           if(escolha != 'b' && escolha != 'c') {
               System.out.println("OPÇÃO INVALIDA!!!!");
           } else if(num == numAnterior) { 
               System.out.println("Número igual!!!!");
           } else if(escolha == 'b' && num != numAnterior) {    
               if(num < numAnterior) {
                   pontuacao++;
                   System.out.println("ACERTOU!!!!");
               } else {
                   System.out.println("ERROU!!!!");
                   break;     
               }  
           } else if(escolha == 'c') {
               if(num > numAnterior && num != numAnterior) {
                   pontuacao++;
                   System.out.println("ACERTOU!!!!");
               } else {
                   System.out.println("ERROU!!!!");
                   break;
               }     
           }
            
        } while(true);
        
        System.out.println("Pontuação: " + pontuacao);
    }
}
