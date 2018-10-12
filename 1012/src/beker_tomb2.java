import java.util.Scanner;

public class beker_tomb2 {

	static Scanner beolvas = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Készíts programot, melyben a definiált tömb hosszát is a felhasználótól
//		kéred be! A tömb float értékeket tartalmazzon. A program számítsa ki a
//		tömb elemeinek összegét, és írja ki azt a képernyore.
		
		try
		{ 
			System.out.println("Add meg a tömb hosszát: ");
			int hossz = beolvas.nextInt(); 
			float[] tomb = new float[hossz];
			float osszeg = 0;
			
			for (int i = 0; i < hossz; i++) {
				System.out.println((i+1)+". szám: ");
				tomb[i]=beolvas.nextFloat();
				osszeg += tomb[i];
			}
			
			System.out.println("A számok összege: " + osszeg);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hibás bevitel.");
		}
		

		
	}

}
