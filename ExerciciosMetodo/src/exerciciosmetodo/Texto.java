/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosmetodo;

/**
 *
 * @author rafael.soares
 */
public class Texto {
   //Esse metodo conta quantas letras tem uma palavra.
    private static int contaLetras(String texto){
        return texto.length();
    }
    
    //Esse metodo conta quantos algarismos tem um inteiro
    private static int contaAlgarismos(int numero){
        String numeroEmString = Integer.toString(numero);
        int tamanho = numeroEmString.length();
        return tamanho;
    }
    
    //Esse metodo soma as letras de um texto. A letra A corresponde ao numero 10, 
    //a letra B ao 11, a C ao 12 e assim por diante.
    //Ex:  batata  = 11 + 10 + 29 + 10 + 29 + 10 = 99
    //Ex2: batata2 = 11 + 10 + 29 + 10 + 29 +10 + 2 = 101
    //Ex3: ba28 = 11 + 10 + 2 + 8 = 31
    //Ex4: 234 = 2 + 3 + 4 = 9
    private static int somaLetras(String texto) {
        char[] letras = texto.toCharArray();
        int soma = 0;
        for (int i = 0; i < letras.length; i++) {
            soma = soma + Character.getNumericValue(letras[i]);
            
        }
        return soma;
    }
    
    
    //calcula a numerologia do nome da pessoa. A numerologia eh calculada 
    //somando as letras do nome. Se o resultado tiver mais de um algarismo, ele sao somados
    //se esse outro resultado tiver dois algarismos eles tambem sao somados e assim
    // vai ate que o resultado tenha apenas um algarismo
    public static int numerologia(String nome){
        int numerologia;
        numerologia = somaLetras(nome);
        
        int algarismos = contaAlgarismos(numerologia);
        
        while (algarismos > 1){
            String numerologiaEmString = converte(numerologia);
            numerologia = somaLetras(numerologiaEmString);
            algarismos = contaAlgarismos(numerologia);
        }
        
        return numerologia;
    }
    
    //Converte um INT em STRING
    private static String converte(int numero){
        return Integer.toString(numero);
    } 
    
    public static boolean verificaMencao(String mencao){
        
        return mencao.equals("SS") ||
           mencao.equals("MS") ||
           mencao.equals("MM");
        
    }
    
    
}
