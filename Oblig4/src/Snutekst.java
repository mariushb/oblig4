import java.util.Scanner;


public class Snutekst {
	static int antall = 1;
	public static void main (String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		String input;
		System.out.println("Skriv inn en tekst: ");
		input = keyboard.nextLine();
		System.out.println("Gir svaret " + (motsatt(input)));
		System.out.println(antall + " bokstaver");
	}

	public static String motsatt(String tegn){
		if (tegn.length() == 1){
			return tegn;
			}
		antall++;
		return motsatt(tegn.substring(1)) + tegn.charAt(0);
	}
	}
