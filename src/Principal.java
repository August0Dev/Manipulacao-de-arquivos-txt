import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws IOException {
		System.out.println("MANIPULADOR DE .TXT\n");

		Scanner teclado = new Scanner(System.in);

		int opcao = 0;

		do {
			System.out.println("1 - Inserir nome do arquivo");
			System.out.println("2 - Exibir todos os nomes do arquivo;");
			System.out.println("3 - Apagar todo arquivo");
			System.out.println("4 - Encerrar\n");

			System.out.println("Qual opção deseja selecionar?");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				Manipula.escreve();
				break;
			case 2:
				Manipula.le();
				break;
			case 3:
				Manipula.deleta();
				break;
			case 4:
				break;
			default:
				System.out.println("A opção selecionada é inválida!");
			}

		} while (opcao != 4);

	}
}