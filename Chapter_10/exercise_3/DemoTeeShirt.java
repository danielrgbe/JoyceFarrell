public class DemoTeeShirt
{

	public static void main(String[] args)
	{
		TeeShirt test1 = new TeeShirt();
		CustomTee test2 = new CustomTee();


		test1.setSize(Size.XXL);		
		System.out.println(test1);
 		test1.setSize(Size.M);
		test1.setColor(Color.BLACK);
		System.out.println(test1);

		System.out.println(test2);
	}
}
