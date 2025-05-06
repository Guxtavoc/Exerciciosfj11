public class Conta {

	private String titular, agencia;
	public String CPF;
	private PessoaFisica detentor;
	private Data dataAbertura = new Data();
	private int numeroConta;
	private double saldo = 0f;
	private static int identificador = 0;

	Conta(String nome, String CPF, int dia, int mes, int ano) {
		identificador = Conta.setIdentificador();
		this.titular = nome;
		detentor = new PessoaFisica(titular, CPF, dia, mes, ano);
		dataAbertura = Data.getData();
	}
	public void imprimeCadastro() {
		String data = Data.formataData(this.dataAbertura.dia, this.dataAbertura.mes, this.dataAbertura.ano);
		System.out.println("Nome do Cliente: "+detentor.nome+"  || Cliente desde: "+data);
		System.out.println("Agência: "+agencia+"  || Número da conta: "+numeroConta+"  || Saldo: "+saldo);
	}
	private static int setIdentificador() {
		Conta.identificador++;
		return identificador;
	}

	public void getIdentificador() {
		System.out.println("O identificador dessa conta é: " + identificador);
	}


	public void saque(double v) {
		if (v > this.saldo) {
			System.out.println("Limite insuficiente!");
			return;
		}
		this.saldo -= v;
	}

	public void deposito(double v) {
		if (v < 0) {
			System.out.println("Valor invalido! Tente novamente.");
			return;
		}
		this.saldo += v;
	}

	public void getSaldo() {
		System.out.println("Saldo atual:" + this.saldo);
	}

	public void getRendimento() {
		System.out.println("O rendimento esperado para esse mês é:" + this.saldo * 0.1);
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

}