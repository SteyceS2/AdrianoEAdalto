package vetor;

import java.util.Scanner;

public class att {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);

	        
	        String[] nomes = new String[5];

	        System.out.println("Digite 5 nomes:");

	       
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Nome " + (i + 1) + ": ");
	            nomes[i] = ler.nextLine();
	        }

	      
	        System.out.println("\nNomes armazenados no vetor:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
	        }

	    
	        ler.close();
	    }
	

	}


