import java.util.Scanner;

public class ExeSwitch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
Scanner leitor = new Scanner (System.in);
		
		int cod;
		
		System.out.println("Digite sua opção no Menu:");
		cod=leitor.nextInt();
		
		switch (cod) {
		case 1:
			System.out.println("Opção 1: Inclusão de Alunos.");
			break;
		case 2:
			System.out.println("Opção 2: Alteração de Alunos.");
			break;
		case 3:
			System.out.println("Opção 3: Exclusão de Alunos.");
			break;
		case 4:
			System.out.println("Opção 4: Consulta de Alunos.");
			break;
			default:
				System.out.println("Opção não identicada.");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

 }}