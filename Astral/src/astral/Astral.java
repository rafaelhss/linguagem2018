/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astral;

import java.util.Scanner;

/**
 *
 * @author rafael.soares
 */
public class Astral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        //System.out.println("Digite o nascimento do crush");
        //String mescrush = scanner.nextLine();
        
        System.out.println("Digite seu nome e aperte enter.");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o mes de nascimento.");
        String mes = scanner.nextLine();
        
        
        Pessoa p1 = new Pessoa();
        p1.mes = "marco";

        Pessoa crush = new Pessoa();
        crush.mes = "janeiro";
        
        
        System.out.println("Seu signo eh: " + p1.signo() );

        System.out.println("Sua numerologia: " + p1.numerologia());
        System.out.println("O signo do crush: " + crush.signo());
        
        
        if(p1.combina(crush)){
            System.out.println("deu match");
        } else {
            System.out.println("deu bad");
        }
        
        
        
        
    }
    
    
    
}
