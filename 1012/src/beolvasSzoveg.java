import java.util.Scanner;

public class beolvasSzoveg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner beolvas = new Scanner(System.in);
		System.out.print("Kérek egy szót: ");
		String beolvasottadat = beolvas.nextLine(); // több; next()-tel 1
		System.out.println(beolvasottadat);
		beolvas.close();
	}

}
