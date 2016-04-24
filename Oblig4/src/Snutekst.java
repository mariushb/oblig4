import java.util.Scanner;


public class Snutekst {
	public static void main (String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		String input;
		System.out.println("Skriv inn en tekst: ");
		input = keyboard.nextLine();
		System.out.println("Gir svaret " + (motsatt(input)));
		
	}

	public static String motsatt(String tegn){
		if (tegn.length() == 1){
			return tegn;
			}
		return motsatt(tegn.substring(1)) + tegn.charAt(0);
	}
	}
