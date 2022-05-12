package application;

import java.util.Locale;
import java.util.Scanner;

import entities.EfeitoDoppler;
import entities.RedShift;
import entities.VelocidadeDeEscape;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ESCOLHA UMA OPÇÃO ABAIXO:\n1 - Calclualar a VELOCIDADE DE ESCAPE de um objeto\n2 - Calcular o EFEITO DOPPLER\n3 - Calcular distancia de uma galaxia"
				+ " atraves do RedShift");
		
		
		int option = sc.nextInt();	
		
		switch(option){
		case 1:
			VelocidadeDeEscape vEsc = new VelocidadeDeEscape();
			System.out.print("------------------------------------------------------------------------------------------------------------------\n");
			System.out.print("ATENÇÃO, VALORES DEVEM SER INSERIDOS EM NOTAÇÃO CIENTÍFICA. INSIRA PRIMEIRO O VALOR BASE É DEPOIS A POTENCIA DE 10\n");
			System.out.print("EX: Primeiro dado --> 7.452 (Valor base)\n    Segundo dado --> -11 (Valor do expoente de 10)\n\nSSENDO ASSIM O VALOR INTERPRETADO SERÁ: 7.452x10^-11\n");
			System.out.print("------------------------------------------------------------------------------------------------------------------\n");
			
			System.out.println("Insira o raio(R) do objeto:");
			vEsc.rObjetoBase = sc.nextDouble();
			vEsc.rObjetoExp = sc.nextDouble();
			System.out.println("Insira a massa(M) do objeto:");
			vEsc.mObjetoBase = sc.nextDouble();
			vEsc.mObjetoExp  = sc.nextDouble();
			
			System.out.printf("A velocidade de escape será: v = %.2f m/s",vEsc.vEscape());
			
			break;
			
		case 2:
			EfeitoDoppler eDop = new EfeitoDoppler();
			System.out.print("------------------------------------------------------------------------------------------------------------------\n");
			System.out.print("DESVIO DO COMPRIMENTO DE ONDA (EFEITO DOPPLER) EM DECORRER DO MOVIMENTO ENTRE EMISSOR E OBSERVADOR\n");
			System.out.print("------------------------------------------------------------------------------------------------------------------\n");
			
			//fOb = f*((v+vo)/(v-vf));
			
			System.out.println("Insira o valor da frequencia emitida (Hz)");
			eDop.f = sc.nextDouble();
			System.out.println("Insira o valor da velocidade da onda no meio (m/s)");
			eDop.v = sc.nextDouble();
			System.out.println("Insira a velocidade do observador, use (-) se estiver se movendo em direção oposta a fonte (m/s)");
			eDop.vo = sc.nextDouble();
			System.out.println("Insira a velocidade do emissor, use (-) se estiver se movendo em direção do observador (m/s)");
			eDop.vf = sc.nextDouble();
			
			System.out.printf("A frequencia medida pelo observador será: f' = %.2f Hz",eDop.efeitoDopler());
			
			break;
			
		case 3:
			//RedShift
			RedShift red = new RedShift();
			System.out.println("insira a linha espectral do Ca K: ");
			red.varK = sc.nextDouble();
			System.out.println("insira a linha espectral do Ca H: ");
			red.varH = sc.nextDouble();
			System.out.println("insira a linha espectral do H alpha: ");
			red.varaH = sc.nextDouble();
			System.out.printf("Desvio do calcium K: %.4f\n",red.desvioVermelhoCaK());
			System.out.printf("Desvio do calcium H: %.4f\n",red.desvioVermelhoCaH());
			System.out.printf("Desvio do H alpha: %.4f\n",red.desvioVermelhoHalpha());
			//velocidade da galaxia
			System.out.printf("A velocidade de distanciamento da galaxia é: %.1f m/s\n",red.velocidade());
			//Distancia
			System.out.printf("A galaxia esta entre %.0f e %.0f metros de distancia da Terra\n",red.distanciaPositive(),red.distanciaNegative());
			//Anos Luz
			System.out.printf("A galaxia esta entre %.1f e %.1f Anos Luz de distancia da Terra\n",red.distanciaALPositive(),red.distanciaALNegative());
			//Mpc
			System.out.printf("A galaxia esta entre %.1f e %.1f Mpc de distancia da terra",red.distanciaMpcPositive(),red.distanciaMpcNegative());
			break;
		}
		
		sc.close();
	}

}
