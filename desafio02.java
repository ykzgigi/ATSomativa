package AvSomativa;

import java.util.Scanner;

public class desafio02 { //é o nome da classe

	public static void main(String[] args) { // define o método principal que será chamado quando o programa Java for executado
		
		Scanner ler = new Scanner(System.in); //o Scanner serve para scanear as informações que virão a seguir dele
		
		
		double area, b, h;  //vetor tipo real que guarda a variável do código
		

		System.out.println("Informe o valor da base do triângulo: "); //exibe o texto escrito
		b = ler.nextDouble(); //guarda um valor

		System.out.println("Informe o valor da altura do triângulo: "); //exibe o texto escrito
		h = ler.nextDouble();  //guarda um valor
		

		area = (b*h)/2; //calcula a area
		

		System.out.println("A Área do triângulo é respectivamente: " +area); //exibe o texto mostrando o resultado da area

		
		ler.close(); //finaliza e limpa o código
	}

}
