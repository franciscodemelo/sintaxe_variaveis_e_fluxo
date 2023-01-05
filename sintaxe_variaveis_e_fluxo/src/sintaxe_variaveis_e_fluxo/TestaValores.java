package sintaxe_variaveis_e_fluxo;

public class TestaValores {
	
	public static void main(String[] args) {
	
		int primeira= 5;
		int segundo=7;
		segundo = primeira;
		System.out.println(segundo);
		//A segunda variavel  vai receber o valor da variavel prumeira, pois com sinal de igual quer dizer que esta pegando valor 5 para ele.
				
		int primeira1= 5;
		int segundo2=7;
		segundo2 = primeira1;
		primeira1=10;
		System.out.println(segundo2);
		// mesmo tentando atribuir mais numero na primeria variavel ele vai continuar com mesmo valor.
		
	


	}
}
