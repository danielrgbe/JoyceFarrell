public class DemoPoems
{

	public static void main(String[] args)
	{
		Poem test1 = new Poem("Sobre la tierra", 10000);
		Couplet c1 = new Couplet("Arcadia");
		Limerick l1 = new Limerick("Won't you come to Limerick");
		Haiku h1 = new Haiku("Godparents tokyo");


		System.out.println(test1);
		System.out.println(c1);
		System.out.println(l1);
		System.out.println(h1);
		

	}
}
