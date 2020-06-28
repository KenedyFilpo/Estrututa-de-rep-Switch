import java.util.Scanner;

public class ExeSwitch06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner ( System.in);
		
		float s1, s2, df;
		int cargo;
		
		System.out.println("Descubra sobre sua mudança salarial!");
		
		System.out.println("Qual é o seu salário atual:");
		
		s1=leitor.nextFloat();
		
		System.out.println("Qual é o código do seu cargo de acordo a tabela:");
		System.out.println("001 -Diretor");
		System.out.println("002 -Engenheiro");
		System.out.println("003 -Técnico");
		System.out.println("004 -Gerente");
		System.out.println("005 -Analista");
		System.out.println("006 -Coordenador");
		cargo=leitor.nextInt();
		
		switch (cargo) {
		
		case 001:
		System.out.println("Seu salario será de "+(s1+(s1/100*10))+", O antigo salário era "+s1+" a diferença é de "+s1/100*10);
			break;
		case 002:
			System.out.println("Seu salario será de"+(s1+(s1/100*20))+", O antigo salário era "+s1+" a diferença é de "+s1/100*20);
			break;
		case 003:
			System.out.println("Seu salario será de "+(s1+(s1/100*30))+", O antigo salário era "+s1+" a diferença é de "+s1/100*30);
			break;
		case 004:
			System.out.println("Seu salario será de"+(s1+(s1/100*10))+", O antigo salário era "+s1+" a diferença é de "+s1/100*10);
			break;
		case 005:
			System.out.println("Seu salario será de "+(s1+(s1/100*30))+", O antigo salário era "+s1+"a diferença é de "+s1/100*30);
			break;
		case 006:
			System.out.println("Seu salario será de "+(s1+(s1/100*20))+", O antigo salário era"+s1+" a diferença é de "+s1/100*20);
			break;
			default:
			System.out.println("Seu salario será de "+(s1+(s1/100*40))+", O antigo salário era "+s1+" a diferença é de "+s1/100*40);
		}
		
	
	}

}
