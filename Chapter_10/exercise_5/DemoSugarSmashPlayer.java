//import java.util.Random;
public class DemoSugarSmashPlayer
{
	
	public static void main(String[] args)
	{
		SugarSmashPlayer test1 = new SugarSmashPlayer();
		
		for(int i = 0; i < 100; i++)
		{
			createRandomScores(test1);			
			if(i%10==0)
				System.out.println(test1);	
		}
		
		System.out.println(test1);	
	}

	public static void createRandomScores(SugarSmashPlayer player)
	{
		int randomHS;
		int randomLevel;
		
		randomHS = (int)(Math.random() * 10) + 100;
		randomLevel = (int)(Math.random() * 10) + 1;	
		System.out.println("rScore: " + randomHS + " rlevel: " + randomLevel + " ulLevels: " + SugarSmashPlayer.levelsUnlock);
		player.setHightScore(randomHS, randomLevel);
	}

}
