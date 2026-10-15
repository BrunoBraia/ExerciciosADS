package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int qtd;
		
		ArrayList <String>  listaNomes = new ArrayList <String>();
		System.out.println("Digite a quantidade de nomes: ");
		
		Scanner teclado = new Scanner(System.in);
		
		qtd = teclado.nextInt();
		String nome;
		
		for(int i = 1; i<=qtd; i++) {
			System.out.printf("Digite o nome %d: ", i);
			nome = teclado.next();
			listaNomes.add(nome);
		}
	
		/*
		for(int i = listaNomes.size()-1; i >= 0; i--) {
			System.out.println(listaNomes.get(i));
		}
		*/
		
		Collections.reverse(listaNomes);
		System.out.println(listaNomes);
		
	}	
}
