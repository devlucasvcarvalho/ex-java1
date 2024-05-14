//1
public class Funcao01
{

    static int caixaPreta(int a, int) { //Método de classe
           return a*a+b;
     }
    public static void main(String []args){

          int resposta;
          resposta = caixaPreta(3, 5);//3 - Método instânciado
          system.out.print(resposta);
    }
}

// 1 - O Código abaixo recebe dois valores, eleva o primeiro a 2 e o resultado soma com o segundo.

// 2.1 - Public, static, void.

// 2.2 - O código retorna a multilpicação e dois valores.

// 2.3 - Utilizou-se um método de classe caixaPreta, e dentro desse método tem um retorno para a operação de multiplicação e soma.


//2.
public class Funcao02 { 
    static double calcular(double a, double b) {
        double x;
        x = a * a + 2 * a * b + b * b;
        return x;
    }

    public static void main(String[] args) {
        double resposta;
        resposta = calcular(2, 3);  
        System.out.println(resposta);  
    }
}

//1- O objetivo do código é calcular o produto notável de valores recebidos.

//2.1- multiplicação e soma
//2.2- static e public
//2.3 - Usa o método 'calcular'
//3 - O método calcular recebe dois parâmetros a e b, realiza o cálculo a*a + 2*a*b + b*b e retorna o resultado. No método main, você chama esse método com os argumentos 2 e 3, e imprime o resultado na tela.

import java.math.*;

public class Funcao03
  {
    static double calcular(double a, double b){
      double x;

      x = Math.pow (a,2) + 2*a*b + Math.pow(b,2);
      return x;
    }

    public static void main(String []args){

      double resposta;

      resposta = calcular(2, 3);

      system.out.println(resposta);
          }
  }

// 1 - O objetivo do código é calcular e imprimir o resultado da expressão a^2 + 2ab + b^2 , onde a e b são fornecidos como argumentos para o método calcular. O resultado é então impresso no console.

// 2.1 - Neste código, não há modificadores de acesso específicos para os métodos e variáveis.

// 2.2 - O método "calcular" retorna um valor do tipo double, 

// 2.3 - O método "calcular" é estático (static), indicando que pertence à classe Funcao03.

// 3.0 - Os métodos estão sendo instanciados no método main. A função "calcular" é chamada com os argumentos 2 e 3, e o resultado é armazenado na variável resposta, que é então impressa no console.
//4

import java.math.*;

public class Funcao04
{
  static void calcular(double a, double b){

     System.out.println( Math.floor(a/b) );
     System.out.println( Math.ceil(a/b) );

    System.out.println( Math.min(a,b) );
    System.out.print( Math.max(a,b) );
    
    System.out.println( Math.pow(a,b) );
    
    System.out.println( Math.sqrt(a+b) );

    System.out.println( Math.abs(a-b) );

  }

  public static void main(String []args){
    calcular(2, 3);
  }
}
// 1.0 - O objetivo do código é realizar diversos cálculos matemáticos utilizando a classe Math em Java e imprimir os resultados no console.

// 2.1 - Neste código, não há modificadores de acesso específicos para os métodos e variáveis.

// 2.2 - O método "calcular" tem um tipo de retorno void, indicando que não retorna nenhum valor.

// 2.3 - O método "calcular" é estático (static), indicando que pertence à classe Funcao04. O método "main" também é estático (static), pois é o ponto de entrada do programa Java.

// 3.0 - Os métodos estão sendo instanciados no método main. A função calcular é chamada com os argumentos 2 e 3, e os resultados dos cálculos são impressos no console.
//5
 public class Funcao05{

  static boolean nao(boolean p){ 
    return !p;
  }

 public static void main(String []args){ 
  boolean var;

  var = true;
  System.out.println(var);
  System.out.println(nao(var));
  System.out.println(nao(nao(var)));
 }
}
// 1 - O código demonstra o uso de um método para inverter um valor booleano e mostra como essa inversão pode ser aplicada de forma encadeada.

// 2.1 - Public, static, void.

// 2.2 - O código retorna a váriavel !p.

// 2.3 - Foi usado um método de classe nao, onde ele realiza uma operação simples de negação em um valor booleano.


//6
public class Funcao06{
  static void algumasOperacoes(int a, int b, int c){
    int t;

    imprimeValores(a,b,c);

    t=a;
    a=b;
    b=c;
    c=t;

    imprimeValores(a,b,c);
  }
  static void imprimeValores(int a, int b, int c){
    System.out.println("a="+a+",b="+b+",c="+c);
  }
  public static void main(String []args){
    algumasOperacoes(10, 20, 30);
  }
}

// 1 - O código Java fornecido tem como objetivo realizar algumas operações com três variáveis inteiras e imprimir os valores antes e depois dessas operações.

// 2.1 - Public, static, void.

// 2.2 - Se utiliza o método voi, que não retorna nenhum valor.

// 2.3 - Ambos os métodos (algumasOperacoes e imprimeValores) são métodos de classe (métodos estáticos), pois são precedidos pela palavra-chave static. Não há instância específica da classe Funcao06 criada para chamá-los.

// 3 - O método algumasOperacoes é chamado no método principal (main) com argumentos 10, 20, 30. O método imprimeValores é chamado dentro do método algumasOperacoes para imprimir os valores antes e depois das operações.