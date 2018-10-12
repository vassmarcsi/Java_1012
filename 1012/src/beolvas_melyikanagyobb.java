import java.util.InputMismatchException;
import java.util.Scanner;

public class beolvas_melyikanagyobb {

	static Scanner beolvas = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Írj programot, amely bekér 3 egész számot, és eldönti, hogy melyik a
//		legnagyobb! Majd írja ki azt is, hogy igaz-e, hogy mindhárom szám
//		osztható hárommal!

		try {
			System.out.println("Adj meg 3 számot! Első: ");
			int szam1 = beolvas.nextInt();
			System.out.println("Második: ");
			int szam2 = beolvas.nextInt();
			System.out.println("Harmadik: ");
			int szam3 = beolvas.nextInt();
			int max;
			if (szam1 > szam2)
				max = szam1;
			else
				max = szam2;
			if (max < szam3)
				max = szam3;

			System.out.println("A maximum: " + max);
			
			if ((szam1 % 3 == 0) && (szam2 % 3 == 0) && (szam3 % 3 == 0))
				System.out.println("Mindhárom szám osztható 3-mal.");
			else
				System.out.println("Nem osztható mindhárom 3-mal.");

		} 
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Nem 3 számot adtál meg.");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Valami hiba történt.");
		}

	}

}
