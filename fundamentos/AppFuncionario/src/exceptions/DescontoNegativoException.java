package exceptions;

public class DescontoNegativoException extends Exception {

	private static final long serialVersionUID = 1L;

	public DescontoNegativoException(String mensagem) {
		super(mensagem);
	}
}