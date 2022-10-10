//import java.util.Scanner;

public class BaseballGame
{
    //static Scanner teclado = new Scanner(System.in);
    public BaseballTeam[] equipos = new BaseballTeam[2];
    private int numberInings;

    public BaseballGame(int numberInings)
    {
	this.numberInings = numberInings;
	equipos[0] = new BaseballTeam(numberInings);
	equipos[1] = new BaseballTeam(numberInings);
    }
    
    public BaseballGame()
    {
	numberInings = 9;
	
	equipos[0] = new BaseballTeam();
	equipos[1] = new BaseballTeam();
    }
    
    public void setScore(int team, int ining, int score)
    {
	if(ining == 1)
	    equipos[team].setIningScore(ining, score);
	else if(equipos[team].getIningScore(ining - 1) != -1)
	{
	    System.out.println("si paso");
	    equipos[team].setIningScore(ining, score);
	}
	else 
	    System.out.println("Score not recorded, because all ining score before must be setted");
    }
    @Override
    public String toString()
    {
	StringBuilder gameSB = new StringBuilder();

	for(int i = 0; i < 2; i ++)
	{
	    gameSB.append(equipos[i].toString());
	    gameSB.append("\n");
	}

	return gameSB.toString();
    }
}
