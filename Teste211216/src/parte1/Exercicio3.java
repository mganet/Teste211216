package parte1;

import java.util.Scanner;

public class Exercicio3 {

    public Exercicio3() {
        
        System.out.print("Deseja a versão easy[Exatamente o que está no enuciado](1) ou easy v2.0(2): ");
        switch(new Scanner(System.in).next().charAt(0)) {
            case '1' : 
                easy();
                break;
            case '2' :
                easyV2();
                break;
            default :
                System.out.println("Vá mete lá as cenas como deve ser");
        }
        
    }
    
    private void easy() {
        double  game1 = 1,
                game2 = 2,
                game3 = 1,
                game4 = 3;
        
        System.out.println("\nMédia de golos: " + (game1+game2+game3+game4)/4);
    }
    
    private void easyV2() {
        double[] thisIsAnArray = new double[4];
        double media = 0;
        for(int i = 0; i < 4; i++) {
            System.out.print("Insira quantos golos marcou no " + (i+1) +"º jogo: ");
            thisIsAnArray[i] = new Scanner(System.in).nextDouble();
            media += thisIsAnArray[i];
        }
        System.out.println("\nMédia de golos: " + media/4);
    }
    
}
