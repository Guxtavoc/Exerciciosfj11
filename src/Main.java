
public class Main {
	public static void main(String[] args) {
		Conta f1 = new Conta();
		f1.nome="Gustavo";
		f1.agencia="Banco Roxo";
		f1.numeroConta=456;
		f1.saldo=0f;
		f1.dataAbertura.dia=01;
		f1.dataAbertura.mes=02;
		f1.dataAbertura.ano=2000;
		f1.imprimeCadastro();
		f1.deposito(50f);
		f1.mostraSaldo();
		f1.calculaRendimento();
	}
}
