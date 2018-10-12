import java.util.Scanner;

public class beker_tomb3 {

	static Scanner beolvas = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Készíts programot, mely bekér a felhasználótól valahány számot, majd
//		kiszámolja az elemek átlagát, és kiírja, hány szám volt közülük páros. A
//		számok tárolására használj tömböt!
		
		try
		{
			System.out.println("Add meg a tömb hosszát: ");
			int hossz = beolvas.nextInt(); 
			float[] tomb = new float[hossz];
			float osszeg = 0;
			int parosdb = 0;
			
			for (int i = 0; i < hossz; i++) {
				System.out.println((i+1)+". szám: ");
				tomb[i]=beolvas.nextFloat();
				osszeg += tomb[i];
				if (tomb[i] % 2 == 0)
					parosdb++;
			}
			
			System.out.println("A számok átlaga: " + osszeg/hossz);
			System.out.println("A fentiek közül " + parosdb + " szám volt páros.");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hibás bevitel.");
		}
		

		
	}

}
