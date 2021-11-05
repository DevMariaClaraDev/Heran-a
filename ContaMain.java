package heranca4;

public class ContaMain {

	public static void main(String[] args) {
	
		Contaespecial e = new Contaespecial("Caixa", 5467, 34, 1000, 5, 100);
		
		System.out.println(e.Contalimite(100));
		System.out.println(e);
		
		Contasimples a = new Contasimples("Caixa", 5467, 34, 1000);
		
		System.out.println(a.Depositopoupanca(70));
		System.out.println(a.Saquepoupanca(1001));
		System.out.println(a);
		
		Conta b = new Conta ("Caixa", 5467, 34, 1000);
		
		System.out.println(b.saque(100));
		System.out.println(b.deposito(100));
		System.out.println(b);

	}

}
