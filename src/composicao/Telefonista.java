package composicao;

import java.util.ArrayList;
import java.util.List;

public class Telefonista {
	List<String> usuarios = new ArrayList<String>();
	private Telefone telefone;

	public Telefonista() {
		telefone = new TelefoneDigital();
	}

	public Telefonista(Telefone telefone) {
		this.telefone = telefone;
	}

	public void adicionarNumero(String usuario) {
		usuarios.add(usuario);

	}

	public String telefonar() {
		String ligacoes = "";
		for (String usuario : usuarios) {
			ligacoes += telefone.ligar(usuario);
			ligacoes += "\n";
		}
		return ligacoes;
	}

}
