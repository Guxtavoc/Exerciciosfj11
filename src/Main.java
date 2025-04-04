public class Main {

	public static void main(String[] args) {
		Conta f1 = new Conta();
		f1.nome="Gustavo";
		f1.agencia="Banco SulAmericano";
		f1.numeroConta=456;
		f1.saldo=0f;
		f1.dataAbertura="12/12/2000";
		f1.deposito(50f);//exercicio 2
		f1.mostraSaldo();
		f1.saque(45.2);//exercicio 2
		f1.mostraSaldo();
		f1.calculaRendimento();
		f1.mostraSaldo();
		f1.imprimeCadastro();//Exercicio 3
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.nome = "Gustavo";
		c1.saldo = 100;
		c2.nome = "Gustavo";
		c2.saldo = 100;
		if(c1==c2) {
			System.out.println("São iguais!");
		}
		else{System.out.println("Não são iguais!");//Exercicio 4
		}
		Conta c3 = new Conta();
		c3=c1;
		if(c1==c3) {
			System.out.println("São iguais!");
		}
		else{System.out.println("Não são iguais!");//Exercicio 5
		}
	}
}
