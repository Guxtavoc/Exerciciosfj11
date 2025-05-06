//Exercicio 09
public class Data {
	int dia,mes,ano;
	public static String formataData(int dia,int mes,int ano){
		return String.format("%02d/%02d/%d", dia, mes, ano);
	}
	public static boolean VerificaData(int dia,int mes,int ano) {
		if(mes<1 || mes>12 || dia<1 ||dia>31) {
			return false;
		}
		if(mes==2){//Caso para fevereiro...Considerar anos bissextos?
			int max = 28;
			if(ano%4==0 && (ano%100!=0 || ano%400==0)) {
				max = 29;
				System.out.println("é um ano bissexto");//Debug
			}
			if(dia>max) {
				return false;
			}
		}
		if(mes==4 || mes==6 || mes==9 || mes==11) {
			if (dia>30) {
				return false;
			}
		}else {
			if (dia>31) {
				return false;
			}
		}
		return true;
	}
}
