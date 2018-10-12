import java.util.Scanner;

public class beolvas_mertani {

	static Scanner beolvas = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Írj programot, amely bekér 5 egész számot, és eldönti róluk, hogy mértani
//		sorozatot alkotnak-e!
//		Segítség: mértani sorozatnak nevezzük azt a sorozatot, melyben (a
//		második tagtól) bármely tag és az azt megelozo tag hányadosa állandó; pl.:
//		1 2 4 8 16 32. . . ; 3 9 27 81 243. . . ;7 70 700 7000 70 000. . .
		
		try
		{
			System.out.println("Adj meg 5 számot! Első: ");
			int szam1 = beolvas.nextInt();
			System.out.println("Második: ");
			int szam2 = beolvas.nextInt();
			System.out.println("Harmadik: ");
			int szam3 = beolvas.nextInt();
			System.out.println("Negyedik: ");
			int szam4 = beolvas.nextInt();
			System.out.println("Ötödik: ");
			int szam5 = beolvas.nextInt();
			
			double hanyados = (double) szam2/szam1;

			if (((double)szam3/szam2 == hanyados) && ((double)szam4/szam3 == hanyados) && ((double)szam5/szam4 == hanyados))
				System.out.println("Mértani sorozatot alkotnak a számok.");
			else
				System.out.println("Nem alkotnak mértani sorozatot a számok.");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hibás adatbevitel.");
		}

	}

}
