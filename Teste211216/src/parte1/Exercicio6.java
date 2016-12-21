package parte1;

import java.util.Scanner;

public class Exercicio6 {

    public Exercicio6() {
        primos();        
    }
    
    private void primos() {
        int num     = 0,
            count   = 0;
        
        System.out.println("Números PRIMOS");
        
        do{
            System.out.print("Escolha um número: ");
            num = new Scanner(System.in).nextInt();
        } while(num <= 0);
        
        for(int i = 1; i <= num; i++) {
            count = 0;
            for(int x = 1; x <= i; x++) {;
                if(i%x==0) count++;
            }
            
            if(count == 2) System.out.println(i);
        }
    }
    
}
