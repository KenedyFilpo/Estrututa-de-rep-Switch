import java.util.Scanner;

public class ExeSwitch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leitor = new Scanner (System.in);
		
		float price;
		
		int pag;
		
		System.out.println("O pre�o da etiqueta �");
		
		price=leitor.nextFloat();
		
		System.out.println("Qual seria a forma de pagamento:");
		
		System.out.println("Deseja pagar a vista ou em Cheque com 10% de desconto (1)");
		
		System.out.println("No cart�o de cr�dito a vista tem 5% de desconto (2)");
		
				System.out.println("2x sem juros (3)");
		
		System.out.println("3x com juros de 10% (4)");
		
		pag= leitor.nextInt();
		
		switch (pag) {
		
		case 1:
	    System.out.println("Custar� "+(price-(price/100*10)));
	    break;
		case 2:
		System.out.println("Custar� "+(price-(price/100*5)));
		break;
		case 3:
		System.out.println("Custar� duas parcelas de "+price/2);
		break;
		case 4:
		System.out.println("Custar� 3 parcelas de "+(price+(price/100*10))/3);
		break;
		default:
		System.out.println("O��o n�o dispon�vel.");
		
		}
	
	}
}
