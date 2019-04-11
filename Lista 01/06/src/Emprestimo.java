import java.util.Scanner;
public class Emprestimo {
	public static void main(String[] args) {
		
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Informe o seu salário: ");
		float salario = Ler.nextFloat();
		System.out.println("\nAgora informe o valor que deseja receber de empréstimo: ");
		float empres = Ler.nextFloat();
		
		if(empres < (salario*0.3)) {
			System.out.println("Seu emprestimo de "
					+ empres + " foi aceito.");
		}else{
			System.out.println("O valor do empréstimo execedeu os limites possíveis. ");
		}
		
	}
}
