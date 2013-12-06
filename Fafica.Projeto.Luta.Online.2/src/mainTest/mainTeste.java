package mainTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Model.Lutador;

public class mainTeste {

	public static void main(String[] args) {

		Fachada fachada = Fachada.getInstanceFachada();

		List<Lutador> array = new ArrayList<Lutador>();
		List<Lutador> array2 = new ArrayList<Lutador>();
		
		
		
		array2 = fachada.controler.selecionaTodosOsAtributosDoLutadorPeloID(array);

	}
}	

		




