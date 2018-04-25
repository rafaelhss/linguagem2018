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
public class Investimento {
    public float rentabilidade;
    public float valorMinimo;
    
    public float aplicar(float valor, int meses){
        float resultado = valor;
        if(valor >= valorMinimo) {
            resultado =  (float)Math.pow(rentabilidade, meses) * valor ;
        }
        return (float) resultado;
    }
    
}
