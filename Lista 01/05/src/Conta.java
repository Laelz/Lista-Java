import java.util.Scanner;
public class Conta {
	
	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Informe a quantidade em Litros que deseja colocar em gasolinha: ");
		float litros = Ler.nextFloat();
		
		System.out.println("Sua conta: \n"
				+ "2 - Refrigerante ---- R$6.00\n"
				+ litros + " Litros de Gasolina ----- R$"
				+ litros*2.50 + "\nTotal: "
				+ " R$" + (6 + litros*2.50));	
		
	}
}
