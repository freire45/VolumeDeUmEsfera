package br.com.erickfreire.volumedeumaesfera;

import java.util.Scanner;

/**
 * Porgrama em Java que calcula o volume de uma esfera
 * @author Erick Freire
 * @version 1 - Criado em 28-04-2021 as 19:03
 */

public class VolumeDeUmEsfera {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o Raio da esfera: ");
		double raio = entrada.nextDouble();
		
		System.out.printf("O volume é de: %f%n", volumeEsfera(raio));
		
	}
	
	public static double volumeEsfera(double r) {
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
		return volume;
	}

}
