package composicao;

public class TelefoneDeMentira implements Telefone {

	@Override
	public String ligar(String usuario) {
		// TODO Auto-generated method stub
		return "Ligando de mentira para "+usuario;
	}

}
