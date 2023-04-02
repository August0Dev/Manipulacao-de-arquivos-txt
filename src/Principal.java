import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String endereco, nomeDoArquivo;

		System.out.println("Informe o endereço em que deseja criar o arquivo: ");
		endereco = teclado.nextLine();
		System.out.println("Digite o nome do arquivo: ");
		nomeDoArquivo = teclado.nextLine();

		File arquivo = new File(endereco + "\\" + nomeDoArquivo + ".txt");

		try {
			arquivo.createNewFile();
			System.out.println("Arquivo criado com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("a");
		}
	}
}