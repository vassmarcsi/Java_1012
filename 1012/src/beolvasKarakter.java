import java.util.InputMismatchException;
import java.util.Scanner;

public class beolvasKarakter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner beolvas = new Scanner(System.in);

		try {
			System.out.println("Kérek egy karaktert: ");
			char karakter = beolvas.next().charAt(0);
			System.out.println("A karakter: ");
			System.out.println((int) karakter);
		} catch (InputMismatchException e) {
			System.out.println("Hibás szám formátum! \n Számot kérek!");
		}
		beolvas.close();

	}

}
