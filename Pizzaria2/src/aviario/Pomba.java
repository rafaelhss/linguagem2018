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
public class Pomba implements Ave{

    @Override
    public void voar() {
        System.out.println("Voar alto e descer na frente dos carros!");
    }

    @Override
    public void piar() {
        System.out.println("Pru pru pru");
    }
    
}
