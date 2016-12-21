import parte1.*;
import java.util.Scanner;

public class Principal {

    public static void main(String agrs[]) {
        System.out.print("Insira um exercicio [1-6]: ");
        
        switch(new Scanner(System.in).next().charAt(0)) {
            case '1' : 
                new Exercicio1();
                break;
            case '2' :
                new Exercicio2();
                break;
            case '3' :
                new Exercicio3();
                break;
            case '4' :
                new Exercicio4();
                break;
            case '5' :
                new Exercicio5();
                break;
            case '6' :
                new Exercicio6();
                break;
            default :
                System.out.println("Vá mete lá as cenas como deve ser, já não tens idade para isso");
        }
    }
    
}
