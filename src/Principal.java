import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);
		String endereco, nomeDoArquivo, texto;

		System.out.println("Informe o endereço em que deseja criar o arquivo: ");
		endereco = teclado.nextLine();
		System.out.println("Digite o nome do arquivo: ");
		nomeDoArquivo = teclado.nextLine()+".txt";
		texto = teclado.nextLine();
		

		
		
		try {
			File arquivo = new File(endereco + "\\" + nomeDoArquivo); //Cria o arquivo .txt no endereço informado pelo usuário e com o nome informado.			
			arquivo.createNewFile();
			FileWriter arq = new FileWriter(endereco+"\\"+nomeDoArquivo);
			PrintWriter grava = new PrintWriter(arq);
			grava.println(texto);
			grava.close();
			arq.close();
			System.out.println("Arquivo criado com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		}
}