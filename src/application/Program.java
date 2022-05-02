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
		
		System.out.println("ESCOLHA UMA OP��O ABAIXO:\n1 - Calclualar a velocidade de escape de um objeto\n2 - Calcular radia��o Hawking de um buraco negro (Em cria��o)");
		
		
		int option = sc.nextInt();	
		
		switch(option){
		case 1:
			System.out.println("------------------------------------------------------------------------------------------------------------------\n");
			System.out.println("ATEN��O, VALORES DEVEM SER INSERIDOS EM NOTA��O CIENT�FICA. INSIRA PRIMEIRO O VALOR BASE � DEPOIS A POTENCIA DE 10\n");
			System.out.println("EX: Primeiro dado --> 7.452 (Valor base)\n    Segundo dado --> -11 (Valor do expoente de 10)\n\nSSENDO ASSIM O VALOR INTERPRETADO SER�: 7.452x10^-11\n");
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
			System.out.println("em cria��o");
		}
		
		sc.close();
	}

}
