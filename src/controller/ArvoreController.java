package controller;

import br.edu.fateczl.ArvoreChar.*;

public class ArvoreController {

	public ArvoreChar insereElemento(char[] vetor) {
		ArvoreChar arvoreChar = new ArvoreChar();
		for (char valor : vetor) {
			arvoreChar.insert(valor);
		}

		return arvoreChar;
	}
	
	public void printElementos(ArvoreChar arvore) {
		try {
			System.out.print("Prefix: ");
			arvore.prefixSearch();
			System.out.println();
			System.out.print("Infix: ");
			arvore.infixSearch();
			System.out.println();
			System.out.print("Postfix: ");
			arvore.postfixSearch();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
