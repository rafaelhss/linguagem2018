/*
Esse arquivo define uma classe. Em java toda classe deve ser declarada em um arquivo com nome identico ao nome da classe
*/
//pacotes sao usados para organizar classes
package exerciciosmetodo;

//A definicao da classe comeca com sua visibilidade, seguida da palavra class e 
//do seu nome.
//Em seguida abre-se uma chave e tudo que aparecer ate que se feche essa chave pertence 'a classe
public class ExerciciosMetodo {

    //esse metodo e' o principal. 
    //Quando pedimos ao netbeans para executar essa classe, esse eh o primeiro 
    //codigo a ser executado
    public static void main(String[] args) {
     
        //Para os exercicios a seguir, considere "seu numero" como os
        //dois ultimos digitos do seu RA
        
        //Exercicio 1
        //utilize o metodo elevaADois para descobrir o quadrado do seu numero
        //exiba metade do resultado na tela usando System.out.println
        
        //Exercicio 2
        //utilize o metodo elevaAN para descobrir o cubo (numero elevado a 3) do seu numero
        //exiba metade do resultado na tela usando System.out.println
        
        //Exercicio 3
        //utilize o metodo elevaAN para descobrir quanto eh o seu numero elevado ao quadrado do seu numero 
        //exiba um terço do resultado na tela usando System.out.println
        
        //Exercicio 4
        //utilize o metodo contaLetras para exibir na tela quantas letras tem no primeiro nome
        
        //Exercicio 5
        //utilize o metodo somaLetras para descobrir qual o somatorio dos numeros correspondentes 
        //'as letras do seu primeiro nome
        
        //Exercicio 6
        //Observe o codigo do metodo numerologia. Entenda o que ele faz.
        //exiba a numerologia do seu nome na tela
        
        System.out.println("Numerologia: " + Texto.numerologia("rafael"));
        
        //Exercicio 7
        //Escreva um metodo que receba 3 inteiros, representando 3 lados de um triangulo e
        //retorne uma string dizendo se ele é equilátero, isósceles ou escaleno. Sendo que:
        //Triângulo Equilátero: possui os 3 lados iguais.
        //Triângulo Isósceles: possui 2 lados iguais.
        //Triângulo Escaleno: possui 3 lados diferentes.
        //Em seguida escreva um codigo que use esse metodo e exiba o resultado na tela
       // String tipo = Numeros.identificaTriangulo2();
       // System.out.println("O tipo de triangulo eh: " + tipo);
        
        
        //Exercicio 8
        //Escreva um metodo que receba um texto correspondente a uma mencao (SS,MS, MM, etc...)
        // e retorne um resultado booleano indicando se a pessoa foi aprovada ou reprovada
       /* String mencao = "MM";
        System.out.println("Aprovado: " + Texto.verificaMencao(mencao));
        
        if(Texto.verificaMencao(mencao)){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
            
        */
        
        //Exercicio 9
        //Escreva um metodo que calcule o peso de uma pessoa dada a gravidade do planeta
        //em que essa pessoa se encontra. O metodo deve receber o peso da pessoa na terra e a gravidade
        // do planeta (valor entre 0 e 2) e deve retornar o peso seguindo a formula:
        // Peso = (Peso na terra / 10 ) * gravidade
        double peso = Numeros.calculaPeso(94, 1.6D);
        System.out.println("o peso eh:" + peso);
        //Exercicio 10
        //Escreva um metodo que receba o peso da pessoa e o nome de um planeta e retorne 
        //o peso da pessoa naquele planeta. A tabela de gravidades eh: Mercurio [0.37]
        // Venus [0.88] Marte [0.38] Jupter [2.64] Saturno[1.15] Urano [1.17]
        //obs: utilize o metodo construido no exercicio 9 para resolver esse exercicio.

        
        //Bonus
        //Escreva um metodo que calcule o seu fatorial. O fatrial de um numero eh a multipicacao desse numero
        //por todos os numeros anteriores a ele ate zero. Fatorial de N eh N * N-1 * N-2 * N-3 ...
        //Fatorial de 5 eh 5 * 4 * 3 * 2 * 1 = 120
        
        
    }
    
    
    
    
    
}
