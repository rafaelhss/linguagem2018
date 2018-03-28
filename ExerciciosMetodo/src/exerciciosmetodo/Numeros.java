/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosmetodo;

import java.util.Scanner;

/**
 *
 * @author rafael.soares
 */
public class Numeros {
  //Esse metodo eleva o numero recebido como parametro a potencia de 2
    //e retorna o resultado
    //elevar a 2 significa multiplicar um numero por ele mesmo, ou seja, calcular seu quadrado
    private static int elevaADois(int base) {
        int resultado;
        resultado = base * base;
        
        return resultado;
    }
    
    //Esse metodo eleva o numero recebido como parametro a potencia de n
    //e retorna o resultado
    //elevar a n significa multiplicar um numero por ele mesmo n vezes
    private static int elevaAN(int base, int expoente) {
        int resultado = base;
        
        for(int i=0; i < expoente - 1; i++){
            resultado = resultado * base;
        }
        
        return resultado;
    }  
    
    
    public static String identificaTriangulo2(){
        
        Scanner sc = new Scanner(System.in);
        int ladoA = sc.nextInt();
        int ladoB = sc.nextInt();
        int ladoC = sc.nextInt();
        
           
        return identificaTriangulo(ladoA, ladoB, ladoC);
    }
    
    private static String identificaTriangulo(int ladoA, 
                                              int ladoB, 
                                              int ladoC){
        if(ladoA == ladoB && 
           ladoB == ladoC){
            return "Equilatero";
        }
        if(ladoA != ladoB && 
           ladoA != ladoC &&
           ladoB != ladoC){
            return "Escaleno";
        }
        
        return "Isoceles";
    } 

    static double calculaPeso(int i, double d) {
        return (i/10) * d;
    }


    
}
