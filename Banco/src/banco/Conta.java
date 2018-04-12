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
}
