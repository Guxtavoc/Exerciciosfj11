
public class Conta {
	String nome,agencia;
	Data dataAbertura=new Data();
	int numeroConta;
	double saldo;
	public void imprimeCadastro() {
		String data = Data.formataData(this.dataAbertura.dia,this.dataAbertura.mes,this.dataAbertura.ano);
		System.out.printf("Nome do cliente: %s    Cliente desde:%s\nAgência: %s  Conta número: %d\n",this.nome,data,this.agencia,this.numeroConta);
		System.out.printf("Saldo atual: %.2f\n",this.saldo);
	}
	public void saque(double v) {
		this.saldo-=v;
	}
	public void deposito(double v) {
		this.saldo+=v;
	}
	public void mostraSaldo() {
		System.out.println("Saldo atual:"+saldo);
	}
	public void calculaRendimento() {
		System.out.println("O rendimento esperado para esse mês é:"+this.saldo*0.1);
	}
}