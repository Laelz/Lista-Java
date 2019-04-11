import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o numero que deseja ver a tabuada: ");
		int tabu = Ler.nextInt();
		
		for(int i = 1; i < 11; i++) {
			System.out.println(tabu +"x"+ i + " = " + (tabu*i));
		}	
	}
}
