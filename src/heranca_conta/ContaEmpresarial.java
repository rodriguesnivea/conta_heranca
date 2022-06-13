package heranca_conta;

public class ContaEmpresarial extends Conta{
	private Double limiteEmprestimo;

	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void emprestimo(double quantia){
		if(quantia <= getLimiteEmprestimo()){
			this.deposito(quantia - 10.00);
		}
	}

	@Override
	public void saque(double amount) {
		super.saque(amount);
		this.saldo -= 2.0;
	}
}
