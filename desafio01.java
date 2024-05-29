package AvSomativa;

import java.util.Scanner;

public class desafio01 { // é o nome da classe

	public static void main(String[] args) { // define o método principal que será chamado quando o programa Java for executado
		
		Scanner ler = new Scanner(System.in); //o Scanner serve para scanear as informações que virão a seguir dele
		
		double a, b, soma, sub, mult, div; //vetor tipo real que guarda a variável do código
		
		
		System.out.println("Informe o primeiro número: ");//exibe o texto escrito
		a = ler.nextDouble(); //guarda um valor
		
		System.out.println("Informe o segundo número: ");//exibe o texto escrito
		b = ler.nextDouble(); // guarda um valor
		
		soma = a+b; //faz a conta de soma 
		sub = a-b; //faz a conta de subtração
		mult = a*b; //faz a conta de multiplicação
		div = a/b; //faz a conta de divisão
		
		System.out.println("O resultado da soma é: " +soma); //exibe o resultado da soma em texto
		
		System.out.println("O resultado da subtração é: " +sub); //exibe o resultado da subtração
		
		System.out.println("O resultado da multiplicação é: " +mult); //exibe o resultado da multiplicação
		
		System.out.println("O resultado da divisão é: " +div); //exibe o resultado da divisão
		
		ler.close(); //finaliza e limpa o código
	}

}
