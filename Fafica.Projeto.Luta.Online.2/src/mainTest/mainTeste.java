package mainTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import br.fafica.Luta.Online.Model.Lutador;

public class mainTeste {

	public static void main(String[] args) {
		List<Lutador> listaLutadores = new ArrayList<Lutador>();
		List<Lutador> listaLutadoresFaixaPreta = new ArrayList<Lutador>();

		listaLutadores.get(1);
		
		List<Lutador> arraylist = new ArrayList<Lutador>();

		Lutador lutador1 = new Lutador();
		Lutador lutador2 = new Lutador();
		Lutador lutador3 = new Lutador();
		Lutador lutador4 = new Lutador();
		Lutador lutador5 = new Lutador();
		Lutador lutador6 = new Lutador();
		
		
		lutador1.setId(1);
		lutador2.setId(2);
		lutador3.setId(3);
		lutador4.setId(4);
		lutador5.setId(5);
		lutador6.setId(6);
		
		arraylist.add(lutador1);
		arraylist.add(lutador2);
		arraylist.add(lutador3);
		arraylist.add(lutador4);
		arraylist.add(lutador5);
		arraylist.add(lutador6);
	
		
		Collections.reverse(arraylist);
		
		Collections.shuffle(arraylist);
		
		
		for (Lutador lutador : arraylist) {
			System.out.println(lutador.getId());
			System.out.println(lutador.getNome());
			System.out.println(lutador.getCpf());
		}

		
		List<Integer> arraylist2 = new ArrayList<Integer>();



		arraylist2.add(1);
		arraylist2.add(2);
		arraylist2.add(3);
		arraylist2.add(4);
		arraylist2.add(5);
		arraylist2.add(6);
		arraylist2.add(7);
		arraylist2.add(8);
		arraylist2.add(9);
		arraylist2.add(10);


		System.out.println(arraylist2.toString());
		

		System.out.println(arraylist2.toString());
		Collections.reverse(arraylist2);
		System.out.println(arraylist2.toString());
		Collections.shuffle(arraylist2);
		System.out.println(arraylist2.toString());

		
		

	}
}
