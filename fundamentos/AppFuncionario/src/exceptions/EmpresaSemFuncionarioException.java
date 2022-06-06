package exceptions;

public class EmpresaSemFuncionarioException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmpresaSemFuncionarioException(String mensagem) {
		super(mensagem);
	}
}