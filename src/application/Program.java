package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Formulas;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Formulas form = new Formulas();
		
		System.out.println("ESCOLHA UMA OPÇÃO ABAIXO:\n1 - Calclualar a velocidade de escape de um objeto\n2 - Calcular radiação Hawking de um buraco negro (Em criação)");
		
		
		int option = sc.nextInt();	
		
		switch(option){
		case 1:
			System.out.println("------------------------------------------------------------------------------------------------------------------\n");
			System.out.println("ATENÇÃO, VALORES DEVEM SER INSERIDOS EM NOTAÇÃO CIENTÍFICA. INSIRA PRIMEIRO O VALOR BASE É DEPOIS A POTENCIA DE 10\n");
			System.out.println("EX: Primeiro dado --> 7.452 (Valor base)\n    Segundo dado --> -11 (Valor do expoente de 10)\n\nSSENDO ASSIM O VALOR INTERPRETADO SERÁ: 7.452x10^-11\n");
			System.out.println("------------------------------------------------------------------------------------------------------------------\n");
			
			System.out.println("Insira o raio(R) do objeto:");
			form.rObjetoBase = sc.nextDouble();
			form.rObjetoExp = sc.nextDouble();
			System.out.println("Insira a massa(M) do objeto:");
			form.mObjetoBase = sc.nextDouble();
			form.mObjetoExp  = sc.nextDouble();
			
			System.out.printf("v = %.2f m/s",form.vEscape());
			break;
		case 2:
			System.out.println("em criação");
		}
		
		sc.close();
	}

}
