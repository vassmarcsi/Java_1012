
public class beolvas_sysErr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = Integer.parseInt(args[0]);
			int b = a / 0;
			System.out.println(b);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.err.println("\nNem adtál meg értéket a tömbnek.");
			System.out.println("\n" + e);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Nullával osztottál!");
			System.out.println("\n" + e);
		} finally {
			System.out.println("Sok a hibád!");
		}

	}

}
