import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Conta> banco = new ArrayList<Conta>();
		int operacao = 0;
		while (true) {
			System.out.println("========== Menu ==========");
			System.out.printf("1 - Adicionar conta\n2 - Atualização cadastral\n");
			System.out.printf("3 - Operações bancarias\n4 - Exclusão de conta\n");
			System.out.printf("5 - Listar contas cadastradas\n0 - Encerrar\n");
			operacao = Teclado.lerInteiro("Entre com a opção que deseja: ");
			switch (operacao) {
			case 1:
				cadastrar(banco);
				break;
			case 2:
				atualizar(banco);
				break;
			case 3:
				operacoes(banco);
				break;
			case 4:
				excluir(banco);
				break;
			case 5:
				listar(banco);
				break;
			case 0:
				System.out.println("Encerrando programa...");
				System.exit(0);
				break;
			default:
				System.out.println("Opção invalida! Tente novamente.");
				break;
			}

		}
	}

	private static int busca(ArrayList<Conta> banco, int id) {
		for (int i = 0; i < banco.size(); i++) {
			Conta c = banco.get(i);
			if (c.getIdentificador() == id) {
				return i;
			}
		}
		return -1;
	}

	public static void cadastrar(ArrayList<Conta> banco) { // Conta(String nome, String CPF, int dia, int mes, int ano)
		String nome = Teclado.lerString("Digite o nome do titular: ");
		String cpf = Teclado.lerString("Entre com o CPF do titular: ");
		int dia = Teclado.lerInteiro("Entre com o dia do nascimento do titular: ");
		int mes = Teclado.lerInteiro("Entre com o mes do nascimento do titular: ");
		int ano = Teclado.lerInteiro("Entre com o ano do nascimento do titular: ");
		Conta titular = new Conta(nome, cpf, dia, mes, ano);
		banco.add(titular);
		System.out.printf("Conta Cadastrada com sucesso!\n\n");
	}

	public static void listar(ArrayList<Conta> banco) {
		if (banco.size() == 0) {
			System.out.printf("Banco de dados Vazio!\n\n");
			return;
		}
		for (int i = 0; i < banco.size(); i++) {
			Conta c = banco.get(i);
			c.imprimeCadastro();
			System.out.println("------------------------------------------------------------------");
		}
	}

	public static void excluir(ArrayList<Conta> banco) {
		if (banco.size() == 0) {
			System.out.printf("Banco de dados Vazio!\n\n");
			return;
		}
		int busca = Main.busca(banco, Teclado.lerInteiro("Digite o ID da conta que deseja excluir: "));
		if (busca != -1) {
			banco.remove(busca);
			System.out.println("Conta excluida com sucesso!");
			return;
		}
		System.out.println("ID não encontrado, tente novamente!");
		return;
	}

	public static void atualizar(ArrayList<Conta> banco) {
		if (banco.size() == 0) {
			System.out.printf("Banco de dados Vazio!\n\n");
			return;
		}
		int busca = Main.busca(banco, Teclado.lerInteiro("Digite o ID da conta que deseja alterar: "));
		if (busca != -1) {
			Conta c = banco.get(busca);
			c.setAgencia(Teclado.lerString("Digite a nova agência associada a essa conta: "));
			System.out.println("Agência alterada com sucesso!");
			return;
		}
		System.out.println("ID não encontrado, tente novamente!");
		return;
	}

	public static void operacoes(ArrayList<Conta> banco) {
		if (banco.size() == 0) {
			System.out.printf("Banco de dados Vazio!\n\n");
			return;
		}
		int busca = Main.busca(banco, Teclado.lerInteiro("Digite o ID da conta que deseja movimentar: "));
		if(busca==-1) {
			System.out.println("Conta não encontrada, tente novamente!");
			return;
		}
		while (true) {
			Conta c = banco.get(busca);
			System.out.printf("1 - Deposito\n2 - Saque\n3 - Transferência\n4 - Rendimento\n0 - Voltar ao menu principal\n");
			int opcao = Teclado.lerInteiro("Digite a operação que deseja:");
			switch (opcao) {
			case 1:
				c.deposito(Teclado.lerDouble("Digite o valor que deseja depositar: "));
				break;
			case 2:
				c.saque(Teclado.lerDouble("Digite o valor que deseja sacar: "));
				break;
			case 3:
				int busca2 = busca(banco, Teclado.lerInteiro("Digite o ID da conta que deseja fazer a tranferência:"));
				if(busca2==-1||busca2==busca) {
					System.out.println("Conta não encontrada, tente novamente!");
					return;
				}
				Conta c2 = banco.get(busca2);
				c.transferira(c2, Teclado.lerDouble("Digite o valor que deseja transferir"));
				break;
			case 4:
				c.getRendimento();
				break;
			case 0:
				System.out.println("Retornando ao menu principal");
				return;
			default:
				break;
			}
		}
	}
}