import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Manipula {
	public static void Write() {
		try {
			System.out.println("Informe o endereço em que deseja criar o arquivo: ");
			endereco = teclado.nextLine();
			System.out.println("Digite o nome do arquivo: ");
			nomeDoArquivo = teclado.nextLine() + ".txt";
			
			File arquivo = new File(endereco + "\\" + nomeDoArquivo); 
			arquivo.createNewFile();															
			
			System.out.println("Arquivo criado com sucesso!");
			
			FileWriter arq = new FileWriter(endereco + "\\" + nomeDoArquivo); 
			PrintWriter grava = new PrintWriter(arq);
			System.out.println("Insira um texto: ");
			texto = teclado.nextLine();
			grava.println(texto);
			grava.close();
			arq.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void Read() {
		
	}
	
	public static void Delete() {
		System.out.println("Informe o endereço do arquivo: ");
		endereco = teclado.nextLine();
		System.out.println("Digite o nome do arquivo: ");
		nomeDoArquivo = teclado.nextLine() + ".txt";
		
		if (arquivo.delete()) {
			System.out.println("Aquivo deletado.");
		}else {
			System.out.println("Arquivo não deletado.");
	}
}
