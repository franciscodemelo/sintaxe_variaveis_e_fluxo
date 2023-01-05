package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 10;
		int quantidadePessoa = 3;

		if (idade >= 18) {
			System.out.println("voce pode entrar");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadePessoa >= 2) {
				System.out.println("voce nao tem 18 mais pode entrar, " + "pois voce esta acompanhado");
			} else {
				System.out.println("felizmente nao foi autorizado");
			}

		}

	}
}
