package AvSomativa;

import java.util.Scanner;

public class desafio05 { //nome da classe

	public static void main(String[] args) { // define o método principal que será chamado quando o programa Java for executado

		Scanner ler = new Scanner(System.in); // Scanner serve para scanear as informações que virão a seguir dele
		String garagem[] = new String[7]; //vetor tipo String que guarda as variáveis

		System.out.println("~~~~~~~~~~~~~~~~GARAGEM~~~~~~~~~~~~~~~~"); //exibe o texto

		for (int i =1; i<7; i++) {//representa um loop for que iterará 7 vezes
			
			System.out.println("Informe quais os carros você quer estacionar? "); //Exibe o texto em que o usuário vai ter que informar o nome dos carros
			
			garagem[i] = ler.next(); //é um vetor que é capaz de guardar mais de uma variável
		}

		for(int i=1; i<7; i++) { //representa um loop for que iterará 7 vezes
			System.out.println("O Carro estacionado na vaga " + i + " é: " + garagem[i]); //Mostra quais serão os carros estacionados em determinadas vagas
		}
		ler.close(); //finaliza e limpa o código
	}

}
