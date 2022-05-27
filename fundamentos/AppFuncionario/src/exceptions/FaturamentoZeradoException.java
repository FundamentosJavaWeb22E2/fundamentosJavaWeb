package exceptions;

public class FaturamentoZeradoException extends Exception {

	private static final long serialVersionUID = 1L;

	public FaturamentoZeradoException(String mensagem) {
		super(mensagem);
	}
}