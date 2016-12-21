package parte1;

import java.util.Scanner;

public class Exercicio5 {

    public Exercicio5() {
        
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
        int array[] = {5,2,7},
            produto = 0;
        
        for(int i = 0; i < 3; i++) {
            produto *= 10;
            produto += array[i];
        }
        System.out.println("Resultado de 5,2,7: " + produto);
    }
    
    private void easyV2() {
        int array[] = new int[10];
        int produto = 0;
        
        for(int i = 0; i < 10; i++) {
            System.out.print("Número " + (i+1) + ": ");
            array[i] = new Scanner(System.in).nextInt();
            produto *= array[i];
            if(i == 0) produto = array[i];
        }
        System.out.println("Produto: " + produto);
    }
    
}
