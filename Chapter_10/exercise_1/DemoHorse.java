//import java.util.Scanner;

public class DemoHorse 
{
	//static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)
	{
		Horse test1 = new Horse();
		RaceHorse test2 = new RaceHorse();
		
		test1.setColor(Color.WHITE);
		System.out.print(test1);

		System.out.print(test2);
	}
}
