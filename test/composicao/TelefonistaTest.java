package composicao;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelefonistaTest {

	@Test
	public void testarAdicionarUsuario() {
		Telefonista telefonista = new Telefonista();
		telefonista.adicionarNumero("123456");
		telefonista.adicionarNumero("654321");
		String [] usuarios={"123456", "654321"};
		assertArrayEquals( usuarios, telefonista.usuarios.toArray());
	}
	
	
	
	
	@Test
	public void testarTelefonar() {
		
		
		Telefonista telefonista = new Telefonista(new TelefoneDeMentira());
		telefonista.adicionarNumero("123456");
		telefonista.adicionarNumero("654321");
		
		
		String ligacoes= telefonista.telefonar();
		
		String ligacoesEsperadas="Ligando de mentira para 123456";
		ligacoesEsperadas+="\nLigando de mentira para 654321\n";
		assertEquals(ligacoesEsperadas, ligacoes);
	}
	
	

}
