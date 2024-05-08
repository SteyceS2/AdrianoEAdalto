package vetor;

import java.util.Scanner;

public class cv {

		    public static void main(String[] args) {
		        Scanner ler = new Scanner(System.in);

		       
		        int[] valores = new int[5];

		        System.out.println("Digite 5 valores inteiros:");

		      
		        for (int i = 0; i < 5; i++) {
		            System.out.print("Valor " + (i + 1) + ": ");
		            valores[i] = ler.nextInt();
		        }

		       
		        System.out.println("Valores armazenados no vetor:");
		        for (int i = 0; i < 5; i++) {
		            System.out.println("Valor " + (i + 1) + ": " + valores[i]);
		        }

		      
		        ler.close();
		    }
		

	}


