import java.util.Scanner;

public class calcoliTest {
	public static void main (String[] args){
		//crearo un oggetto scanner
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Qual è il tuo nome?");
		String nome = tastiera.nextLine();
		
		System.out.println("Qual è il tuo cognome?");
		String cognome = tastiera.nextLine();
		
		System.out.println("Quanti anni hai? ");
		int eta = tastiera.nextInt();
		tastiera.nextLine();
		
		System.out.println("Dove vivi? ");
		String citta = tastiera.nextLine();
		
		System.out.println("ciao " + nome + " " + cognome + " hai " + eta + " anni e vivi nella città di " + citta );
	}
}
