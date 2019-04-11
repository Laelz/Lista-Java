import java.util.Scanner;

public class Funcionarios {
	
	public static void main(String[] args) {
		
		String nome;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = Ler.next();
		
		while(!nome.equals("fim")) {
			System.out.println("Informe seu salário: ");
			float salario = Ler.nextFloat();
		
			if( salario < 500) {
				System.out.println("Seu salário de: "
					+ salario + " recebeu um aumento de: "
					+ (salario*0.2) + " salário final de: "
					+ (salario +(salario*0.2)));
			}else {
				System.out.println("Você não nos padrões para o aumento.");
			}
			System.out.println("Informe seu nome: ");
			nome = Ler.next();
		}
	}
}
