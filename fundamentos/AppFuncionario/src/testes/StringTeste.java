package testes;

public class StringTeste {

	public static void main(String[] args) {

		String nome = "Elberth Moraes";		
		System.out.println(nome);
		
		//#1: charAt
		System.out.println(nome.charAt(8));
		
		//#2: toUpperCase
		String nomeUp = nome.toUpperCase();
		System.out.println(nome);
		System.out.println(nomeUp);

		//#3: toLowerCase
		String nomeLow = nome.toLowerCase();
		System.out.println(nome);
		System.out.println(nomeLow);
		
		//#4: equals | equalsIgnoreCase
		System.out.println(nomeUp.equalsIgnoreCase(nomeLow) ? "igual" : "diferente");
		
		//#5: indexOf
		System.out.println(nomeUp.indexOf("e"));
		System.out.println(nome.indexOf("e"));
		System.out.println(nomeLow.indexOf("E"));
		
		//#6: lastIndexOf
		System.out.println(nomeUp.lastIndexOf("e"));
		System.out.println(nome.lastIndexOf("e"));
		System.out.println(nomeLow.lastIndexOf("E"));
		
		//#7: substring
		System.out.println(nome.substring(3));
		System.out.println(nome.substring(8, 14));

		//#8: trim
		String sobrenome = "Moraes ";
		System.out.println("["+sobrenome.trim()+"]");
	}
}