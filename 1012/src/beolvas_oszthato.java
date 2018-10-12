import java.util.Scanner;

public class beolvas_oszthato {

	static Scanner beolvas = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Írj programot, amely beolvas egy egész számot, és eldönti róla, hogy
//		osztható-e 2-vel vagy 3-mal!

		System.out.println("Adj meg egy számot, amiről eldöntöm, hogy osztható-e 2-vel vagy 3-mal: ");
		
		try
		{
			int szam = beolvas.nextInt();
			
			if ((szam % 2 == 0) && (szam % 3 == 0))
				System.out.println("A(z) " + szam + " osztható 2-vel és 3-mal.");
			else if (szam % 2 == 0)
				System.out.println("A(z) " + szam + " osztható 2-vel.");
			else if (szam % 3 == 0)
				System.out.println("A(z) " + szam + " osztható 3-mal.");
			else
				System.out.println("A(z) " + szam + " nem osztható 2-vel és 3-mal sem.");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Nem számot adtál meg.");
		}

	}

}
