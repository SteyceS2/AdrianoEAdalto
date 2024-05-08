package vetor;

import java.util.Scanner;

public class fghjk {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

      
        int[] valores = new int[5];

        System.out.println("Digite 5 valores inteiros:");

       
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = ler.nextInt();
        }

       
        int soma = 0;
        for (int valor : valores) {
            soma += valor;
        }

        
        System.out.println("A soma dos valores é: " + soma);

       
        if (soma > 15) {
            System.out.println("A soma é maior que 15.");
        } else {
            System.out.println("A soma não é maior que 15.");
        }

       
        ler.close();
    }
}