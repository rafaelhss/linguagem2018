/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria2;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Rafael.Soares
 */
public class Pizzaiolo {
    
    public static void fazerPizza(Pizza pitssa){
        
        Calendar calendar = Calendar.getInstance();
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        
        if(hours >= 18 && hours <= 23 ){
        /*
            System.out.println("Saindo uma"
                    + "pizza de tamanho " + pitssa.tamanho 
                    + " de " + pitssa.recheio 
                    + " com massa " + pitssa.massa);*/
            System.out.println("Favor pagar R$ " 
                    + pitssa.calcularPreco());
        } else {
            System.out.println("Estamos fechados!");
        }
    }
    
}
