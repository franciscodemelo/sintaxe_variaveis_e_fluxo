package sintaxe_variaveis_e_fluxo;

public class TestaWhile {
	public static void main(String[] args) {//começo do escopo do programa.

		int contador = 0;
		while (contador <= 10) {
			System.out.println(contador);
			// contador = contador +1
			//contador +=1;
			//Geralmente vai encontar desse jeito mais simplis
			contador++;

		}
		System.out.println(contador);

	}//final do escopo do programa
}