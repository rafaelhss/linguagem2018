/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testelista;

import java.util.ArrayList;

/**
 *
 * @author Rafael.Soares
 */
public class TesteLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<>();
        
        lista.add("Joao");
        lista.add("Pedro");
        lista.add("Kennedy");
        lista.add("Silmara");
        
        System.out.println("Esse eh o 2o da lista: " + lista.get(1));
        System.out.println("Temos " + lista.size() + " alunos");
        System.out.println("Todos os alunos:");
        
        int i =0;
        while(i < lista.size()) {
            if(lista.get(i).equals("Kennedy")){
                System.out.println("Boa noite Ken");
            }
            //System.out.println("Aluno: " + lista.get(i));
            i = i + 1;
        }
        System.out.println("De novo!!");
        for(int j = 0; j < lista.size() ; j++ ){
            System.out.println("Aluno: " + lista.get(j));
        }
        
        
        for(String aluno : lista){
            System.out.println("Aluno: " + aluno);
        }
        
    }
    
}
