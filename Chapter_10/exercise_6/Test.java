import java.util.Scanner;
public class Test
{
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args)
    {
	BaseballGame g1 = new BaseballGame();
	g1.setScore(0,1,5);
	g1.setScore(1,1,3);

	do{
	    getScore(g1);
	    System.out.println(g1);
	}while(true);
	
    }

    public static void getScore(BaseballGame game)
    {
	int team, ining, score;


	System.out.print("What team?: ");
	team = teclado.nextInt();

	System.out.print("What ining?: ");
	ining = teclado.nextInt();
	
	System.out.print("What score?: ");
	score = teclado.nextInt();

	game.setScore(team, ining, score);
    }
}
