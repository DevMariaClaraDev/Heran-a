package heranca3;

public class ItemMain {

	public static void main(String[] args) {
	
	Item i = new Item (123, "est� em perfeitas condi��es de uso");
	
	System.out.println(i);
	
	Livro a = new Livro (123, "est� em perfeitas condi��es de uso", "Marcio");
	
	System.out.println(a);
	
	Midia b = new Midia (123, "est� em perfeitas condi��es de uso", 3.42f, "gravadora demais");
	
	System.out.println(b);
	
	Cd c  = new Cd (123, "est� em perfeitas condi��es de uso", 3.42f, "gravadora demais", "Laercio", 1, "Top");

	System.out.println(c);
	
	Vhs d = new Vhs (123, "est� em perfeitas condi��es de uso", 3.42f, "gravadora demais", "Dureza");
	
	System.out.println(d);
	
	}

}
