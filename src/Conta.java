
public class Conta {
	String nome,agencia,dataAbertura;
	int numeroConta = 0;
	double saldo = 0;
	public void imprimeCadastro() {
		System.out.printf("Nome do cliente: %s    Cliente desde: %s\nNúmero da conta: %d    Agência: %s\n",this.nome,this.dataAbertura,this.numeroConta,this.agencia);
		System.out.printf("Saldo atual: %.2f\n",this.saldo);
	}
	public void saque(double v) {
		this.saldo-=v;
	}
	public void deposito(double v) {
		this.saldo+=v;
	}
	public void mostraSaldo() {
		System.out.println(this.saldo);
	}
	public void calculaRendimento() {
		this.saldo*=1.1;
	}
}