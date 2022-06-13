package heranca_conta;

public class ContaPoupanca extends Conta {
	
	private double taxaJuro;

	public ContaPoupanca() {
			super();
		}

	public double getTaxaJuro() {
		return taxaJuro;
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, double taxaJuro) {
		super(numero, titular, saldo);
		this.taxaJuro = taxaJuro;
	}
	public void atualizaSaldo(){
		double valorJuros = this.getSaldo()* taxaJuro;
		this.deposito(valorJuros);
	}
	
	@Override
	public void deposito(double amount) {
		this.saldo += amount;
	}
	
	@Override
	public void saque(double amount) {
		this.saldo -= amount;
	}

}	

