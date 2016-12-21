package parte1;

import java.util.Scanner;

public class Exercicio1 {

    public Exercicio1() {
        
        System.out.print("Deseja a versão easy(1) ou easy v2.0(2): ");
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
        int count = 0;
        
        char[] c  = new char[5];
        
        for(int i = 0; i < 5; i++) {
            System.out.print("Insira apenas um caracter: ");
            c[i] = new Scanner(System.in).next().charAt(0);
            if((int)c[i] > 47 && (int)c[i] < 58) { //TABELA ASCII
                count++;
            }
        }
        
        System.out.println("\nInseriu " + count + " número/s");
    }
    
    private void easyV2() {
    
        int count = 0;
        
        char[] c  = new char[5];
        
        System.out.print("Insira 5 caracteres: ");
        c = new Scanner(System.in).next().toCharArray();
        
        for(int i = 0; i < 5; i++) {
            if((int)c[i] > 47 && c[i] < 58) { //TABELA ASCII
                count++;
            }
        }
        
        System.out.println("\nInseriu " + count + " número/s");
    
    }
    
}
