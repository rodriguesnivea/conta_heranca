package heranca_conta;

public class MainC {
	public static void main(String[]args){
		Conta acc1 = new Conta(1001,"Alex",1000.0);
		acc1.saque(200.00);
		System.out.println("Saldo: "  + acc1.getSaldo());
		
		Conta acc2 = new ContaPoupanca(1002,"Maria" , 1000.0, 0.01);
		acc2.saque(200.00);
		System.out.println("Saldo: "  + acc2.getSaldo());
		
		Conta acc3 =  new ContaEmpresarial(1003,"Bob",1000.0, 500.0);
		acc3.saque(200.00);
		System.out.println("Saldo: " + acc3.getSaldo());
		
		Conta x = new Conta(1020, "Alex", 1000.0);
		Conta y = new ContaPoupanca(1023, "Maria", 1000.0, 0.01);
		x.saque(50.0);
		y.saque(50.0);
		
		System.out.println(y.getSaldo());
		System.out.println(x.getSaldo());
		
		
	}

}
