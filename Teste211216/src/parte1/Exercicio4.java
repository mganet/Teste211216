package parte1;

import java.util.Scanner;

public class Exercicio4 {

    public Exercicio4() {
        bilhetaria();  
    }
    
    private void bilhetaria() {
        char opc    = ' ';
        int  tshirt = 0,
             ticket = 0;
        
        do {
            System.out.println("Tem camisa offical do clube?\nc - Sim\nn - Não\ns - Sair");
            switch(opc = new Scanner(System.in).next().charAt(0)) {
                case 'c' :
                    tshirt++;
                    ticket++;
                    break;
                case 'n' :
                    ticket++;
                    break;
                case 's' :
                    System.out.println("Bilhetes comprados : " + ticket);
                    System.out.println("Camisas            : " + (tshirt*14));
                    System.out.println("Bilhetes           : " + (ticket*7.5));
                    break;
                default  :
                    System.out.println("Opção inexistente");
            }
        } while(opc!='s');
    }
    
}
