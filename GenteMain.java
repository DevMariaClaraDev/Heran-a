package heranca2;

public class GenteMain {

	public static void main(String[] args) {

		Gente i = new Gente("Ana", "Dubai");

		System.out.println(i);

		GenteFisica a = new GenteFisica("Ana", "Dubai", "110.756.534-89", "solteira");

		System.out.println(a);
		
		GenteJuridica s = new GenteJuridica("Ana", "Dubai", "******", "tecnologia");
		
		System.out.println(s);
		
		System.out.print(i.Cadastro());

	}

}
