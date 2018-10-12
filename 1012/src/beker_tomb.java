import java.util.InputMismatchException;
import java.util.Scanner;

public class beker_tomb {
	
	static Scanner beolvas = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Írj programot, amely definiál egy 10 hosszú, integer alaptípusú tömböt, és
//		feltölti a felhasználótól bekért értékekkel! A végén írja ki a vektorelemeket
//		a képernyore!

		try
		{
			int[] szamok = new int[10]; // inicializálás - 10 hosszú tömb
			for (int i = 0; i < szamok.length;i++) 
			{
				System.out.println((i+1)+". szám:");
				szamok[i] = beolvas.nextInt(); // tömbnek értékadás
			}
			
			System.out.println("A számok, amit bekértünk: ");
			for (int i = 0; i < szamok.length; i++) {
				System.out.print(szamok[i]+ ", ");
			}
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println("Nem számot adtál meg!");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("Hiba történt a programban.");
		}
	}

}
