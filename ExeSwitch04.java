import java.util.Scanner;

public class ExeSwitch04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leitor = new Scanner (System.in);
		
		int cod;
		
		float n1, n2, n3;
		
		
		
		System.out.println(" Qual � sua primeira nota:");
		
		n1=leitor.nextFloat();
		
		
		System.out.println(" Qual � sua segunda nota:");
		
		n2=leitor.nextFloat();
		
		
		System.out.println(" Qual � sua terceira nota:");
		
		n3=leitor.nextFloat();
		
		
		System.out.println(" Voc� deseja sua m�dia aritim�tica (1) ou ponderada(2):");
		
		cod=leitor.nextInt();
		
		
		switch (cod) {
		
		case 1:
			
		System.out.println(" Sua m�dia aritimetica � "+(n1+n2+n3)/3);
		
		
		case 2:
			
			System.out.println(" Sua m�dia ponderada � "+((n1*3)+(n2*3)+(n3*4))/3);
		
		
		}
		
				
	}

}

