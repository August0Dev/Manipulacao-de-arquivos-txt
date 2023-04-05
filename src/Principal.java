import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		System.out.println("MANIPULADOR DE .TXT\n");
		
		Scanner teclado = new Scanner(System.in);
		String endereco, nomeDoArquivo, texto;
		int opcao;
		
		System.out.println("1 - Inserir nome do arquivo");
		System.out.println("2 - Exibir todos os nomes do arquivo;");
		System.out.println("3 - apagar todo arquivo\n");
		
		System.out.println("Qual opção deseja selecionar?");
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			Manipula.Write();
		}
		else if(opcao == 2) {
			Manipula.Read();
		}
		else if(opcao == 3) {
			Manipula.Delete();
		}
	}
}