package ListaSuperMercado;
import java.util.ArrayList;
import java.util.Scanner;

public class PassaProdutos {
	
	public static void main(String[] args) {
		
		// Começo de preparo de dados para utilização
		
		Scanner entrada = new Scanner(System. in);
		String produto = "";
		String sair2 = "sair";
		ArrayList<String> frutas = new ArrayList<>();

		// Final de preparo de dados para utilização	
		
		
		// Começo do laço Enquanto tiver adicionando meus produtos
		
		while(!produto.equals(sair2)){
			System.out.println("Digite o nome do produto ou 'sair' para finalizar ");
			produto = entrada.next();
			
			
			if(!produto.equals(sair2)){ // nao precisava dessa verificação
				
				frutas.add(produto);		
			}
			
		}
		
		// Final do laço Enquanto tiver adicionando meus produtos
		
		
		// Começo do codigo para imprimir os dados na tela
			
			for(String compra : frutas) {
				System.out.println("Seus produtos são: "+compra);
			}
			
			entrada.close();	
			
		// Final do codigo para imprimir os dados na tela	
		
	}
	
	
	
}
