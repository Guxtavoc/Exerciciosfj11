
public class Main {
	public static void main(String[] args) {
		Conta f1 = new Conta();
		f1.setTitular("Gustavo");
		f1.setAgencia("Banco Roxo");
		f1.setData(01, 02, 2003);
		f1.imprimeCadastro();
		f1.saque(50f);
		f1.deposito(50f);
		f1.getSaldo();
		f1.getRendimento();
	}
}
