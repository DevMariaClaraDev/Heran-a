package heranca4;

public class Contaespecial extends Conta {

	private int dias;
	private double limite;

	public Contaespecial(String banco, int numeroconta, int agencia, double saldo, int dias, double limite) {
		super(banco, numeroconta, agencia, saldo);
		setDias(dias);
		setLimite(limite);

	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		if (dias > 0)
			this.dias = dias;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		if (limite > 0)
			this.limite = limite;
	}

	public boolean Contalimite(double valor) {
		if (valor <= (getLimite() + getLimite())) {
			setLimite(getLimite() - valor);
			return true;
		}

		return false;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contaespecial [dias=");
		builder.append(dias);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
