package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {
	public class TesteSalario {

		public static void main(String[] args) {

			double salario =3000.0;
			boolean foiPromovido = true;

			if (foiPromovido && salario >= 4000.0) {

				System.out.println("Parabens, voce teve uma aumento no salario");
			} else {

				System.out.println("Felizmente nao teve aumento");
			}

			System.out.println("salario = " + foiPromovido);
		}
	}

}
