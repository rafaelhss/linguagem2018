/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviario;

/**
 *
 * @author Rafael.Soares
 */
public class Pato implements Ave{

    @Override
    public void voar() {
        System.out.println("Voar em bando, altitude media, curta distancia");
    }

    @Override
    public void piar() {
        System.out.println("Qua Qua QUa");
    }
    
}
