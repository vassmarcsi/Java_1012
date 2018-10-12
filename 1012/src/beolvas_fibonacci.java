import java.util.Scanner;

public class beolvas_fibonacci {

	static Scanner beolvas = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Írj programot, amely bekér 5 egész számot és eldönti róluk, hogy
//		Fibonacci-sorozatot alkotnak-e!
//		Segítség: a Fibonacci-sorozat minden eleme az elozo két elem összege, pl.:
//		5 6 11 17 28 45. . . )

		// tfh.: a felhasználó sorban adja meg a számokat

		try {
			System.out.println("Adj meg 5 számot növekvő sorrendben! Első: ");
			int szam1 = beolvas.nextInt();
			System.out.println("Második: ");
			int szam2 = beolvas.nextInt();
			System.out.println("Harmadik: ");
			int szam3 = beolvas.nextInt();
			System.out.println("Negyedik: ");
			int szam4 = beolvas.nextInt();
			System.out.println("Ötödik: ");
			int szam5 = beolvas.nextInt();

			if ((szam3 == szam1 + szam2) && (szam4 == szam3 + szam2) && (szam5 == szam3 + szam4))
				System.out.println("Fibonacci-sorozatot alkotnak a számok.");
			else
				System.out.println("Nem alkotnak Fibonacci-sorozatot a számok.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hibás adatbevitel.");
		}

	}

}
