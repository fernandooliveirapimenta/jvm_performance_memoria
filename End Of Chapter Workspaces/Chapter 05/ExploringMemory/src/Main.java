
public class Main {

	
	public static void calculate(Integer calcValue) {
		calcValue = calcValue * 100;
	}
	
	public static void main(String[] args) {
		int localValue = 5;
		calculate(localValue);
		System.out.println(localValue);

		final Customer c = new Customer("fefe");
		c.nome = "fe";

		final String t = "f";

		System.out.println(c.nome);

	}

}

class Customer{
	String nome;

	Customer(String nome){
		this.nome = nome;
	}
}
