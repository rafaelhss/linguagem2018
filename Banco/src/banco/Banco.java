/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Rafael.Soares
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaCorrentista fabrica = new FabricaCorrentista();
        
        Correntista corre1 = fabrica.novo("Maria", 1, 1000, 2000);
        Correntista corre2 = fabrica.novo("Rosa", 1, 500, 1300);
        
        System.out.println("Saldo 1 da Maria:" + corre1.conta1.saldo);
        System.out.println("Saldo 2 da Maria:" + corre1.conta2.saldo);
        System.out.println("Saldo total da Maria:" + corre1.saldoTotal());
        
        System.out.println("");
        
        System.out.println("Saldo 1 da Rosa:" + corre2.conta1.saldo);
        System.out.println("Saldo 2 da Rosa:" + corre2.conta2.saldo);
        System.out.println("Saldo total da Rosa:" + corre2.saldoTotal());
        
        Transacao tx1 = new Transacao();
        tx1.tipo = 1; // DEBITO
        tx1.valor = corre1.conta1.saldo;
        corre1.conta1.aplicarTransacao(tx1);
        
        Transacao tx2 = new Transacao();
        tx2.tipo = 0; //CREDITO
        tx2.valor = tx1.valor;
        corre2.conta2.aplicarTransacao(tx2);
        
        
        Transacao tx3 = new Transacao();
        tx3.tipo = 1; //DEBITO
        tx3.valor = corre2.conta1.saldo;
        corre2.conta1.aplicarTransacao(tx3);
        
        Transacao tx4 = new Transacao();
        tx4.tipo = 0;
        tx4.valor = tx3.valor;
        corre1.conta2.aplicarTransacao(tx4);
       
        System.out.println("Saldo 1 da Maria:" + corre1.conta1.saldo);
        System.out.println("Saldo 2 da Maria:" + corre1.conta2.saldo);
        System.out.println("Saldo total da Maria:" + corre1.saldoTotal());
        
        System.out.println("");
        
        System.out.println("Saldo 1 da Rosa:" + corre2.conta1.saldo);
        System.out.println("Saldo 2 da Rosa:" + corre2.conta2.saldo);
        System.out.println("Saldo total da Rosa:" + corre2.saldoTotal());
        
    }
    
}
