package heranca4;

public class Conta {
	
	private String banco;
	private int numeroconta;
	private int agencia;
	private double saldo;
	
	public Conta (String banco, int numeroconta, int agencia, double saldo) {
		setBanco(banco);
		setNumeroconta(numeroconta);
		setAgencia(agencia);
		setSaldo(saldo);
		
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		if(banco.length() > 0)
		this.banco = banco;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		if (numeroconta > 0)
		this.numeroconta = numeroconta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0)
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean deposito (double valor) {
		if (valor > 0) {
		setSaldo(getSaldo() + valor);
		return true;
	}

	return false;
}
	
	public boolean saque (double valor) {
		if (valor <= getSaldo()  && valor > 0) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}