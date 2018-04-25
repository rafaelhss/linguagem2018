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
public class Conta {
    public float saldo;
    public Correntista donoDaConta;
    
    public boolean aplicarTransacao(Transacao tr){
        
        //System.out.println(tr.valor);
        
        if(tr.validar(donoDaConta)){
            if(tr.tipo == 1){//Debito 
                if(saldo >= tr.valor) {
                    saldo = saldo - tr.valor;
                    return true;
                }
            }  else {
                saldo = saldo + tr.valor;
                return true;
            }
        }
        return false;
    }
    
    public void investirPoupanca(float valor, int meses){
        if(valor <= saldo ){
            Investimento inv = new Investimento();
            inv.rentabilidade = (float)1.005;
            inv.valorMinimo = 0;
            saldo = saldo - valor;
            saldo = saldo + inv.aplicar(valor, meses);
        }
    }
    
    public void investirTesouro(float valor, int meses){
        if(valor <= saldo ){
            Investimento inv = new Investimento();
            inv.rentabilidade = (float)1.01;
            inv.valorMinimo = 200;
            saldo = saldo - valor;
            saldo = saldo + inv.aplicar(valor, meses);
        }
    }
    
    
}
