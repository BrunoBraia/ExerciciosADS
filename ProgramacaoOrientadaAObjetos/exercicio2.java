package empresa;

import java.util.Scanner;

//import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		int peso;
		double altura;
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite seu Peso e sua altura: ");	
		peso = dados.nextInt();
		altura = dados.nextDouble();
		
		System.out.printf("Peso: %d\n", peso);
		System.out.printf("Altura: %.2f\n", altura);
		
		double imc = peso / (altura * altura);
		
		System.out.printf("Seu IMC é: %.2f", imc);
			
	}	
}
