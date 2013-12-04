package mainTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



import br.fafica.Luta.Online.Model.Lutador;

public class mainTeste {

	public static void main(String[] args) {
		

		
		
		List<Lutador> arraylist = new ArrayList<Lutador>();
		
		
		Lutador lutador1 = new Lutador();
		lutador1.setId(1);
		lutador1.setNome("testes");
		
		
		Lutador lutador2 = new Lutador();
		lutador2.setId(2);
		lutador2.setNome("mario");
		
		Lutador lutador3 = new Lutador();
		Lutador lutador4 = new Lutador();
		Lutador lutador5 = new Lutador();
		Lutador lutador6 = new Lutador();
		
		arraylist.add(lutador1);
		arraylist.add(lutador2);
		arraylist.add(lutador3);
		arraylist.add(lutador4);
		arraylist.add(lutador5);
		arraylist.add(lutador6);

		
		
		Collections.reverse(arraylist);
		
		Collections.shuffle(arraylist);
		
	
		for(int i = 0; i < arraylist.size(); i++){
			System.out.println("nome "+arraylist.get(i).getNome());
			System.out.println("id "+arraylist.get(i).getId());
			}
	}
}	

		




