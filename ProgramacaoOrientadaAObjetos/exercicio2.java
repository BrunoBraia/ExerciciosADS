package empresa;

import java.util.Scanner;

//import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		int valorCorreto = 10000;
		int palpite = 0;
		
		Scanner pal = new Scanner(System.in);
		
		while(palpite != valorCorreto) {
			System.out.println("Quantos soldados Leonidas ira enfrentar?");
			palpite = pal.nextInt();
			if(palpite < 10000) {
				System.out.println("Um pouco mais");
			}
			else if(palpite > 10000) {
				System.out.println("Um pouco menos");
			}
		}
		System.out.println("Exatamente.");
		
	}	
}
