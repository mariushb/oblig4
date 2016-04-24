import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Oppgi antall skiver: ");
		int antall = input.nextInt();
		System.out.println("Gjør følgende:");
		flyttSkive(antall, 'A', 'B', 'C');
	}

	public static void flyttSkive(int antall, char fraTarn, char tilTarn, char auxTarn) {
		if (antall == 1)
			System.out.println("Flytt skive " + antall + " fra " + fraTarn + " til " + tilTarn);
		else {
			flyttSkive(antall - 1, fraTarn, auxTarn, tilTarn);
			System.out.println("Flytt skive " + antall + " fra " + fraTarn + " til " + tilTarn);
			flyttSkive(antall - 1, auxTarn, tilTarn, fraTarn);
		}
	}

}