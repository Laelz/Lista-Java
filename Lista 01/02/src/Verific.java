import java.util.Scanner;

public class Verific {

	public static void main(String[] args) {
		
		Scanner Ler = new Scanner(System.in); 
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe um n�mero: ");
			int num = Ler.nextInt();
		
			if(num % 2 == 0) {
				System.out.println(num + " � Par.");
			}else {
				System.out.println(num +" � Impar");
			}
		}
	}
}
