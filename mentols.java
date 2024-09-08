//Fazer uma classe em Java que leia um nome (String) do teclado, e depois liste letra por letra, cada letra em uma linha diferente, o nome informado antes. Exemplo:

//Ana Clara fica assim:

//A
//n
//a
//C
//l
//a
//r
//a

//Lembrem que uma String, já é um Array...

import java.util.Scanner;

public class mentols {
   public static void main(String[] args) {
      //criando o input
      Scanner teclado = new Scanner(System.in);

      //pedindo pro usuário escrever
      System.out.println("Digite o nome: ");

      //criando váriavel que recebe o que ele digitou
      String nome = teclado.nextLine();

      //printando o que ele digitou
      System.out.println("Isso que você digitou " + nome);

      for (int i = 0; i <= 1; i++) {
         
      }
      teclado.close();
   } 
}
