import java.util.Scanner;

public class Funcionarios {
	
	public static void main(String[] args) {
		
		String nome;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = Ler.next();
		
		while(!nome.equals("fim")) {
			System.out.println("Informe seu sal�rio: ");
			float salario = Ler.nextFloat();
		
			if( salario < 500) {
				System.out.println("Seu sal�rio de: "
					+ salario + " recebeu um aumento de: "
					+ (salario*0.2) + " sal�rio final de: "
					+ (salario +(salario*0.2)));
			}else {
				System.out.println("Voc� n�o nos padr�es para o aumento.");
			}
			System.out.println("Informe seu nome: ");
			nome = Ler.next();
		}
	}
}
