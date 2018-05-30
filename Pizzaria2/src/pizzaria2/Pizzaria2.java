/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria2;

import java.util.ArrayList;
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
        
        
        Pizza pAtum = new PizzaAtum();
        pAtum.preparar();
        pAtum.calcularPreco();
                
        pAtum = new PizzaAtumPremium();
        pAtum.preparar();
              
                
                
        
        
        
//        String resposta = "s";
//        
//        ArrayList<Pizza> pizzas = new ArrayList<>();
//        
//        while(resposta.equals("s")){
//          /*  Pizza p = new Pizza();
//
//            System.out.println("Digite o tamanho da pizza");
//            Scanner sc = new Scanner(System.in);
//
//            p.tamanho = sc.nextLine();
//
//            System.out.println("Digite o recheio");
//            p.recheio = sc.nextLine();
//
//            System.out.println("Digite a massa");
//            p.massa = sc.nextLine();
//            
//            
//            pizzas.add(p);
//
//            System.out.println("Sua pizza sera preparada.");
//            System.out.println("Quer add outra pizza?");
//            resposta = sc.nextLine();*/
//        }
//        
//        Pizzaiolo antonio = new Pizzaiolo();
//        for(Pizza pit : pizzas)
//        {
//            antonio.fazerPizza(pit);
//        }
//        
        
        
    }
    
}
