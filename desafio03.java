package AvSomativa;

import java.util.Scanner;

public class desafio03 { //este é o nome da classe
	public static void main(String[] args) {  // define o método principal que será chamado quando o programa Java for executado

		Scanner ler = new Scanner(System.in); //o Scanner serve para scanear as informações que virão a seguir dele

		int valor; //vetor tipo inteiro que guarda variável do código

		System.out.println("Informe o número do dia da semana: "); //exibir o texto escrito
		valor= ler.nextInt(); //guarda um valor

		if (valor == 1) { //verifica se o valor da variável chamada "valor" é igual a 1
			System.out.println("Domingo"); //aparecerá este texto caso a variável digitada for igual a 1
		}
		else if (valor == 2) { //verifica se o valor da variável chamada "valor" é igual a 2
			System.out.println("Segunda-feira"); //aparecerá este texto caso a variável digitada for igual a 2
		}
		else if (valor == 3) { //verifica se o valor da variável chamada "valor" é igual a 3
			System.out.println("Terça-feira"); //aparecerá este texto caso a variável digitada for igual a 3
		}
		else if (valor == 4) { //verifica se o valor da variável chamada "valor" é igual a 4
			System.out.println("Quarta-feira"); //aparecerá este texto caso a variável digitada for igual a 4
		}
		else if (valor == 5) { //verifica se o valor da variável chamada "valor" é igual a 5
			System.out.println("Quinta-feira"); //aparecerá este texto caso a variável digitada for igual a 5
		}
		else if (valor == 6) { //verifica se o valor da variável chamada "valor" é igual a 6
			System.out.println("Sexta-feira"); //aparecerá este texto caso a variável digitada for igual a 6
		}
		else if (valor == 7) { //verifica se o valor da variável chamada "valor" é igual a 7
			System.out.println("Sábado"); //aparecerá este texto caso a variável digitada for igual a 7
		}
		else { //finaliza o código
			System.out.println("Dia inválido"); //aparece caso o número digitado seja > ou = a 8
		}
		ler.close(); //serve para finalizar e limpar o código
	}
}