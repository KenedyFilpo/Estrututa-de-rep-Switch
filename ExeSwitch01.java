            import java.util.Scanner;

            public class ExeSwitch01 {

	        public static void main(String[] args) {
		 
            Scanner leitor = new Scanner (System.in);
		
		    int cod;
		
	    	System.out.println("Favor digitar o C�digo do produto:");
		    cod=leitor.nextInt();
		
		    switch (cod)                           {
		
		    case 001:
			System.out.println("� um Parafuso");
			break;
			
		    case 002:
			System.out.println("� um Porca");
			break;
			
		    case 003:
		 	System.out.println("� um Prego");
			break;
			
		    case 004:
			System.out.println("� um Ferramenta");
			break;
			
			default:
			System.out.println("Produto n�o encontrado.");
	}

	}
}
