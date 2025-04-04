
public class Main {

	public static void main(String[] args) {
		Conta f1 = new Conta();
		f1.nome="Gustavo";
		f1.agencia=123;
		f1.numeroConta=456;
		f1.saldo=0f;
		f1.dataAbertura="02/04/2025";
		f1.imprimeCadastro();
		f1.deposito(50f);
		f1.mostraSaldo();
		f1.calculaRendimento();
		f1.mostraSaldo();
	}

}
