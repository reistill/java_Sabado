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
      System.out.println("Isso que você digitou: " + nome);

      //
      for (int i = 0; i < nome.length(); i++) {
         System.out.println(nome.charAt(i));
      }
      teclado.close();
   } 
}
