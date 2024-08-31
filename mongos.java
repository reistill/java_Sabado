import java.util.Scanner;

public class mongos {
    //classe principal
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        //vetor ou lista
        int v[] = new int[3];
        //
        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite o número ["+(i+1)+"]:");
            v[i] = teclado.nextInt();
        }
        teclado.close();

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        //Um for que verifica qual o menor e o maior número 
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
            if (v[i] < menor) 
                menor = v[i];
            if (v[i] > maior)
                maior = v[i];
        }
        //Saída
        System.out.println("Maior número é:" + maior);
        System.out.println("Menor número é:" + menor);
    }
}