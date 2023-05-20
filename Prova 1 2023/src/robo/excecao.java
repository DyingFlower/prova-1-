package robo;

public class excecao extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public excecao() {
		 super("A condição não foi atendida.");
	}
}