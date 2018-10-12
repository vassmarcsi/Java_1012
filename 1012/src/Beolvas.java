import java.util.InputMismatchException;
import java.util.Scanner;

public class Beolvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner beolvas = new Scanner(System.in);
		
		try 
		{
			System.out.println("Kérek egy számot: ");
			int szam = beolvas.nextInt();
			double eredmeny = (double) 1 / szam;
			System.out.println("A szám reciproka: ");
			System.out.println(eredmeny);
		}
		catch (InputMismatchException e)
		{
			System.out.println("Hibás szám formátum! \n Számot kérek!");
		}
		beolvas.close();

	}

}
