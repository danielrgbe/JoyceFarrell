//import java.util.Scanner;

public class RaceHorse extends Horse
{
	int racesCompleted;

	public void setRacesCompleted(int racesCompleted)
	{
		this.racesCompleted = racesCompleted;
	}

	public int getRacesCompleted()
	{
		return racesCompleted;
	}
	//public static void main(String[] args)
	//{

	//	System.out.println("Hola bash");

	//}
	
	@Override
	public String toString()
	{ 
		StringBuilder raceHorseSB = new StringBuilder();

		raceHorseSB.append(super.toString());
		raceHorseSB.append("Races:");
		raceHorseSB.append(getRacesCompleted());
		raceHorseSB.append("\n");
		return raceHorseSB.toString();
	}
}
