
public class Conta {
	String nome,dataAbertura;
	int numeroConta, agencia;
	double saldo;
	public void imprimeCadastro() {
		System.out.printf("Nome do cliente: %s    Cliente desde: %s\nNúmero da conta: %d    Agência: %d\n",nome,dataAbertura,numeroConta,agencia);
		System.out.printf("Saldo atual: %.2f\n",saldo);
	}
	public void saque(double v) {
		saldo-=v;
	}
	public void deposito(double v) {
		saldo+=v;
	}
	public void mostraSaldo() {
		System.out.println(saldo);
	}
	public void calculaRendimento() {
		saldo*=1.1;
	}
}