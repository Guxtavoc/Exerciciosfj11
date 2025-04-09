
public class Conta {
	private String titular,agencia;
	private Data dataAbertura=new Data();
	private int numeroConta;
	private double saldo=0f;
	private static int identificador = 0;
	Conta(String titular){
		this.titular=titular;
	}
	Conta (){
		this.numeroConta=(int)Math.floor(Math.random() * (1000 - 100 + 1) + 100);
		this.identificador=Conta.setIdentificador();
	}
	private static int setIdentificador() {
		identificador++;
		return identificador;
	}
	public void getIdentificador() {
		System.out.println("O identificador dessa conta é: "+this.identificador);
	}
	public void imprimeCadastro() {
		String data = Data.formataData(this.dataAbertura.dia,this.dataAbertura.mes,this.dataAbertura.ano);
		System.out.printf("Nome do cliente: %s    Cliente desde:%s\nAgência: %s  Conta número: %d\n",this.titular,data,this.agencia,this.numeroConta);
		System.out.printf("Saldo atual: %.2f\n",this.saldo);
	}
	public void saque(double v) {
		if(v>this.saldo) {
			System.out.println("Limite insuficiente!");
			return;
		}
		this.saldo-=v;
	}
	public void deposito(double v) {
		if(v<0) {
			System.out.println("Valor invalido! Tente novamente.");
			return;
		}
		this.saldo+=v;
	}
	public void getSaldo() {
		System.out.println("Saldo atual:"+this.saldo);
	}
	public void getRendimento() {
		System.out.println("O rendimento esperado para esse mês é:"+this.saldo*0.1);
	}
	public void setTitular(String titular) {
		this.titular=titular;
	}
	public void setAgencia(String agencia) {
		this.agencia=agencia;
	}
	public void setData(int dia,int mes,int ano) {
		this.dataAbertura.dia=dia;
		this.dataAbertura.mes=mes;
		this.dataAbertura.ano=ano;
	}
}