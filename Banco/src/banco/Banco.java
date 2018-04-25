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
        
        mostrarSaldos(corre1);
        mostrarSaldos(corre2);
        
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
       
        mostrarSaldos(corre1);
        mostrarSaldos(corre2);
        
        
        System.out.println("Saldo da conta 1 da rosa apos 12 meses de 100 reais na poupanca");
        corre2.conta1.investirPoupanca(100, 12);
        System.out.println(corre2.conta1.saldo);
        
        System.out.println("Saldo da conta 2 da rosa apos 12 meses de 100 reais na poupanca");
        corre2.conta2.investirPoupanca(100, 12);
        System.out.println(corre2.conta2.saldo);
       
    }
    
    private static void mostrarSaldos(Correntista c){
        System.out.println("Saldo 1 de " + c.nome + ": " + c.conta1.saldo);
        System.out.println("Saldo 2 de " + c.nome + ": " + c.conta2.saldo);
        System.out.println("Saldo Total de " + c.nome + ": " + c.saldoTotal());
        
        System.out.println("---------");
        
    }
    
}
