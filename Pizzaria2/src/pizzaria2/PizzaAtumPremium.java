/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria2;

/**
 *
 * @author Rafael.Soares
 */
public class PizzaAtumPremium extends PizzaAtum{
    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Usar o Atum do japao!!!");
    }
}
