
public class Main {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setTitular("Gustavo");
		c1.setAgencia("Banco Roxo");
		c1.setData(01, 02, 2003);
		c1.imprimeCadastro();
		c1.saque(50f);
		c1.deposito(50f);
		c1.getSaldo();
		c1.getRendimento();
		c1.getIdentificador();
		Conta c2 = new Conta();
		c2.getIdentificador();
	}
}
