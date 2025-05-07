public class Conta {
	
	private static int identificador = 0;
	private String titular, agencia;
	private PessoaFisica detentor;
	private Data dataAbertura = new Data();
	private int numeroConta,ID;
	private double saldo = 0f;

	Conta(String nome, String CPF, int dia, int mes, int ano) {
		ID = Conta.setIdentificador();
		titular = nome;
		detentor = new PessoaFisica(titular, CPF, dia, mes, ano);
		dataAbertura = Data.getData();
		agencia = "Banco roxo";
	}
	public void imprimeCadastro() {
		String data = Data.formataData(this.dataAbertura.dia, this.dataAbertura.mes, this.dataAbertura.ano);
		System.out.println("Nome do Cliente: "+detentor.nome+"  || Cliente desde: "+data);
		System.out.println("ID: "+this.ID+"  || Agência: "+agencia+"  || Número da conta: "+numeroConta+"  || Saldo: "+saldo);
	}
	
	private static int setIdentificador() {
		Conta.identificador++;
		return identificador;
	}

	public int getIdentificador() {
		return this.identificador;
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