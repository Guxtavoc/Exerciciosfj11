
public class Main {
	public static void main(String[] args) {
		Conta c1 = new Conta("Gustavo", "12345678910", 07, 05, 2007);
		c1.setAgencia("Banco Roxo");
		c1.imprimeCadastro();
		c1.saque(50f);
		c1.deposito(50f);
		c1.getSaldo();
		c1.getRendimento();
		c1.getIdentificador();
	}
}
