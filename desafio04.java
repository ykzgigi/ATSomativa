package AvSomativa;

import java.util.Scanner;

public class desafio04 { //define o nome da classe

	public static void main(String[] args) {  // define o método principal que será chamado quando o programa Java for executado
		int a[] = new int[15]; //cria uma estrutura de dados chamado "a" que pode armazenar 15 valores inteiros.
		int soma=0; //vetor tipo inteiro que guarda as variáveis

		Scanner ler = new Scanner(System.in); //o Scanner serve para scanear as informações que virão a seguir dele

		for (int i =0; i<15; i++) { //representa um loop for que iterará 15 vezes

			System.out.println("Informe um número " + i+ ".."); //exibe o texto
			a[i]= ler.nextInt(); //guarda um valor

			soma= soma+a[i]; //faz a soma dos números digitados pelo usuário

		}

		System.out.println("A soma dos valores é :" + soma); //exibe o resultado da soma dos números digitados pelo usuário
	}

}





