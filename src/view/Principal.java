package view;

import br.edu.fateczl.ArvoreChar.ArvoreChar;
import controller.ArvoreController;

public class Principal {

	public static void main(String[] args) {
		char[] vetor = { 'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K' };
		ArvoreController arvCont = new ArvoreController();

		ArvoreChar arvore = arvCont.insereElemento(vetor);
		try {
			arvore.remove('F');
			arvore.remove('U');
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		arvCont.printElementos(arvore);
	}

}
