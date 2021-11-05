package heranca4;

public class Contasimples extends Conta {

	private double saldopoupanca;

	public Contasimples(String banco, int numeroconta, int agencia, double saldo) {
		super(banco, numeroconta, agencia, saldo);

	}


	public double getSaldopoupanca() {
		return saldopoupanca;
	}

	public void setSaldopoupanca(double saldopoupanca) {
		if (saldopoupanca > 0)
		this.saldopoupanca = saldopoupanca;
	}
	
	public boolean Depositopoupanca(double valor) {
		if (valor > 0) {
			setSaldopoupanca(getSaldopoupanca() + valor);
			return true;
		}

		return false;
	}
	
	public boolean Saquepoupanca(double valor) {
		if (valor <= getSaldopoupanca() && valor > 0) {
			setSaldopoupanca(getSaldopoupanca() - valor);
			return true;
		}
		return false;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contasimples [saldopoupanca=");
		builder.append(saldopoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
	


