package mainTest;



import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Model.AcaoCadastrarLutador;
import br.fafica.Luta.Online.Model.Lutador;


public class mainTeste {
  
	public static void main(String[] args) {

		Fachada fachada = Fachada.getInstanceFachada(); 
		
		
		Lutador lutador = new Lutador();
		Lutador lutador2 = new Lutador();
		
		lutador2.setId(2);
		lutador2.setNome("mauricio");
		lutador2.setSexo("masculino");
		lutador2.setFaixa("branca");
		lutador2.setcpf("8888888888");
		
		//lutador.setNome("julia");
		//lutador.setFaixa("amarela");
		//lutador.setSexo("feminino");
		//lutador.setcpf("088999999");
		
		//fachada.controler.editarLutador(lutador2);
		fachada.controler.excluirLutador(lutador2);
		System.out.println(lutador2.getNome());
		
		//Controler controler = new Controler();
		//controler.cadastrarLutador(lutador);
		//Fachada fachada = Fachada.getInstanceFachada();
		//fachada.controler.cadastrarLutador(lutador);
		
	}
}
