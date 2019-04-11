
public class AumentoS {
	
	public static void main(String[] args) {
		Salario novoSalario = new Salario();
	
		novoSalario.setSalario(2000);
		novoSalario.setAumento((float) 0.1);
		
		System.out.println("Salário inicial: "
				+(novoSalario.getSalario()) 
				+ "Novo Salário: "
				+ (novoSalario.getSalario() + (novoSalario.getSalario()*novoSalario.getAumento())));
		
	}

}
