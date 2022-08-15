package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		// String imutavel, caso queria mudar criar uma nova string
		String nome = "Gabriel"; //Object Literal
		String cpf = "074.634.461-90";
		
		String cpfSemPonto = cpf.replace(".", "");
		String cpfSemCaracteres = cpfSemPonto.replace("-", "");
		System.out.println(cpfSemCaracteres);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Olá, ");
		sb.append("me chamo ");
		sb.append("Gabriel.");
		sb.toString();
		System.out.println(sb);
		//String outro = new String("Outro");  
	}

}
