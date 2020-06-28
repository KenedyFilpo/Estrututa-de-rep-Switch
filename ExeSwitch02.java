        import java.util.Scanner;

        public class ExeSwitch02 {

    	public static void main(String[] args) {
		
        Scanner leitor = new Scanner (System.in);
		
		int cod;
		int qnt;
		
		System.out.println("Qual é o produto:");
		
		cod=leitor.nextInt();
		
		System.out.println("Quantas unidades serão compradas:");
		
		qnt=leitor.nextInt();
		
		switch (cod) {
		
		case 100:
		System.out.println("Seu pedido foi de "+qnt+"x Cachorro Quente no valor de "+3.2*qnt+" reais.");
		break;
		
		case 101:
		System.out.println("Seu pedido foi de "+qnt+"x Bauru Simples no valor de "+4.3*qnt+" reais.");
		break;
		
		case 102:
		System.out.println("Seu pedido foi de"+qnt+"x Bauru com Ovo no valor de "+5.5*qnt+" reais.");
		break;
		
		case 103:
		System.out.println("Seu pedido foi de "+qnt+"x Hambúrguer no valor de "+3.2*qnt+" reais.");
		break;
		
		case 104:
		System.out.println("Seu pedido foi de "+qnt+"x Chesseburguer no valor de "+4.3*qnt+" reais.");
		break;
		
		case 105:
		System.out.println("Seu pedido foi de "+qnt+"x Refrigerante no valor de "+4*qnt+" reais.");
		break;
			
		default:
		System.out.println("Código não encontrado.");
		}
		
		
	}

}
