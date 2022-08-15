package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		// String imutavel, caso queria mudar criar uma nova string
		String nome = "Gabriel"; //Object Literal
		String cpf = "074.634.461-90";
		
		String cpfSemPonto = cpf.replace(".", "");
		String cpfSemCaracteres = cpfSemPonto.replace("-", "");
		System.out.println(cpfSemCaracteres);
		//String outro = new String("Outro");  
	}

}
