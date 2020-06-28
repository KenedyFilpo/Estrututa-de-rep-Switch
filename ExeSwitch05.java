import java.util.Scanner;

public class ExeSwitch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leitor = new Scanner (System.in);
		
		float price;
		
		int pag;
		
		System.out.println("O preço da etiqueta é");
		
		price=leitor.nextFloat();
		
		System.out.println("Qual seria a forma de pagamento:");
		
		System.out.println("Deseja pagar a vista ou em Cheque com 10% de desconto (1)");
		
		System.out.println("No cartão de crédito a vista tem 5% de desconto (2)");
		
				System.out.println("2x sem juros (3)");
		
		System.out.println("3x com juros de 10% (4)");
		
		pag= leitor.nextInt();
		
		switch (pag) {
		
		case 1:
	    System.out.println("Custará "+(price-(price/100*10)));
	    break;
		case 2:
		System.out.println("Custará "+(price-(price/100*5)));
		break;
		case 3:
		System.out.println("Custará duas parcelas de "+price/2);
		break;
		case 4:
		System.out.println("Custará 3 parcelas de "+(price+(price/100*10))/3);
		break;
		default:
		System.out.println("Oção não disponível.");
		
		}
	
	}
}
