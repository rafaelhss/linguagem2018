/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviario;

import java.util.Random;

/**
 *
 * @author Rafael.Soares
 */
public class Aviario {
    public static void main(String[] args){
        System.out.println("Bem vindo ao aviario");
        System.out.println("Adivinhe quem eu sou!");
        Ave ave = novaAve();
        
        System.out.println("Vou voar:");
        ave.voar();
        
        ave.piar();
        
    }

    private static Ave novaAve() {
        int ave = new Random().nextInt(5);
        if(ave == 0)
          return new Pomba();
        if(ave == 1)
          return new Coruja();
        if(ave == 2)
          return new Pavao();
        if(ave == 3)
           return new Cachorro();
        else
          return new Pato();  
    }
}
