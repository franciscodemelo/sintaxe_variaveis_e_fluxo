package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 20;
		int quantidadePessoas =1;
		boolean acompanhado = quantidadePessoas >=2;	
		
        System.out.println("valor acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado ) {// aqui estou dando uma condicao se menor de idade "e""&&" e nao tiver acomnhado
			System.out.println("seja bem vindo");//se ele for de maior e nao tiver acompanhado "||" porque nao importa se ele ta ou nao companhado 
		}else {
				System.out.println("felizmente nao foi autorizado");
			}

	}

}
