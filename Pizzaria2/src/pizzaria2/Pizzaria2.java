/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria2;

import java.util.Scanner;

/**
 *
 * @author Rafael.Soares
 */
public class Pizzaria2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        while(true){
            Pizza p = new Pizza();

            System.out.println("Digite o tamanho da pizza");
            Scanner sc = new Scanner(System.in);

            p.tamanho = sc.nextLine();

            System.out.println("Digite o recheio");
            p.recheio = sc.nextLine();

            System.out.println("Digite a massa");
            p.massa = sc.nextLine();


            Pizzaiolo mario = new Pizzaiolo();

            mario.fazerPizza(p);
        }
        
        
    }
    
}
