import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Manipula {
	static String endereco, nomeDoArquivo, texto;
	static Scanner teclado = new Scanner(System.in);
	static File arquivo;

	public static void escreve() {

		System.out.println("Digite o nome do arquivo: ");
		nomeDoArquivo = teclado.nextLine() + ".txt";
		System.out.println("Informe o endereço em que deseja criar o arquivo: ");
		endereco = teclado.nextLine() + "\\" + nomeDoArquivo;

		try {
			arquivo = new File(endereco);
			arquivo.createNewFile();

			System.out.println("Arquivo criado com sucesso!\n");

			PrintWriter grava = new PrintWriter(arquivo);
			System.out.println("Insira um texto: ");
			texto = teclado.nextLine();
			grava.println(texto);
			grava.close();
			
			System.out.println("Texto inserido com sucesso!\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void le() throws IOException {
		FileInputStream stream = new FileInputStream(endereco);
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
	}

	public static void deleta() {

		if (arquivo.delete()) {
			System.out.println("Aquivo deletado.\n");
		} else {
			System.out.println("Arquivo não deletado.\n");
		}
	}	
}


