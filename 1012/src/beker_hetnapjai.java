import java.util.Scanner;

public class beker_hetnapjai {

	static Scanner beolvas = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Készíts programot, amely bekér egy számot, és ha az 1 és 7 között van,
//		kiírja az ahhoz tartozó napot a héten (1 – hétfo, 2 – kedd stb.). A program
//		addig fusson, míg a felhasználó nem üt be egy betut! A megoldáshoz
//		definiálj egy 7 hosszú sztringtömböt. Ha a felhasználó nem megfelelo
//		indexet ad meg, a program írjon ki hibaüzenetet – ehhez kezeld az
//		IndexOutOfBoundsException kivételt!
//		Segítség: sztringtömb: String[] hetNapjai.

		String[] hetNapjai = { "hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap" };
		int index;

		try {
			System.out.println("Adj megy egy számot: ");
			index = beolvas.nextInt();
			System.out.println("A(z) " + index + ". nap a héten a " + hetNapjai[index-1]);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Hibás bevitel, nem megfelelő számot adott meg a felhasználó.");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Egyéb hiba következett be.");
		}

	}

}
