//Exercicio 09
public class Data {
	int dia,mes,ano;
	public static String formataData(int dia,int mes,int ano){
		return String.format("%02d/%02d/%d", dia, mes, ano);
	}
	/*private boolean verificaData(int dia, int mes) {//Não tenho certeza de como realizar essa verificação
		boolean valor;//localDate (outra classe de java) parece resolver essa questão...
		return valor;
	}*/
}
