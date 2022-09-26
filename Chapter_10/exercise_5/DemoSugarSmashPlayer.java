//import java.util.Random;
public class DemoSugarSmashPlayer
{
	
	public static void main(String[] args)
	{
		SugarSmashPlayer test1 = new SugarSmashPlayer();
		PremiumSugarSmashPlayer prem = new PremiumSugarSmashPlayer();

		for(int i = 0; i < 500; i++)
		{
			createRandomScores(test1);
			//if(i%10==0)
			//	System.out.println(test1 + "\n");	
		}
		
		System.out.println(test1);	
		System.out.println("Premium");
		for(int i = 0; i < 1000; i++)
		{
			createRandomScores(prem);
			//if(i%10==0)
			//	System.out.println(prem + "\n");	
		}
		
		System.out.println(prem);	
	}

	public static void createRandomScores(SugarSmashPlayer player)
	{
		int randomHS;
		int randomLevel;
		
		randomHS = (int)(Math.random() * 200) + 100;
		randomLevel = (int)(Math.random() *50 ) + 1;	
		player.setHightScore(randomHS, randomLevel);
	}

}
