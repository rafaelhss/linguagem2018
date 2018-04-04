/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astral;

/**
 *
 * @author rafael.soares
 */
public  class Pessoa {
    public String nome;
    public String mes;
    
    public boolean combina(Pessoa crush){
        return signo().equals(crush.signo());
    }
    
    
    public Integer numerologia(){
        nome = nome.replaceAll(" ", "");

        int resultado;
        do {
            resultado = 0;
            for (int i = 0; i < nome.length(); i++) {
                char c = nome.charAt(i);
                int valor = Character.getNumericValue(c); //retorna o numero correspondente a letra
                if(valor >= 10)
                    valor = valor - 9; //como a contagem comeca com os numeros, a letra A recebe valor 10; assim, subtraimos 9 para que ela seja 1.

                resultado += valor;
            }
            nome = String.valueOf(resultado);
        } while (resultado >= 10);
        
        return resultado;
    }
    
    public String signo(){
        return descobrirSigno(mes);
    }
    
    private String descobrirSigno(String nomemes){
        String signo = "";
        ;
        if(mes.equals("janeiro")){
            signo = "Capricornio";
        }
        if(nomemes.equals("fevereiro")){
            signo = "Aquario";
        }
        if(nomemes.equals("marco")){
            signo = "peixes";
        }
        if(nomemes.equals("abril")){
            signo = "aries";
        }
        if(nomemes.equals("maio")){
            signo = "touro";
        }
        if(nomemes.equals("junho")){
            signo = "gemeos";
        }
        if(nomemes.equals("julho")){
            signo = "cancer";
        }
        if(nomemes.equals("agosto")){
            signo = "leao";
        }
        if(nomemes.equals("setembro")){
            signo = "virgem";
        }
        if(nomemes.equals("outubro")){
            signo = "libra";
        }
        if(nomemes.equals("novembro")){
            signo = "escorpiao";
        }
        if(nomemes.equals("dezembro")){
            signo = "sagitario";
        }
        
        return signo;
    }
    
    
    
}
